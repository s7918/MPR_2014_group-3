package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class TypeOfUser extends Entity {
    private String name;
    
    private List<User> users;

    public TypeOfUser() {
        users = new ArrayList<User>();
    }


    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    
}