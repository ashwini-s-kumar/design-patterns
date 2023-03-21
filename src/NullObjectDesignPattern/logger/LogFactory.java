package NullObjectDesignPattern.logger;

public class LogFactory {
    public static Logger getLogger(String type){
        if("console".equalsIgnoreCase(type)){
            return new ConsoleLogger();
        }
        return new NullLogger();
    }
}
