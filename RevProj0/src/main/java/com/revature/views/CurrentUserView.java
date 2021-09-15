package com.revature.views;

import com.revature.models.User;
import com.revature.repositories.PlatformRepo;
import com.revature.repositories.PlaylistRepo;
import com.revature.repositories.SongRepo;
import com.revature.services.UserServices;

import java.util.Scanner;

public class CurrentUserView {
    static UserServices userServices = new UserServices();
    static User currentUser = null;

    public static void display(User currentUser) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome User "+ currentUser.getUsername() +"!");


        while (running) {

            //Menu Display
            /// need to display a menu
            System.out.println("1) View all Songs.");
            System.out.println("2) View all Song Platforms.");
            System.out.println("3) View your Playlists.");
            System.out.println("4) Make and add to Playlist.");
            System.out.println("5) Sign Out.");

            //Input retrieval
            String result = scanner.nextLine();

            switch (result) {
                case "1":
                    //View all Songs
                    SongRepo songs = new SongRepo();
                    songs.getAll();
                    break;
                case "2":
                    //View all song platforms
                    PlatformRepo platforms = new PlatformRepo();
                    platforms.returnAll();
                    break;
                case "3":
                    //View Playlist
                    PlaylistRepo playlists = new PlaylistRepo();
                    playlists.getAll();
                    break;
                case "4":
                    //Make Playlist
                    System.out.println("Please enter Playlist title");
                    String play_title = scanner.nextLine();
                    System.out.println("Please enter song id");
                    String songbird = scanner.nextLine();
                    Integer SongId = Integer.parseInt(songbird);
                    PlaylistRepo newPlaylist = new PlaylistRepo();
                    newPlaylist.addPlaylist(currentUser.getId(), play_title, SongId);
                    System.out.println("Playlist " + play_title + " has been made" );
                    break;
                case "5":
                    //Sign Out
                    System.out.println("User " + currentUser.getUsername() + " has signed out\n*****************************\n***********************");
                    InitialUserView.display();
                    break;
                default:
                    System.out.println("Input incorrect, Please try again");
                    break;
            }
        }
    }


    public static void display() {
    }
}
