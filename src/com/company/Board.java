package com.company;

import java.util.Arrays;

/**
 * Created by momo on 2017-09-05.
 */
public class Board {
    String[] row1 = {"|","   ","|","   ","|","   ","|"};
    String[] row2 = {"|","   ","|","   ","|","   ","|"};
    String[] row3 = {"|","   ","|","   ","|","   ","|"};
    String border = "+-----------+";

    public void getBoard(){
        System.out.println(border);
        for (String chart:row1) {System.out.print(chart);}
        System.out.print("\n");
        System.out.println(border);
        for (String chart:row2) {System.out.print(chart);}
        System.out.print("\n");
        System.out.println(border);
        for (String chart:row3) {System.out.print(chart);}
        System.out.print("\n");
        System.out.println(border);
    }

    public boolean someoneWon(){
        if ((row1[1].equals(row1[3]) && row1[3].equals(row1[5]) && !row1[5].contains("   ")) ||
            (row2[1].equals(row2[3]) && row2[3].equals(row2[5]) && !row2[5].contains("   ")) ||
            (row3[1].equals(row3[3]) && row3[3].equals(row3[5]) && !row3[5].contains("   ")) ||
            (row1[1].equals(row2[3]) && row2[3].equals(row3[5]) && !row3[5].contains("   ")) ||
            (row3[1].equals(row2[3]) && row2[3].equals(row1[5]) && !row1[5].contains("   "))) {
            return true;
        } else {
            return false;
        }
    }
    public boolean checkEmpty(int autoInput1, int AutoInput2,Board board){
        if (autoInput1 == 1) {
            switch (AutoInput2) {
                case 1:
                    return board.row1[1].equals("   ") ? true : false;
                case 2:
                    return board.row1[3].equals("   ") ? true : false;
                case 3:
                    return board.row1[5].equals("   ") ? true : false;
            }
        }
        if (autoInput1 == 2) {
            switch (AutoInput2) {
                case 1:
                    return board.row2[1].equals("   ") ? true : false;
                case 2:
                    return board.row2[3].equals("   ") ? true : false;
                case 3:
                    return board.row2[5].equals("   ") ? true : false;
            }
        }
        if (autoInput1 == 3) {
            switch (AutoInput2) {
                case 1:
                    return board.row3[1].equals("   ") ? true : false;
                case 2:
                    return board.row3[3].equals("   ") ? true : false;
                case 3:
                    return board.row3[5].equals("   ") ? true : false;
            }
        }
        return true;
    }
    public boolean checkDraw(){
        if(Arrays.asList(row1).contains("   ") ||
           Arrays.asList(row2).contains("   ") ||
           Arrays.asList(row3).contains("   ")){
            return false;
        }
        else{
            return true;
        }
    }
}
