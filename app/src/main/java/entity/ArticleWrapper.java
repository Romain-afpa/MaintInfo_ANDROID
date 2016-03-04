package entity;

import java.util.List;

/**
 * Created by Romain et Orianne on 28/02/2016.
 */
public class ArticleWrapper {

    private List<Article> articles;

    public ArticleWrapper(){}

    public ArticleWrapper(List<Article> articles) {
        this.articles = articles;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
