package com.company;

import java.util.Random;

/**
 * Created by momo on 2017-09-05.
 */
public class Computer implements Player {
    Random random = new Random();
    private final String SymbolP2 = " X ";

    public String chooseAuto(){
        int firstNum = random.nextInt(3) +1;
        int secondNum = random.nextInt(3) +1;
        String AutoNumber = firstNum + " " + secondNum;
        return AutoNumber;
    }

    @Override
    public String getSymbolP1() {
        return null;
    }
    @Override
    public String getSymbolP2() {
        return SymbolP2;
    }
}
