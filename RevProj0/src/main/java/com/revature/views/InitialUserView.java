package com.revature.views;

import com.revature.exceptions.UsernameException;
import com.revature.models.User;
import com.revature.services.UserServices;

import java.sql.SQLException;
import java.util.Scanner;



public class InitialUserView {

    static UserServices userService = new UserServices();

    public static void display() {

        //loop the following
        Scanner scanner = new Scanner(System.in);
        Boolean running = true;

        while (running) {

            //Menu Display
            System.out.println("Welcome to the Music Database \n******************\n******************\nPlease select an option ");
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
                        //Proper user type gaining
                        try {
                            User s = userService.login(username, password);
                            if (s.getUploader()) {
                                System.out.println("Successfully logged in...\n Uploader Access Granted");
                                UploaderView.display(s);
                            } else {
                                System.out.println("Successfully logged in...\n Welcome User");
                                CurrentUserView.display(s);
                            }
                        }catch(NullPointerException e){
                            System.out.println("Credentials do not match. ");
                            System.out.println("Please do try again. ");
                        }catch (IllegalArgumentException e) {
                            System.out.println("Issue detected");
                        }catch(UsernameException e){
                            System.out.println("Username not found");
                        }catch(SQLException e){
                            System.out.println("Query complication");
                        }


                        break;
                    case "2":
                        System.out.println("*****User Registration*****");
                        System.out.println("Please Enter Desired Username");
                        String new_username = scanner.nextLine();
                        System.out.println("Please Enter Desired Password");
                        String new_password = scanner.nextLine();
                        try {
                            User sinew = userService.signUp(new_username, new_password);
                            System.out.println("User " + sinew.getUsername() + " has been created.");
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        } catch (NullPointerException e){
                            System.out.println("Username created.");
                        } catch (Exception e){
                            e.printStackTrace();
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
        scanner.close();
        }
    }

