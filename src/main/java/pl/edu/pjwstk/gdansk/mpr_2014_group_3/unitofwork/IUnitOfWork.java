package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.unitofwork;

import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Entity;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public interface IUnitOfWork {
    public void commit();
    public void rollback();
    public void markAsNew(Entity entity, IUnitOfWorkRepository repository);
    public void markAsDirty(Entity entity, IUnitOfWorkRepository repository);
    public void markAsDelete(Entity entity, IUnitOfWorkRepository repository);
    
}
