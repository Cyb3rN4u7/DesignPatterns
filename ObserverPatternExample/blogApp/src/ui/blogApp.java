package ui;

import model.Article;
import model.Blog;
import model.Subscriber;

public class blogApp {

    public static void main(String[] args) {
        Blog blog = new Blog("Achilles Blog");
        Subscriber subscriber1 = new Subscriber("Geek Nick");
        Subscriber subscriber2 = new Subscriber("Nerdy Bill");

        Article article1 = new  Article("Design Patterns - Observer","content of our cool article","Achilles");
        Article article2 = new  Article("How to Geek","content of our cool article","Geek Nick");

        blog.subscribe(subscriber1);
        blog.subscribe(subscriber2);

        blog.publishArticle(article1);
        blog.publishArticle(article2);
    }
}
