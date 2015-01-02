package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */

public class Article extends Entity {
    private String title;
    private String content;
    private User author;
    private Date date;
    private List<Category> categories;
    private List<Comment> comments;

    public Article() {
        categories = new ArrayList<Category>();
        comments = new ArrayList<Comment>();
    }

    
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
    
    
}