package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql.builder;

import java.sql.ResultSet;
import java.sql.SQLException;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.TypeOfUser;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class TypeOfUserBuilder implements IEntityBuilder<TypeOfUser>{

    @Override
    public TypeOfUser build(ResultSet rs) throws SQLException {
        TypeOfUser typeOfUser = new TypeOfUser();
        typeOfUser.setId(rs.getInt("id"));
        typeOfUser.setName(rs.getString("name"));
        return typeOfUser;
    }
    
}
