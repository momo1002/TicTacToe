package player1or2;

import java.util.Random;

/**
 * Created by momo on 2017-09-05.
 */
public class Player2 implements Player {
    Random random = new Random();
    private final String SymbolX = " X ";

    public String chooseAuto(){
        int firstNum = random.nextInt(3) +1;
        int secondNum = random.nextInt(3) +1;
        String AutoNumber = firstNum + " " + secondNum;
        return AutoNumber;
    }

    public String getSymbolO() {
        return null;
    }
    public String getSymbolX() {
        return SymbolX;
    }
}
