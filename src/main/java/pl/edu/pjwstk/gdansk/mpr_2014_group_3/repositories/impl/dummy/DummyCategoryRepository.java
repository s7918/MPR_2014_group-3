package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.dummy;

import java.util.List;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Category;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.ICategoryRepository;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class DummyCategoryRepository implements ICategoryRepository{
    private DummyDB db;
    
    public DummyCategoryRepository(DummyDB db) {
        super();
        this.db = db;
    }

    @Override
    public void add(Category entity) {
        db.categories.add(entity);
    }

    @Override
    public void update(Category entity) {
    }

    @Override
    public void delete(Category entity) {
        db.categories.remove(entity);
    }

    @Override
    public Category get(int id) {
        for(Category c : db.categories){
            if(c.getId()==id)
                return c;
        }
        return null;
    }

    @Override
    public List<Category> getAll() {
        return db.categories;
    }
}
