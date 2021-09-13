package com.revature.repositories;

import com.revature.models.User;
import com.revature.utils.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepo implements CrudRepository<User>{

    ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

    @Override
    public User add(User user) {
        return null;
    }

    public Boolean createAUser(User user){
        try (Connection conn = cu.getConnection()) {
String sql = "insert into login_info (userid, username, password, uploader) values ( ?, ?, ?, false);";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,user.getUsername());
            ps.setString(1, user.getPassword());

            return ps.executeUpdate() != 0;

        } catch (SQLException e) {
            e.printStackTrace();
            }
        return false;
    }

    @Override
    public User getById(Integer id) {
        return null;
    }

    @Override
    public List<User> getAll() {
//        List<User> users = new ArrayList<>();
//
//        try(Connection conn = cu.getConnection()){
//
//            String sql = "SELECT * FROM login_info;";
//
//            PreparedStatement ps = conn.prepareStatement(sql);
//
//            //this is wh
//            ResultSet rs = ps.executeQuery();
//
//
//            //this is iterating through the records
//            while(rs.next()) {
//                users.add(
//                        new User(rs.getInt(1), rs.getString(2), rs.getString(3),rs.getBoolean(4))
//                );
//            }
//
//        }catch(SQLException e) {
//            e.printStackTrace();
//        }

        //return users;
        return null;
    }
    public User addUser(String username, String password){

        try(Connection con = cu.getConnection()) {
String sql = "INSERT INTO login_info ( username, password, uploader) values ( ?, ?,false);";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);

            ResultSet result = ps.executeQuery();

            if(result.next()){
                User user = new User();
                user.setUsername(username);
                user.setPassword(password);

                return user;
            }
        }
        catch(SQLException e){

        }
        return null;
    }

    public User getByUsername(String username) {

        try (Connection conn = cu.getConnection()) {

            String sql = "select * from login_info where username = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,username);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                User u = new User(
                        rs.getInt("userid"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getBoolean("uploader")
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
    public List<User> getAllUser() {
        List<User> users = new ArrayList<>();

        try(Connection conn = cu.getConnection()){

            String sql = "SELECT * FROM login_info;";

            PreparedStatement ps = conn.prepareStatement(sql);

            //this is wh
            ResultSet rs = ps.executeQuery();


            //this is iterating through the records
            while(rs.next()) {
                users.add(new User(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getBoolean(4))
                );
            }

        }catch(SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void delete(Integer id) {

    }
}