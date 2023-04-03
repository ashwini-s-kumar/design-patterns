package creationalPatterns.singletonDesignPattern.printer;

public class Demo {
    public static void main(String [] arrgs){
        PrinterSpooler printerSpooler = PrinterSpooler.getInstance();
        System.out.println("printerSpooler object : " + printerSpooler);
        printerSpooler.addJob("This is an real time example of Singleton pattern");
        printerSpooler.addJob("This is a creational design pattern");

        printerSpooler = PrinterSpooler.getInstance();
        System.out.println("printerSpooler object : " + printerSpooler);

        printerSpooler.printNextJob();
        printerSpooler.printNextJob();


    }
}
