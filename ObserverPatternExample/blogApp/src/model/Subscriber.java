package model;

import observer.Observer;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Subscriber : " + this.name;
    }

    @Override
    public void update(Article article) {
        System.out.println( "\nHi , " + name + " ! a new article has come out : \n" + article.toString());
    }
}
