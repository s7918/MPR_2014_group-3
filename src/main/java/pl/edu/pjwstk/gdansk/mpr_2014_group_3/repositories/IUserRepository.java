package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories;

import java.util.List;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.TypeOfUser;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.User;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public interface IUserRepository extends IRepository<User> {
    public List<User> withType(TypeOfUser typeOfUser);
    public List<User> withType(String typeName);
    public List<User> withType(int typeId);   
}