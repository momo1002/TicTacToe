package player1or2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create first player
        Player person1 = new Player1();
        Message.printWelcome();
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        while(userInput != 99){

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

            // create second player & play game
            if(userInput == 1){
                Player person2 = new Player2();
                playGame(board,person1,person2,userInput);
            } else {
                Player computer = new Player2();
                playGame(board,person1,computer,userInput);
            }
            Message.printWelcome();
            userInput = input.nextInt();

        }
    } // FIN : main method


    public static void playGame(Board board,Player p1, Player p2, int player2Type){
        while(!board.isWinner() || !board.isDraw()) {
            Game.continueGame1(p1,board);
            Message.printCurrentStatus();
            board.getBoard();
            if(board.isDraw()) {
                System.out.println("Draw");
                break;
            }

            if(board.isWinner()){
                System.out.println("player 1 won!" + "\n");
                break;
            } else {
                Game.continueGame2(p2, board, player2Type);
                Message.printCurrentStatus();
                board.getBoard();
                if(board.isDraw()) {
                    System.out.println("Draw");
                    break;
                }

                if(board.isWinner()){
                    System.out.println("player 2 won!" + "\n");
                    break;
                }
            }
        }
    }
}
