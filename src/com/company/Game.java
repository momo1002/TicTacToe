package com.company;

import java.util.Scanner;

/**
 * Created by momo on 2017-09-05.
 */
public class Game {


    public static void continueGame1(Player player,Board board){
        int split1 = 0;
        int split2 = 0;

        // get user input as Integer respectively
        try {
            Message.printEncourageMoving(1);
            Scanner strInput = new Scanner(System.in);
            String strUserInput = strInput.nextLine();
            split1 = Integer.valueOf(strUserInput.substring(0, 1));
            split2 = Integer.valueOf(strUserInput.substring(2, 3));
        } catch (Exception e) {}

        if (split1 == 1) {
            switch (split2) {
                case 1:
                    board.row1[1] = player.getSymbolP1();
                    break;
                case 2:
                    board.row1[3] = player.getSymbolP1();
                    break;
                case 3:
                    board.row1[5] = player.getSymbolP1();
                    break;
            }
        }

        if (split1 == 2) {
            switch (split2) {
                case 1:
                    board.row2[1] = player.getSymbolP1();
                    break;
                case 2:
                    board.row2[3] = player.getSymbolP1();
                    break;
                case 3:
                    board.row2[5] = player.getSymbolP1();
                    break;
            }
        }
        if (split1 == 3) {
            switch (split2) {
                case 1:
                    board.row3[1] = player.getSymbolP1();
                    break;
                case 2:
                    board.row3[3] = player.getSymbolP1();
                    break;
                case 3:
                    board.row3[5] = player.getSymbolP1();
                    break;
            }
        }
    }

    public static void continueGame2(Player player,Board board){
        int split1 = 0;
        int split2 = 0;

        // get user input as Integer respectively
        try {
            Message.printEncourageMoving(2);
            Scanner strInput = new Scanner(System.in);
            String strUserInput = strInput.nextLine();
            split1 = Integer.valueOf(strUserInput.substring(0, 1));
            split2 = Integer.valueOf(strUserInput.substring(2, 3));
        } catch (Exception e) {}


        if (split1 == 1) {
            switch (split2) {
                case 1:
                    board.row1[1] = player.getSymbolP2();
                    break;
                case 2:
                    board.row1[3] = player.getSymbolP2();
                    break;
                case 3:
                    board.row1[5] = player.getSymbolP2();
                    break;
            }
        }
        if (split1 == 2) {
            switch (split2) {
                case 1:
                    board.row2[1] = player.getSymbolP2();
                    break;
                case 2:
                    board.row2[3] = player.getSymbolP2();
                    break;
                case 3:
                    board.row2[5] = player.getSymbolP2();
                    break;
            }
        }
        if (split1 == 3) {
            switch (split2) {
                case 1:
                    board.row3[1] = player.getSymbolP2();
                    break;
                case 2:
                    board.row3[3] = player.getSymbolP2();
                    break;
                case 3:
                    board.row3[5] = player.getSymbolP2();
                    break;
            }
        }
    }

    public static void continueGame3(Player player, Board board){
        int split1 = 0;
        int split2 = 0;

        // get user input as Integer respectively
        try {
            Message.printEncourageMoving(3);
            String strUserInput = ((Computer)player).chooseAuto();
            split1 = Integer.valueOf(strUserInput.substring(0, 1));
            split2 = Integer.valueOf(strUserInput.substring(2, 3));
        } catch (Exception e) {}

        while (!board.checkEmpty(split1,split2,board)){
            String strUserInput = ((Computer)player).chooseAuto();
            split1 = Integer.valueOf(strUserInput.substring(0, 1));
            split2 = Integer.valueOf(strUserInput.substring(2, 3));
        }

        if (split1 == 1) {
            switch (split2) {
                case 1:
                    board.row1[1] = player.getSymbolP2();
                    break;
                case 2:
                    board.row1[3] = player.getSymbolP2();
                    break;
                case 3:
                    board.row1[5] = player.getSymbolP2();
                    break;
            }
        }
        if (split1 == 2) {
            switch (split2) {
                case 1:
                    board.row2[1] = player.getSymbolP2();
                    break;
                case 2:
                    board.row2[3] = player.getSymbolP2();
                    break;
                case 3:
                    board.row2[5] = player.getSymbolP2();
                    break;
            }
        }
        if (split1 == 3) {
            switch (split2) {
                case 1:
                    board.row3[1] = player.getSymbolP2();
                    break;
                case 2:
                    board.row3[3] = player.getSymbolP2();
                    break;
                case 3:
                    board.row3[5] = player.getSymbolP2();
                    break;
            }
        }
    }
}
