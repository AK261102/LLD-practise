package PRACTISE.Logging_System.handlers;

import java.util.logging.ConsoleHandler;

import PRACTISE.Logging_System.core.Logmessage;
import PRACTISE.Logging_System.formatters.Logformatter;
import PRACTISE.Logging_System.formatters.SimpleFormatter;

public class Concretehandler implements Loghandler {
    
    private Logformatter formatter;

    public ConsoleHandler(){
        this.formatter = new SimpleFormatter();
    }

    public ConsoleHandler(Logformatter formatter ){
        this.formatter = formatter;
    }

    @Override
    public void log(Logmessage message)
    {
        String formatted = formatter.format(message);

        if(message.getLevel().getValue() >= core.LogLevel.ERROR.getValue())
        {

        }
        else
        {

        }
    }

      @Override
    public void setFormatter(LogFormatter formatter) {
        this.formatter = formatter;
    }
    
    @Override
    public LogFormatter getFormatter() {
        return formatter;
    }
    
    @Override
    public void close() {
        // Nothing to close for console
    }
}
