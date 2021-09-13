package com.revature.views;

import com.revature.models.User;
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
                    case "1":
                        System.out.println("Please enter your username: ");
                        String username = scanner.nextLine();

                        System.out.println("Please enter your password: ");
                        String password = scanner.nextLine();
                        boolean signInResponse = userService.login(username, password);

                        if (signInResponse) {
                            System.out.println("Successfully logged in...");
                            //Engage CurrentUserView
                            // Song listing
                            // Platform availability
                            // Playlist view, Playlist make,
                            // Extra user notification
                        } else {
                            System.out.println("Credentials do not match. ");
                            System.out.println("Please do not try again. ");
                        }
                        break;
                    case "2":
                        System.out.println("Please Enter Desired Username");
                        String new_username = scanner.nextLine();
                        System.out.println("Please Enter Desired Password");
                        String new_password = scanner.nextLine();
                        try {
                            User user = userService.signUp(new_username, new_password);
                            System.out.println("User " + user.getUsername() + " created.");
                        } catch (IllegalArgumentException e) {
                            System.out.println("username is taken.");

                        }
                        break;
                    case "3":
                        running = false;
                        break;
                    default:
                        System.out.println("Input incorrect, Please try again");
                        break;
                }
            }
        }
    }

