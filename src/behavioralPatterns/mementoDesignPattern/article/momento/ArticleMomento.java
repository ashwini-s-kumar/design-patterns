package behavioralPatterns.mementoDesignPattern.article.momento;

import behavioralPatterns.mementoDesignPattern.article.originator.Article;

public class ArticleMomento {
    private int id;
    private String name;
    private String content;

    public ArticleMomento(Article article) {
        this.id = article.getId();
        this.name = article.getName();
        this.content = article.getContent();
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "ArticleMomento{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }


}
