package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.dummy;

import java.util.List;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.TypeOfUser;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.ITypeOfUserRepository;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class DummyTypeOfUserRepository implements ITypeOfUserRepository{
    private DummyDB db;

    public DummyTypeOfUserRepository(DummyDB db) {
        super();
        this.db = db;
    }

    @Override
    public void add(TypeOfUser entity) {
        db.typeOfUsers.add(entity);
    }

    @Override
    public void update(TypeOfUser entity) {
    }

    @Override
    public void delete(TypeOfUser entity) {
        db.typeOfUsers.remove(entity);
    }

    @Override
    public TypeOfUser get(int id) {
        for(TypeOfUser t : db.typeOfUsers){
            if(t.getId()==id)
                return t;
        }
        return null;
    }

    @Override
    public List<TypeOfUser> getAll() {
        return db.typeOfUsers;
    }
}