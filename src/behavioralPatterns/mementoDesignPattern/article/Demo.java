package behavioralPatterns.mementoDesignPattern.article;

import behavioralPatterns.mementoDesignPattern.article.caretaker.CareTaker;
import behavioralPatterns.mementoDesignPattern.article.originator.Article;

public class Demo {
    public static void main(String [] arrs){
        CareTaker careTaker = new CareTaker();

        Article article1 = new Article(1,"Environment");
        article1.setContent("Save environment");
        careTaker.addMomento(article1.saveArticle());

        Article article2 = new Article(2, "Economy");
        article2.setContent("Understanding the Micro and Macro economy is important");
        careTaker.addMomento(article2.saveArticle());

        article1.setContent("Waste management protects environment");

        article2.setContent("Economic changes impact our savings");

        System.out.println("Current article 1 : " + article1.toString());
        System.out.println("Current article 2 : " + article2.toString());

        System.out.println("Previous saved article 1 : " + careTaker.getMomento(0).toString());
        System.out.println("Previous saved article 2 : " + careTaker.getMomento(1).toString());

        System.out.println("Restoring articles .. ");
        article1.restoreArticle(careTaker.getMomento(0));
        article2.restoreArticle(careTaker.getMomento(1));

        System.out.println("Current article 1 : " + article1.toString());
        System.out.println("Current article 2 : " + article2.toString());

    }
}
