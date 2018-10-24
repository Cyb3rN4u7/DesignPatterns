package model;

import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class Blog extends Subject{
    private List<Article> articles;
    private String name;

    public Blog(String name){
        this.name = name;
        articles = new ArrayList<>();
        // initialise observers
        observers = new ArrayList<>();
    }

    public void publishArticle(Article a) {
        if(!articles.contains(a)){
            articles.add(a);
            System.out.println("\n "+name+ " is Publishing Article : " + a +"\n");
            notifyObservers(a);

        }
    }

    public void subscribe(Subscriber subscriber){

        System.out.println(subscriber.getName() + " subscribing to " + name);
        addObservers(subscriber);
    }


}
