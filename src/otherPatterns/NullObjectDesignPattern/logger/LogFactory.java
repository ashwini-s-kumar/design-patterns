package otherPatterns.NullObjectDesignPattern.logger;

import otherPatterns.NullObjectDesignPattern.logger.loggers.ConsoleLogger;
import otherPatterns.NullObjectDesignPattern.logger.loggers.Logger;
import otherPatterns.NullObjectDesignPattern.logger.loggers.NullLogger;

public class LogFactory {
    public static Logger getLogger(String type){
        if("console".equalsIgnoreCase(type)){
            return new ConsoleLogger();
        }
        return new NullLogger();
    }
}
