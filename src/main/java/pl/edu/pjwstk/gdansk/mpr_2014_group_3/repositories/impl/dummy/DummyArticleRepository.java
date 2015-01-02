/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.dummy;

import java.util.ArrayList;
import java.util.List;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Article;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Category;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.User;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.IArticleRepository;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class DummyArticleRepository implements IArticleRepository{
    
    private DummyDB db;

    public DummyArticleRepository(DummyDB db) {
        super();
        this.db = db;
    }

    @Override
    public void add(Article entity) {
        db.articles.add(entity);
    }

    @Override
    public void update(Article entity) {
    }

    @Override
    public void delete(Article entity) {
        db.articles.remove(entity);
    }

    @Override
    public Article get(int id) {
        for(Article a : db.articles) {
            if(a.getId()==id)
                return a;
        }
        return null;
    }

    @Override
    public List<Article> getAll() {
        return db.articles;
    }

    @Override
    public List<Article> withCategory(Category category) {
        return withCategory(category.getId());
    }

    @Override
    public List<Article> withCategory(String categoryName) {
        for(Category c : db.categories){
            if(c.getName()==categoryName)
                return c.getArticles();
        }
        return new ArrayList<Article>();
    }

    @Override
    public List<Article> withCategory(int categoryId) {
        for(Category c : db.categories){
            if(c.getId()==categoryId)
                return c.getArticles();
        }
        return new ArrayList<Article>();
    }

    @Override
    public List<Article> byUser(User user) {
        return byUser(user.getId());
    }

    @Override
    public List<Article> byUser(String userName) {
        for(User u : db.users){
            if(u.getName()==userName)
                return u.getArticles();
        }
        return new ArrayList<Article>();
    }

    @Override
    public List<Article> byUser(int userId) {
        for(User u : db.users){
            if(u.getId()==userId)
                return u.getArticles();
        }
        return new ArrayList<Article>();
    }   
}