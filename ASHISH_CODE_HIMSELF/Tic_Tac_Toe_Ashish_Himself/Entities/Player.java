package ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.Entities;

import ASHISH_CODE_HIMSELF.Tic_Tac_Toe_Ashish_Himself.models.Symbols;


public class Player {
    private String name;
    private Symbols symbols;
    public Player(String name,Symbols symbols)
    {
        this.name=name;
        this.symbols=symbols;
    }

    private String getName()
    {
        return name;
    }

    private String getSymbols()
    {
        return symbols;
    }
}
