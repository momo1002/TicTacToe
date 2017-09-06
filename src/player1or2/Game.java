package player1or2;

import java.util.Scanner;

/**
 * Created by momo on 2017-09-05.
 */
public class Game {
    public static void continueGame1(Player player, Board board){
        int split1 = 0;
        int split2 = 0;

        // get user input as Integer respectively
        try {
            Message.printEncourageMoving(0);
            Scanner strInput = new Scanner(System.in);
            String strUserInput = strInput.nextLine();
            split1 = Integer.valueOf(strUserInput.substring(0, 1));
            split2 = Integer.valueOf(strUserInput.substring(2, 3));
        } catch (Exception e) {}

        if (split1 == 1) {
            switch (split2) {
                case 1:
                    board.row1[1] = player.getSymbolO();
                    break;
                case 2:
                    board.row1[3] = player.getSymbolO();
                    break;
                case 3:
                    board.row1[5] = player.getSymbolO();
                    break;
            }
        }

        if (split1 == 2) {
            switch (split2) {
                case 1:
                    board.row2[1] = player.getSymbolO();
                    break;
                case 2:
                    board.row2[3] = player.getSymbolO();
                    break;
                case 3:
                    board.row2[5] = player.getSymbolO();
                    break;
            }
        }
        if (split1 == 3) {
            switch (split2) {
                case 1:
                    board.row3[1] = player.getSymbolO();
                    break;
                case 2:
                    board.row3[3] = player.getSymbolO();
                    break;
                case 3:
                    board.row3[5] = player.getSymbolO();
                    break;
            }
        }
    }

    public static void continueGame2(Player player,Board board, int player2Type){
        int split1 = 0;
        int split2 = 0;


        try {
            Message.printEncourageMoving(player2Type); //player2Type = 1:person2 or 2:computer
            Scanner strInput = new Scanner(System.in);
            String strUserInput;

            if(player2Type == 2){
                strUserInput = ((Player2)player).chooseAuto();
            } else {
                strUserInput = strInput.nextLine();
            }
            split1 = Integer.valueOf(strUserInput.substring(0, 1));
            split2 = Integer.valueOf(strUserInput.substring(2, 3));
        } catch (Exception e) {}

        if(player2Type == 2){
            while (!board.checkEmpty(split1,split2,board)){
                String strUserInput = ((Player2)player).chooseAuto();
                split1 = Integer.valueOf(strUserInput.substring(0, 1));
                split2 = Integer.valueOf(strUserInput.substring(2, 3));
            }
        }
        if (split1 == 1) {
            switch (split2) {
                case 1:
                    board.row1[1] = player.getSymbolX();
                    break;
                case 2:
                    board.row1[3] = player.getSymbolX();
                    break;
                case 3:
                    board.row1[5] = player.getSymbolX();
                    break;
            }
        }
        if (split1 == 2) {
            switch (split2) {
                case 1:
                    board.row2[1] = player.getSymbolX();
                    break;
                case 2:
                    board.row2[3] = player.getSymbolX();
                    break;
                case 3:
                    board.row2[5] = player.getSymbolX();
                    break;
            }
        }
        if (split1 == 3) {
            switch (split2) {
                case 1:
                    board.row3[1] = player.getSymbolX();
                    break;
                case 2:
                    board.row3[3] = player.getSymbolX();
                    break;
                case 3:
                    board.row3[5] = player.getSymbolX();
                    break;
            }
        }
    }
}
