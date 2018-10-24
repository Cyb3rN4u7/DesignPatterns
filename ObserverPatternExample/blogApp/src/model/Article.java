package model;

public class Article {
    private String title,author,content;

    public Article(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }


    @Override
    public String toString() {
        return "\n{"+ title
                + " by " + author
                + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Article article = (Article) o;

        return title.equals(article.title);
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }
}
