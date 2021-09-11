package com.revature.app;


import com.revature.services.UserServices;

import java.util.Scanner;

public class AppDriver {

    public static Scanner scanner = new Scanner(System.in);

    private static UserServices userServices = new UserServices();

    //private static SongRepo songRepo = new SongRepo();


    public static void main(String[] args) {

        //System.out.println(bookRepo.getAll());
        //bookRepo.getAll().forEach(System.out::println);

        System.out.println("Welcome!\nPlease choose an option below");
        System.out.println("1. Login\n2. Register account\n3. Quit");

        int input = scanner.nextInt();

        switch (input) {

            case 1: {
                // calling this once to clear anything in the input stream
                scanner.nextLine();

                System.out.println("Please enter your username: ");
                String username = scanner.nextLine();

                System.out.println("Please enter your password: ");
                String password = scanner.nextLine();

                // We need a login service to check if username and password match credentials stored in the database
                boolean signInResponse = userServices.login(username, password);

                if (signInResponse) {
                    System.out.println("Successfully logged in...");
                    ///Continue to Song listing,
//                    case 1: {
//
//                        break;
//
//                    }
                    // Platform availability
                    // Playlist view, Playlist make,
                    // Extra user notification
                } else {
                    System.out.println("Credentials do not match. ");
                    System.out.println("Please try again. ");
                }
                break;
            }
            case 2: {
                System.out.println("Thanks for coming.");
                break;
            }
        }


        scanner.close();



    }
}
