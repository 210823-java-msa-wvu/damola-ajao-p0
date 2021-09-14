package com.revature.views;

import com.revature.models.User;
import com.revature.services.UserServices;

import java.util.Scanner;

public class UploaderView {

    static UserServices userServices = new UserServices();
    static User Uploader = null;

    public static void display(User Uploader) {

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome User "+ Uploader.getUsername() +"!");

        while(running)

    {

        /// need to display a menu
        System.out.println("0) Add a song.");
        System.out.println("1) View all Songs.");
        System.out.println("2) View all Song Platforms.");
        System.out.println("3) View all Playlists.");
        System.out.println("4) Make a Playlist.");
        System.out.println("5) Delete a Playlist.");
        System.out.println("6) Sign Out.");

        //Input retrieval
        String result = scanner.nextLine();

        switch (result) {
            case "0":
                //Add Song

                break;
            case "1":
                //View all Songs
                break;
            case "2":
                //View all song platforms
                break;
            case "3":
                //View All Playlist
                break;
            case "4":
                //Make Playlist
                break;
            case "5":
                //Delete Playlist
                break;
            case "6":
                //Sign Out
                System.out.println("Uploader" + Uploader.getUsername() + "has signed out\n*****************************\n***********************");
                InitialUserView.display();
                break;
            default:
                System.out.println("Input incorrect, Please try again");
                break;
        }
    }
    }
    }

