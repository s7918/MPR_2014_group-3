package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.dummy;

import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.IArticleRepository;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.ICategoryRepository;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.ICommentRepository;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.IRepositoryCatalog;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.ITypeOfUserRepository;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.IUserRepository;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class DummyRepositoryCatalog implements IRepositoryCatalog{
    private DummyDB db = new DummyDB();

    @Override
    public IArticleRepository getArticles() {
        return new DummyArticleRepository(db);
    }

    @Override
    public ICategoryRepository getCategories() {
        return new DummyCategoryRepository(db);
    }

    @Override
    public ICommentRepository getComments() {
        return new DummyCommentsRepository(db);
    }

    @Override
    public ITypeOfUserRepository getTypeOfUsers() {
        return new DummyTypeOfUserRepository(db);
    }

    @Override
    public IUserRepository getUsers() {
        return new DummyUserRepository(db);
    }
}