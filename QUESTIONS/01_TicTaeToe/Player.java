package QUESTIONS.01_TicTaeToe;


/**
 * This class has a single respondibilty to store players info
 * 
 */
public class Player {
    //private - encapsulation
    private String name;
    private Symbols Symbols;

    public Player(String name,Symbols Symbols)
    {
        this.name=name;
        this.Symbols=Symbols;
    }

    // getter (no setters = immutable once created)
    public String getName()
    {
        return name;
    }

    public Symbols getSymbols()
    {
        return Symbols;
    }
}
