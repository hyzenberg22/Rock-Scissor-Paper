package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Game_file {
    public static void main(String[] args) {
        System.out.println("Welcome to the Rock-Paper-Seasor Game");
        // Making the Instance from the class
        Scanner input = new Scanner(System.in);
        Random Rand = new Random();

        // making the variabls for the Game
        System.out.print("Enter the players name:- ");
        String name = input.next().toUpperCase(Locale.ROOT);
        System.out.format("........COMPUTER VS %s........\n\n", name);


        // This is the main Game Loop of the Game
        while(true){
            int Computer_choice_random = Rand.nextInt(3);
            String computer_choice = "";

            // This is the statment of the computer choice
            switch(Computer_choice_random){
                case 0 -> computer_choice = "ROCK";
                case 1 -> computer_choice = "PAPER";
                case 2 -> computer_choice = "SEASOR";
            }
            System.out.println("      ...Choose Between...   \n  ......'Rock'-'Paper'-'Seasor'......\n");
            System.out.println("'0' for the 'ROCK'\n'1' for the 'PAPER'\n'2' for the 'SEASOR'\n");

            System.out.print("Enter your choice:- ");
            int user_choice_input = input.nextInt();



            String user_choice = "";
            // This is the user choice
            switch(user_choice_input){
                case 0 -> user_choice = "ROCK";
                case 1 -> user_choice = "PAPER";
                case 2 -> user_choice = "SEASOR";
            }
            System.out.format("Your choice is :- %s\nComputer Choice is :-%s", user_choice, computer_choice);

            break;

        }





    }
}
