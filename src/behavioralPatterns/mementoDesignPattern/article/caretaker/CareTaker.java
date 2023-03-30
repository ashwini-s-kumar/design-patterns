package behavioralPatterns.mementoDesignPattern.article.caretaker;

import behavioralPatterns.mementoDesignPattern.article.momento.ArticleMomento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    List<ArticleMomento> momentoList;

    public CareTaker() {
        this.momentoList = new ArrayList<>();
    }

    public void addMomento(ArticleMomento momento){
        momentoList.add(momento);
    }

    public ArticleMomento getMomento(int index){
        return momentoList.get(index);
    }
}
