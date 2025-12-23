

public enum Symbol{
    /*
    Here i am defining the symbols
    for printing symbols define chars
    Symbol.X.getChar() return 'X'
    enum constuctor is always private(by default) kaise kyu

    usage

    create a symbols
    Symbols s= Symbol.X;
    char c=s.getChar();
    and compare symbols
    if(s==Symbols.X)
    print("it's x")
    and compare empty cells
    */
    X('X');
    O('O');
    EMPTY(' ');

    private final char displayChar;

    Symbol(char displayChar)
    {
        this.displayChar=displayChar;
    }
    public char getChar()
    {
        return displayChar;
    }
}