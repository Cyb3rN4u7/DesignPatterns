package observer;

import model.Article;

import java.util.List;

public class Subject {
    protected List<Observer> observers;

    public void addObservers(Observer observer){
        if(!observers.contains(observer)){
            System.out.print("Subscribed !\n");
            observers.add(observer);
        }
    }

    public void notifyObservers(Article article){
        for (Observer observer : observers){
            observer.update(article);
        }
    }
}
