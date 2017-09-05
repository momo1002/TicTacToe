package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create first player
        Player person1 = new Person();
        Player person2 = null;
        Player computer = null;

        Message.printWelcome();

        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        // vs. person or computer
        while(true) {
            if (userInput == 1 || userInput == 2) {
                Message.printChooseLevel(userInput);
                break;
            } else {
                Message.printErrorChooseLevel();
                userInput = input.nextInt();
            }
        }

        // create a bord
        Message.printCurrentStatus();
        Board board = new Board();
        board.getBoard();

        // create second player
        if(userInput == 1){
            person2 = new Person();
            playGameWithPerson(board,person1,person2);
        } else {
            computer = new Computer();
            playGameWithComputer(board,person1,computer);
        }



//        Message.printWelcome();
    } // FIN : main method

/////////////////////////////////////////////////////////////////



    public static void playGameWithPerson(Board board,Player p1, Player p2){
        // play game
        while(!board.someoneWon()) {
            Game.continueGame1(p1,board);
            Message.printCurrentStatus();
            board.getBoard();

            if(board.someoneWon()){
                System.out.println("player 1 won!" + "\n");
                break;
            } else {
                Game.continueGame2(p2,board);
                Message.printCurrentStatus();
                board.getBoard();

                if(board.someoneWon()){
                    System.out.println("player 2 won!" + "\n");
                    break;
                }
            }
        }
    }

    public static void playGameWithComputer(Board board,Player p1, Player c1){
        // play game
        while(!board.someoneWon()) {
            Game.continueGame1(p1,board);
            Message.printCurrentStatus();
            board.getBoard();

            if(board.someoneWon()){
                System.out.println("player 1 won!" + "\n");
                break;
            } else {
                Game.continueGame3(c1,board);
                Message.printCurrentStatus();
                board.getBoard();

                if(board.someoneWon()){
                    System.out.println("computer won!" + "\n");
                    break;
                }
            }
        }
    }
}
