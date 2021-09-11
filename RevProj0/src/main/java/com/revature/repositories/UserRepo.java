package com.revature.repositories;

import com.revature.models.User;
import com.revature.utils.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserRepo implements CrudRepository<User>{

    ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

    @Override
    public User add(User user) {
        return null;
    }

    @Override
    public User getById(Integer id) {
        return null;
    }

    public User getByUsername(String username) {

        try (Connection conn = cu.getConnection()) {

            String sql = "select * from login_info where Username = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,username);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                User u = new User(
                        rs.getInt("UserId"),
                        rs.getString("Username"),
                        rs.getString("Password"),
                        rs.getBoolean("Uploader")
                );
                return u;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // try-with-resources - automatically closes resources after execution
//        finally {
//            conn.close();
//        }

        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Integer id) {

    }
}