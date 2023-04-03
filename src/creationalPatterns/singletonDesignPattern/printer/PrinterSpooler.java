package creationalPatterns.singletonDesignPattern.printer;

import java.util.LinkedList;
import java.util.Queue;

public class PrinterSpooler {
    private static PrinterSpooler instance;
    private Queue<String> printQueue;

    // Private constructor to prevent instantiation from outside the class
    private PrinterSpooler() {
        printQueue = new LinkedList<String>();
    }

    // Static method to get the single instance of the class
    public static PrinterSpooler getInstance() {
        if (instance == null) {
            instance = new PrinterSpooler();
        }
        return instance;
    }

    // Method to add a print job to the queue
    public void addJob(String job) {
        printQueue.add(job);
    }

    // Method to print the next job in the queue
    public void printNextJob() {
        String job = printQueue.poll();
        if (job != null) {
            System.out.println("Printing job: " + job);
        }
    }
}
