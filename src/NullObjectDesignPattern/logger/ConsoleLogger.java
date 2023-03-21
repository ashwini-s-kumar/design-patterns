package NullObjectDesignPattern.logger;

public class ConsoleLogger implements Logger{

    @Override
    public void log(String message) {
        System.out.println("console log : " + message);
    }
}
