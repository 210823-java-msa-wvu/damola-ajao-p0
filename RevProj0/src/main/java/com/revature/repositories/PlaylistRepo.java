package com.revature.repositories;

import com.revature.models.Playlist;
import com.revature.models.User;
import com.revature.utils.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlaylistRepo implements CrudRepository<Playlist> {

    ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

    //Create
    @Override
    public Playlist add(Playlist playlist) {

//        try (Connection conn = cu.getConnection()) {
//
//            String sql = "insert into Playlist values (default, ?, ?) returning *";
//
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, a.getFirstName());
//            ps.setString(2, a.getLastName());
//
//            ResultSet rs = ps.executeQuery();
//
//            if (rs.next()) {
//                a.setId(rs.getInt("id"));
//                return a;
//            }
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
        return null;
    }
    public Playlist addPlaylist(Integer userid, String playlistTitle, Integer songid ) {
        try (Connection conn = cu.getConnection()) {
String sql = "insert into playlist ( userid , playlistname , songid) values ( ?, ?, ? ) returning *";
        PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1, userid);
          ps.setString(2, playlistTitle);
          ps.setInt(3, songid);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                Playlist playlist = new Playlist(
                        rs.getInt("userid"),
                        rs.getString("playlistname"),
                        rs.getInt("songid"));
                playlist.setTitle(playlistTitle);
                playlist.setSong(playlist.getSong());
                return playlist;

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //Read
    @Override
    public Playlist getById(Integer id) {
        return null;
    }

    public Playlist getPlayByTitle(String title) {
        try (Connection conn = cu.getConnection()) {
            String sql = "select * from playlist where playlist title = ? ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, title);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Playlist> getAll() {
        List<Playlist> playlists = new ArrayList<>();

        try(Connection conn = cu.getConnection()) {

            Statement ps = conn.createStatement(); // Setting up our SQL statement in this way helps prevent SQL Injection Attacks
            // ps.setInt(1, ); // parameter Indexes start from 1 (NOT 0)

            ResultSet resultSet = ps.executeQuery("select * from playlist");
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

            return playlists;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    //Update
    @Override
    public void update(Playlist playlist) {

    }

    //Delete
    @Override
    public void delete(Integer id) {

    }
}
