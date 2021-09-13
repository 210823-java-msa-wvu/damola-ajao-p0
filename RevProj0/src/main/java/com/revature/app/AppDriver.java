package com.revature.app;


public class AppDriver {
//
//    public static Scanner scanner = new Scanner(System.in);
//
//    public boolean running = true;
//
//    private static UserServices userServices = new UserServices();
//
//    public static void main(String[] args) {
//
//        System.out.println("Welcome to the Music Database!\nPlease choose an option below");
//        System.out.println("1. Login\n2. Register account\n3. Quit");
//
//        int input = scanner.nextInt();
//
//
//            switch (input) {
//
//                case 1: {
//                    // calling this once to clear anything in the input stream
//                    scanner.nextLine();
//
//                    System.out.println("Please enter your username: ");
//                    String username = scanner.nextLine();
//
//                    System.out.println("Please enter your password: ");
//                    String password = scanner.nextLine();
//
//                    // We need a login service to check if username and password match credentials stored in the database
//                    boolean signInResponse = userServices.login(username, password);
//
//                    if (signInResponse) {
//                        System.out.println("Successfully logged in...");
//
//                        System.out.println("View all Songs");
//                        System.out.println("View song platform availability");
//                        System.out.println("View playlist");
//                        System.out.println("Add to playlist");
//                        System.out.println("Delete playlist");
//                        ///Continue to Song listing,
////                    case 1: {
////
////                        break;
////
////                    }
//                        // Platform availability
//                        // Playlist view, Playlist make,
//                        // Extra user notification
//                    } else {
//                        System.out.println("Credentials do not match. ");
//                        System.out.println("Please do not try again. ");
//                    }
//                    break;
//                }
//                case 2: {
//                    System.out.println("Please Enter Desired Username");
//                    String username = scanner.nextLine();
//                    System.out.println("Please Enter Desired Password");
//                    String password = scanner.nextLine();
//                    try {
//                        User user = UserServices.signUp(username, password);
//                        System.out.println("User " + user.getUsername() + " created.");
//                    } catch (IllegalArgumentException e) {
//                        System.out.println("username is taken.");
//
//                    }
//                    break;
//                }
//            }
//
//        scanner.close();
//
//
//
//    }
}
