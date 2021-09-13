package com.revature.views;

import com.revature.services.UserServices;

import java.util.Scanner;



public class InitialUserView {

    static UserServices userService = new UserServices();

    public static void display() {

        //loop the following
        Scanner scanner = new Scanner(System.in);
        Boolean running = true;

        while (running) {

            //Menu Display
            System.out.println("1) Login");
            System.out.println("2) Sign-up");
            System.out.println("3) Close Program");

            //Input retrieval
            String result = scanner.nextLine();


            switch (result) {

                case "1": {
                    // calling this once to clear anything in the input stream
                    scanner.nextLine();

                    System.out.println("Please enter your username: ");
                    String username = scanner.nextLine();

                    System.out.println("Please enter your password: ");
                    String password = scanner.nextLine();

                    // We need a login service to check if username and password match credentials stored in the database
                    boolean signInResponse = userService.login(username, password);

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
                        System.out.println("Please do not try again. ");
                    }
                    break;
                }
            }
        }
    }
}
