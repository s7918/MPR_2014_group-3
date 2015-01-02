package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories;

import java.util.List;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Article;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Category;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.User;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public interface IArticleRepository extends IRepository<Article> {
    public List<Article> withCategory(Category category);
    public List<Article> withCategory(String categoryName);
    public List<Article> withCategory(int categoryId);

    public List<Article> byUser(User user);
    public List<Article> byUser(String userName);
    public List<Article> byUser(int userId);
}