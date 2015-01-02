package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain;

import java.util.Date;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class Comment extends Entity {
    private String content;
    private User author;
    private Date date;
    private Article article;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
    
    
    
}