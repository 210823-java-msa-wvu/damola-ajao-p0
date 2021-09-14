package com.revature.repositories;

import com.revature.models.Playlist;
import com.revature.models.User;
import com.revature.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
    public Playlist addPlaylist(Integer userid, String playlist_title, Integer Songid ) {
        try (Connection conn = cu.getConnection()) {
            String sql = "insert into playlist ( userid , playlist title , songid) values ( ?, ?, ? );";
            PreparedStatement ps = conn.prepareStatement(sql);
          ps.setInt(1, userid);
          ps.setString(2, playlist_title);
          ps.setInt(3, Songid);
//          ps.executeQuery();
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
