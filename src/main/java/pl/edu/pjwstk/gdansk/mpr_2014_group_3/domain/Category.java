package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */

public class Category extends Entity {
    private String name;
    private List<Article> articles;

    public Category() {
        articles = new ArrayList<Article>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }   
}