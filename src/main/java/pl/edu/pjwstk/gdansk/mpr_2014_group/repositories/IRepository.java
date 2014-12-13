package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group.repositories;

import java.util.List;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group.domain.Entity;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public interface IRepository<TEntity extends Entity> {
    public void add(TEntity entity);
    public void update(TEntity entity);
    public void delete(TEntity entity);
    public TEntity get(int id);
    public List<TEntity> getAll();
}