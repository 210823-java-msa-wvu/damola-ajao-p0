package com.revature.views;

import java.util.Scanner;

public class PlaylistView  {

    public static void display() {

        Scanner scanner = new Scanner(System.in);
        Boolean running = true;

        while (running) {
            //display
            System.out.println("1) option 1");
            System.out.println("2) option 2");
            System.out.println("3) option 3");
            System.out.println("0) back");

            //inputs
            Integer result = scanner.nextInt();


            //do something with inputs
            switch (result){
                case 1:
                    System.out.println("option 1 stuff");
                    break;
                case 2:
                    System.out.println("option 2 stuff");
                    break;
                case 3:
                    System.out.println("option 3 stuff");
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
