/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.dummy;

import java.util.ArrayList;
import java.util.List;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Article;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.TypeOfUser;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.User;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.IRepository;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.IUserRepository;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class DummyUserRepository implements IUserRepository{
    private DummyDB db;

    public DummyUserRepository(DummyDB db) {
        super();
        this.db = db;
    }

    @Override
    public void add(User entity) {
        db.users.add(entity);
    }

    @Override
    public void update(User entity) {
    }

    @Override
    public void delete(User entity) {
        db.users.remove(entity);
    }

    @Override
    public User get(int id) {
        for(User u : db.users){
            if(u.getId()==id)
                return u;
        }
        return null;            
    }

    @Override
    public List<User> getAll() {
        return db.users;
    }

    @Override
    public List<User> withType(TypeOfUser typeOfUser) {
        return withType(typeOfUser.getId());
    }

    @Override
    public List<User> withType(String typeName) {
        for(TypeOfUser t : db.typeOfUsers){
            if(t.getName()==typeName)
                return t.getUsers();
        }
        return new ArrayList<User>();
    }

    @Override
    public List<User> withType(int typeId) {
        for(TypeOfUser t : db.typeOfUsers){
            if(t.getId()==typeId)
                return t.getUsers();
        }
        return new ArrayList<User>();
    }
}
