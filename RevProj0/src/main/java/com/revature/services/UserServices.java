package com.revature.services;

import com.revature.exceptions.PasswordException;
import com.revature.exceptions.UsernameException;
import com.revature.models.Playlist;
import com.revature.models.Song;
import com.revature.models.User;
import com.revature.repositories.PlaylistRepo;
import com.revature.repositories.SongRepo;
import com.revature.repositories.UserRepo;

import java.util.List;

// Where we are going to put any business logic needed for the application to function the way we want.
// Specifically any services that need to be available to our users.
public class UserServices {

    UserRepo userRepo = new UserRepo();
    SongRepo songRepo = new SongRepo();
    PlaylistRepo playlistRepo = new PlaylistRepo();

public User login(String username, String password) throws UsernameException, PasswordException {
        // in order to log in a user, we will need username and password
        // that information is stored in our database
        // the repository layer needs to take care of this

            // more of the Sole Responsibility Principle at work
        User user = userRepo.getByUsername(username);
            // check to make sure User object is not null
        if (user == null) {
            throw new UsernameException();
// now check to make sure it matches
        }
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())
                    && user.getUploader()) {
                System.out.println("Uploader Access Granted");
                return user;
            }if (username.equals(user.getUsername())
                    && password.equals(user.getPassword())) {
                System.out.println("User Access Granted");
                return user;
            }
            return null;
        }



    public User signUp(String username, String password) {

        User user = userRepo.getByUsername(username);
        if (user != null) {
            throw new IllegalArgumentException();
        }
        user = userRepo.addUser(username, password);
            return user;
        }


    public Song addSong(String title, String artist, String genre){
        Song song = songRepo.getByTitle(title);
        if(song != null){
            throw new IllegalArgumentException();
        }
        song = songRepo.addSong(title, artist, genre);
        return song;
    }

    public Playlist addPlaylist(Integer userid, String title, Integer songid){
        Playlist playlist = playlistRepo.getPlayByTitle(title);
        if(playlist == null){
            throw new IllegalArgumentException();
        }
        playlistRepo.addPlaylist(userid, title, songid);
        return playlist;
    }
        List<User> getAllUser() {
        return null;
    }

        //View all songs


        //By printing get all songs


        //View platform
        //utilize join

        //View playlist
        //Display titles then lead to selection for join statement



    }




