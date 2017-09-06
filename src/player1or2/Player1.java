package player1or2;

/**
 * Created by momo on 2017-09-05.
 */
public class Player1 implements Player {
    private final String SymbolO = " O ";

    @Override
    public String getSymbolO(){
        return SymbolO;
    }

    @Override
    public String getSymbolX() {
        return null;
    }

}
