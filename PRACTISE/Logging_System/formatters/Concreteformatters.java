package PRACTISE.Logging_System.formatters;

import PRACTISE.Logging_System.core.Logmessage;

public class SimpleFormatter implements Logformatter{

    @Override
    public String format(Logmessage message)
    {
        return String.format("[%s] [%-5s] [%s] %s",
            message.getTimestampFormatted(),
            message.getLevel().getLabel(),
            message.getSource(),
            message.getMessage()
        );
    }
}

public class JSONFormatter implements Logformatter {

    @Override
    public String format(Logmessage message)
    {
         return String.format(
            "{\"timestamp\":\"%s\",\"level\":\"%s\",\"source\":\"%s\",\"thread\":\"%s\",\"message\":\"%s\"}",
            message.getTimestampFormatted(),
            message.getLevel().getLabel(),
            message.getSource(),
            message.getThreadName(),
            escapeJson(message.getMessage())
        );
    }
}
