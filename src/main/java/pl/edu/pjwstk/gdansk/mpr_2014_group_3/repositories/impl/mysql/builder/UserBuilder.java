package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql.builder;

import java.sql.ResultSet;
import java.sql.SQLException;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.User;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class UserBuilder implements IEntityBuilder<User>{

    @Override
    public User build(ResultSet rs) throws SQLException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setLogin(rs.getString("login"));
        user.setPassword(rs.getString("password"));
        user.setName(rs.getString("name"));
        user.setSurname(rs.getString("surname"));
        user.setMail(rs.getString("mail"));
        return user;
    }
    
}
