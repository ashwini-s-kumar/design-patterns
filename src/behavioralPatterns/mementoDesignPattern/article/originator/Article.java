package behavioralPatterns.mementoDesignPattern.article.originator;

import behavioralPatterns.mementoDesignPattern.article.momento.ArticleMomento;

public class Article {
    private int id;
    private String name;
    private String content;

    public Article(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ArticleMomento saveArticle(){
        return new ArticleMomento(this);
    }

    public void restoreArticle(ArticleMomento momento){
        this.id = momento.getId();
        this.name = momento.getName();
        this.content = momento.getContent();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
