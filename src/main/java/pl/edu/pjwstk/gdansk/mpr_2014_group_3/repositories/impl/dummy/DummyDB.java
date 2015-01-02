package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.dummy;

import java.util.ArrayList;
import java.util.List;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Article;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Category;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Comment;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.TypeOfUser;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.User;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class DummyDB {
    public List<Article> articles;
    public List<Category> categories;
    public List<Comment> comments;
    public List<TypeOfUser> typeOfUsers;
    public List<User> users;

    public DummyDB() {
        articles = new ArrayList<Article>();
        categories = new ArrayList<Category>();
        comments = new ArrayList<Comment>();
        typeOfUsers = new ArrayList<TypeOfUser>();
        users = new ArrayList<User>();
    }    
}
