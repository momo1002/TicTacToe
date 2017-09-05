package com.company;

/**
 * Created by momo on 2017-09-05.
 */
public class Message {
    public static void printWelcome(){
        System.out.println("==================================");
        System.out.println("WELCOME TO TIC TAC TOE!");
        System.out.println("  Designer: John Smith");
        System.out.println("  Class Cornerstone WMDP");
        System.out.println("  Date:xx/xx/xx" + "\n");
        System.out.println("1 --- person vs. person");
        System.out.println("2 --- person vs. random computer" + "\n");
        System.out.println("Enter your choice(1 or 2):");
        System.out.println("==================================");
    }
    public static void printChooseLevel(int userInput){
        System.out.println("You have entered choice" + userInput);
    }
    public static void printErrorChooseLevel(){
        System.out.println("Enter your choice(1 or 2)");
    }
    public static void printCurrentStatus(){
        System.out.println("The current status is:");
    }
    public static void printEncourageMoving(int playerNum){
        if(playerNum == 3){
            System.out.println("Player Computer: ");

        } else {
            System.out.println("Player" + playerNum + ":make your move:");

        }
    }
}
