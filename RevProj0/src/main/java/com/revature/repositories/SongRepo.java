package com.revature.repositories;

import com.revature.models.Song;
import com.revature.models.User;
import com.revature.utils.ConnectionUtil;

import java.sql.*;
import java.util.*;

public class SongRepo implements CrudRepository<Song>{

    ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

    //Create
    public Song add(Song a) {
        try (Connection conn = cu.getConnection()) {
            String sql = "insert into songs (title, artist ,genre) values (?, ?, ?) returning *";

            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(a.s);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                a.setTitle(rs.getString("title"));
                a.setArtist(rs.getString("artist"));
                a.setGenre(rs.getString("genre"));
                return a;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Song addSong(String title, String artist, String genre){
        try (Connection conn = cu.getConnection()) {
String sql = "insert into songs (title, artist ,genre) values (?, ?, ?) returning *";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, artist);
            ps.setString(3, genre);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Song song = new Song(rs.getString("title"),
                rs.getString("artist"),
                rs.getString("genre"));
                song.setTitle(rs.getString("title"));
                song.setArtist(rs.getString("artist"));
                song.setGenre(rs.getString("genre"));
                return song;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
//Read
    @Override
    public Song getById(Integer id) {
        try (Connection conn = cu.getConnection()) {

        String sql = "select * from songs where songid = ?";

        PreparedStatement ps = conn.prepareStatement(sql); // Setting up our SQL statement in this way helps prevent SQL Injection Attacks
        ps.setInt(1, id); // parameter Indexes start from 1 (NOT 0)

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Song a = new Song(rs.getString("title"), rs.getString("artist"), rs.getString("genre"));
            a.setId(rs.getInt("songid"));
            a.setTitle(rs.getString("title"));
            a.setArtist(rs.getString("artist"));
            a.setGenre(rs.getString("genre"));

            return a;
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

        return null;
    }

    public Song getByTitle(String title) { try (Connection conn = cu.getConnection()) {

        String sql = "select * from songs where title = ?";

        PreparedStatement ps = conn.prepareStatement(sql); // Setting up our SQL statement in this way helps prevent SQL Injection Attacks
        ps.setString(1, title); // parameter Indexes start from 1 (NOT 0)

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Song a = new Song(rs.getString("title"), rs.getString("artist"), rs.getString("genre"));
            a.setTitle(rs.getString("title"));
            a.setArtist(rs.getString("artist"));
            a.setGenre(rs.getString("genre"));


            return a;
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

        return null;
    }
    //Read
    @Override
    public List<Song> getAll() {
        List<Song> songs = new ArrayList<>();

        try(Connection conn = cu.getConnection()) {

            Statement ps = conn.createStatement(); // Setting up our SQL statement in this way helps prevent SQL Injection Attacks
            // ps.setInt(1, ); // parameter Indexes start from 1 (NOT 0)

            ResultSet resultSet = ps.executeQuery("select * from songs");
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

            return songs;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    @Override
    public List<User> getAllUser() {
        return null;
    }

    //update
    @Override
    public void update(Song song) {
        try (Connection conn = cu.getConnection()) {

            String sql = "update songs set first_name = ?, last_name = ? where id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, song.getId());
            ps.setString(1, song.getArtist());
            ps.setString(2, song.getTitle());
            ps.setString(3, song.getGenre());

            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }




    //delete
    @Override
    public void delete(Integer id) {
        {
        try (Connection conn = cu.getConnection()) {

            String sql = "delete from authors where id = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    }



}
