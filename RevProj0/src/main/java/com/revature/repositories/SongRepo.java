package com.revature.repositories;

import com.revature.models.Song;
import com.revature.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class SongRepo implements CrudRepository<Song>{

    ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

    //Create
    public Song add(Song a) {
        try (Connection conn = cu.getConnection()) {


            String sql = "insert into Songs (\"SongId\" , \"Title\", \"Artist\" ,\"Genre\", \"Release Date\") values (?, ?, ?, ?, ?) returning *";

            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(a.s);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                a.setId(rs.getInt("SongId"));
                a.setTitle(rs.getString("Title"));
                a.setArtist(rs.getString("Artist"));
                a.setGenre(rs.getString("Genre"));
                a.setReleaseDate(rs.getDate("01-01-2001"));
                return a;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

//Read
    @Override
    public Song getById(Integer id) { try (Connection conn = cu.getConnection()) {

        String sql = "select * from Songs where SongId = ?";

        PreparedStatement ps = conn.prepareStatement(sql); // Setting up our SQL statement in this way helps prevent SQL Injection Attacks
        ps.setInt(1, id); // parameter Indexes start from 1 (NOT 0)

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            Song a = new Song();
            a.setId(rs.getInt("SongId"));
            a.setTitle(rs.getString("Title"));
            a.setArtist(rs.getString("Artist"));
            a.setGenre(rs.getString("Genre"));
            a.setReleaseDate(rs.getDate("01-01-2001"));

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
            String sql = "select * from Songs where SongId = ?";
            PreparedStatement ps = conn.prepareStatement(sql); // Setting up our SQL statement in this way helps prevent SQL Injection Attacks
            // ps.setInt(1, ); // parameter Indexes start from 1 (NOT 0)

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Song a = new Song(
                        rs.getInt("SongId"),
                        rs.getString("Title"),
                        rs.getString("Artist"),
                        rs.getString("Genre"),
                        rs.getDate("Release")
                );
                songs.add(a);
            }
            return songs;

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return null;
    }

    //update
    @Override
    public void update(Song song) {
        try (Connection conn = cu.getConnection()) {

            String sql = "update authors set first_name = ?, last_name = ? where id = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, song.getId());
            ps.setString(1, song.getArtist());
            ps.setString(2, song.getTitle());
            ps.setString(3, song.getGenre());
            ps.setDate(1, song.getReleaseDate());

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
