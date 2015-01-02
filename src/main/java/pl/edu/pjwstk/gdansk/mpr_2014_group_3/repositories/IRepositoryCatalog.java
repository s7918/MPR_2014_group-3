package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public interface IRepositoryCatalog {
    public IArticleRepository getArticles();
    public ICategoryRepository getCategories();
    public ICommentRepository getComments();
    public ITypeOfUserRepository getTypeOfUsers();
    public IUserRepository getUsers();
    
}