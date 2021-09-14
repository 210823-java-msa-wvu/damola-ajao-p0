package com.revature.repositories;

import com.revature.models.Platform;
import com.revature.models.User;
import com.revature.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
String sql = "select * from musicproject.songs s inner join musicproject.platform_availability p on s.songid = p.songid";
        try (Connection conn = cu.getConnection()) {
            PreparedStatement ps = conn.prepareStatement(sql);

        }catch (SQLException e) {
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
