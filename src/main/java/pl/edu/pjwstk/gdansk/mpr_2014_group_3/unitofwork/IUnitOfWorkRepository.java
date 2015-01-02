package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.unitofwork;

import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Entity;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public interface IUnitOfWorkRepository {
    public void persistAdd(Entity entity);
    public void persistUpdate(Entity entity);
    public void persistDelete(Entity entity);
}