package com.revature.services;

import com.revature.models.User;
import com.revature.repositories.UserRepo;

import java.util.List;

// Where we are going to put any business logic needed for the application to function the way we want.
// Specifically any services that need to be available to our users.
public class UserServices {

    UserRepo userRepo = new UserRepo();

    public boolean login(String username, String password) {

        // in order to log in a user, we will need username and password
        // that information is stored in our database
        // the repository layer needs to take care of this

        User u = userRepo.getByUsername(username); // more of the Sole Responsibility Principle at work

        // check to make sure User object is not null
        if (u != null) {
            // now check to make sure it matches
            if (username.equals(u.getUsername()) && password.equals(u.getPassword())&& u.getUploader() == true) {
                System.out.println("Uploader Access Granted");
                return true;
            }
            else if(username.equals(u.getUsername()) && password.equals(u.getPassword())){
                System.out.println("User Access Granted");
                return true;
            }
        } else{
            System.out.println("Access denied");
            return false;
        }return false;
    }

    List<User> getAllToDos() {
        return null;
    }

//    public List<User> getAllUser(){
//        List<User> users = UserRepo.
//
//        if(this.userRepo.createAUser(user))
//            System.out.println(user.getUsername() + " now has access.");
//        else
//            System.out.println("Could not add user to database. An error has occurred");
//    }
    //View all songs

    //
    //By printing get all songs

    //View platform
    //utilize join

    //View playlist
    //Display titles then lead to selection for join statement

}

