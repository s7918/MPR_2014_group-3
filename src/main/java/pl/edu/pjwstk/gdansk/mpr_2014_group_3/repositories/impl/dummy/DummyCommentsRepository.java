/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.dummy;

import java.util.ArrayList;
import java.util.List;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Article;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Comment;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.User;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.ICommentRepository;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class DummyCommentsRepository implements ICommentRepository{
    
    private DummyDB db;

    public DummyCommentsRepository(DummyDB db) {
        super();
        this.db = db;
    }

    @Override
    public void add(Comment entity) {
        db.comments.add(entity);
    }

    @Override
    public void update(Comment entity) {
    }

    @Override
    public void delete(Comment entity) {
        db.comments.remove(entity);
    }

    @Override
    public Comment get(int id) {
        for (Comment c : db.comments) {
            if(c.getId()==id)
                return c;
        }
        return null;
    }

    @Override
    public List<Comment> getAll() {
        return db.comments;
    }

    @Override
    public List<Comment> byUser(User user) {
        return byUser(user.getId());
    }

    @Override
    public List<Comment> byUser(String userName) {
        for(User u : db.users){
            if(u.getName()==userName)
                return u.getComments();
        }
        return new ArrayList<Comment>();
    }

    @Override
    public List<Comment> byUser(int userId) {
        for(User u : db.users){
            if(u.getId()==userId)
                return u.getComments();
        }
        return new ArrayList<Comment>();
    }
    
    
    
}
