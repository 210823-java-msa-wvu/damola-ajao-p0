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

        // more of the Sole Responsibility Principle at work
        User user = userRepo.getByUsername(username);

        // check to make sure User object is not null
        if (user != null) {
            // now check to make sure it matches
            if (username.equals(user.getUsername()) && password.equals(user.getPassword())
                    && user.getUploader()) {
                System.out.println("Uploader Access Granted");
                return true;
            }
            else if(username.equals(user.getUsername())
                    && password.equals(user.getPassword())){
                System.out.println("User Access Granted");
                return true;
            }
        } else{
            System.out.println("Access denied");
            return false;
        }return false;
    }


    public User signUp(String username, String password){

         User user = userRepo.getByUsername(username);
                if(user != null){
        throw new IllegalArgumentException();
                }
            user = userRepo.addUser(username, password);
                        return user;
    }

    List<User> getAllUser() {
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

