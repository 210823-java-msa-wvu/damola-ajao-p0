package com.revature.views;

import com.revature.models.User;
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
            System.out.println("4) Make a Playlist.");
            System.out.println("5) Delete a Playlist.");
            System.out.println("6) Sign Out.");

            //Input retrieval
            String result = scanner.nextLine();

            switch (result) {
                case "1":
                    //View all Songs

//                    System.out.println("-------- MySQL JDBC Connection Testing ------------");
//
//
//                    Connection connection = null;
//
//                    try {
//                        connection = DriverManager
//                                .getConnection("jdbc:postgresql://cohortdatabase.cx5b2xhr3nuf.us-east-2.rds.amazonaws.com:5432/\\\n" +
//                                        "  postgres?currentSchema=musicproject", "damola", "KalIOun89");
//                    } catch (SQLException e) {
//                        for(Throwable ex : e) {
//                            System.err.println("Error occurred " + ex);
//                        }
//                        e.printStackTrace();
//                    }
//
//                    if (connection != null) {
//                        System.out.println("Connected to database!");
//                    } else {
//                        System.out.println("Failed to make connection!");
//                    }
//
//                    try {
//                        Statement stmt = connection.createStatement();
//                        String query = "select * from songs;";
//                        //songs is the table name
//                        ResultSet rs = stmt.executeQuery(query);
//                        while (rs.next()) {
//                            Integer songid = rs.getInt();
//                            String title = rs.getObject(1).toString();
//                            String gender = rs.getObject(2).toString();
//                            System.out.println("Name of the person is " + title + " and his gender is " + gender);
//                            //Person table has name and gender column
//
//                        }
//                    } catch (SQLException e) {
//                        e.printStackTrace();
//                        for(Throwable ex : e) {
//                            System.err.println("Error occurred " + ex);
//                        }
//                        System.out.println("Error in fetching data");
//                    }
                    break;
                case "2":
                    //View all song platforms

                    break;
                case "3":
                    //View Playlist

                    break;
                case "4":
                    //Make Playlist

                    break;
                case "5":
                    //Delete Playlist

                    break;
                case "6":
                    //Sign Out
                    System.out.println("User" + currentUser.getUsername() + "has signed out\n*****************************\n***********************");
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
