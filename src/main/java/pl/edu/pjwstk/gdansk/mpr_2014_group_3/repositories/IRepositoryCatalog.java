package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories;

import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Article;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Category;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Comment;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.TypeOfUser;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public interface IRepositoryCatalog {
    public IRepository<Article> getArticles();
    public IRepository<Category> getCategories();
    public IRepository<Comment> getComments();
    public IRepository<TypeOfUser> getTypeOfUsers();
    public IUserRepository getUsers();
    
}