package com.revature.views;

import com.revature.models.User;
import com.revature.repositories.PlatformRepo;
import com.revature.repositories.PlaylistRepo;
import com.revature.repositories.SongRepo;
import com.revature.services.UserServices;
import com.revature.utils.ConnectionUtil;

import java.sql.*;
import java.util.Scanner;

public class UploaderView {

    static UserServices userServices = new UserServices();

    static User Uploader = null;
    ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

    public static void display(User Uploader) throws SQLException {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome User "+ Uploader.getUsername() +"!");

        while(running) {
        /// need to display a menu
        System.out.println("^^^^^^^^\n0) Add a song.\n^^^^^^^^");
        System.out.println("1) View all Songs.");
        System.out.println("2) View all Song Platforms.");
        System.out.println("3) View all Playlists.");
        System.out.println("4) Make and Add to a Playlist.");
        System.out.println("5) Sign Out.");

        //Input retrieval
        String result = scanner.nextLine();

        switch (result) {
            case "0":
                //Add Song
                System.out.println("Enter song title");
                String title = scanner.nextLine();
                System.out.println("Enter song artist");
                String artist = scanner.nextLine();
                System.out.println("Enter song genre");
                String genre = scanner.nextLine();
                SongRepo newSong = new SongRepo();
                newSong.addSong(title, artist, genre);
                System.out.println(newSong.getByTitle(title) + "Has been added to the database");

                break;
            case "1":
                //View all Songs
                SongRepo songs = new SongRepo();
                songs.getAll();
                //Print songs
                break;
            case "2":
                //View all song platforms
                PlatformRepo platforms = new PlatformRepo();
                platforms.returnAll();
                break;
            case "3":
                //View All Playlist
                PlaylistRepo playlists = new PlaylistRepo();
                playlists.getAll();

                break;
            case "4":
                //Make & Add to Playlist
                System.out.println("Please enter Playlist title");
                String play_title = scanner.nextLine();
                System.out.println("Please enter song id");
                String songbird = scanner.nextLine();
                Integer SongId = Integer.parseInt(songbird);
                PlaylistRepo newPlaylist = new PlaylistRepo();
                newPlaylist.addPlaylist(Uploader.getId(), play_title, SongId);
                System.out.println("Playlist " + play_title + " has been made" );
                break;
            case "5":
                //Sign Out
                System.out.println("Uploader " + Uploader.getUsername() + " has signed out\n*****************************\n***********************");
                InitialUserView.display();
                break;
            default:
                System.out.println("Input incorrect, Please try again");
                break;
        }
    }
    }
    }

