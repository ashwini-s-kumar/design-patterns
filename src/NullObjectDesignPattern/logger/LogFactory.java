package NullObjectDesignPattern.logger;

import NullObjectDesignPattern.logger.loggers.ConsoleLogger;
import NullObjectDesignPattern.logger.loggers.Logger;
import NullObjectDesignPattern.logger.loggers.NullLogger;

public class LogFactory {
    public static Logger getLogger(String type){
        if("console".equalsIgnoreCase(type)){
            return new ConsoleLogger();
        }
        return new NullLogger();
    }
}
