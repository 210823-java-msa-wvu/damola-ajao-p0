package com.revature.exceptions;

public class UsernameException extends RuntimeException {

    public UsernameException(){ super("Username does not exist");}
}
