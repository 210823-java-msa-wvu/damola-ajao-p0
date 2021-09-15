package com.revature.repositories;

import com.revature.models.Platform;
import com.revature.models.User;
import com.revature.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlatformRepo implements CrudRepository<Platform> {

    ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

    //Create
    @Override
    public Platform add(Platform platform) {
        return null;
    }

    public Platform addPlatform(Integer songid, Boolean itunes, Boolean youtube_music,
                                Boolean soundcloud, Boolean spotify, Boolean youtube_rip ){
        try (Connection conn = cu.getConnection()) {
String sql = "insert into platform_availability (songid, itunes ,youtube_music, soundcloud,spotify,youtube_rip) values (?,?,?,?,?,?);";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, songid);
        ps.setBoolean(2, itunes);
        ps.setBoolean(3, youtube_music);
        ps.setBoolean(4, soundcloud);
        ps.setBoolean(5, spotify);
        ps.setBoolean(6, youtube_rip);
    } catch (SQLException e) {
        e.printStackTrace();
    }
        return null;
    }

    //Read
    @Override
    public Platform getById(Integer id) {
        return null;
    }

    @Override
    public List<Platform> getAll() {
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    public List<Platform> returnAll(){
        List<Platform> platforms = new ArrayList<>();

        try(Connection conn = cu.getConnection()) {

            Statement ps = conn.createStatement(); // Setting up our SQL statement in this way helps prevent SQL Injection Attacks
            // ps.setInt(1, ); // parameter Indexes start from 1 (NOT 0)

            ResultSet resultSet = ps.executeQuery("select * from musicproject.songs s\n" +
                    "inner join musicproject.platform_availability p\n" +
                    "on s.songid = p.songid ");
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (resultSet.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = resultSet.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }

            return platforms;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    //Update
    @Override
    public void update(Platform platform) {

    }

    //Delete
    @Override
    public void delete(Integer id) {

    }
}
