package otherPatterns.NullObjectDesignPattern.logger;

import otherPatterns.NullObjectDesignPattern.logger.loggers.Logger;

public class Demo {
    public static void main(String [] arr){
        Logger logger;
        logger = LogFactory.getLogger("console");
        logger.log("The project is using console logs");

        logger = LogFactory.getLogger("file");
        logger.log("The project is using file logs");
    }
}
