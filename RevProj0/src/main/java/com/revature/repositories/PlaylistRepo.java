package com.revature.repositories;

import com.revature.models.Playlist;
import com.revature.models.User;

import java.util.List;

public class PlaylistRepo implements CrudRepository<Playlist> {
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

    //Read
    @Override
    public Playlist getById(Integer id) {
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
