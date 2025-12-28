package PRACTISE.Logging_System;

import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;

import PRACTISE.Logging_System.formatters.SimpleFormatter;
import PRACTISE.Logging_System.handlers.Loghandler;
import PRACTISE.Logging_System.loggers.Logger;

public class Main {
    public static void main(String[] args) {
        
        Logger logger = Logger.getInstance();
        logger.addHandler(consoleHandler);

           
        logger.debug("Application starting...");
        logger.info("Configuration loaded successfully");
        logger.warn("Disk usage is at 80%");
        logger.error("Failed to connect to backup server");
        logger.fatal("Critical system failure!");

        Loghandler fileHandler = new FileHandler("application.log");
        logger.addHandler(fileHandler);
        
        Loghandler simpleConsole = new ConsoleHandler(new SimpleFormatter());
        logger.addHandler(simpleConsole);
        
    }
}
