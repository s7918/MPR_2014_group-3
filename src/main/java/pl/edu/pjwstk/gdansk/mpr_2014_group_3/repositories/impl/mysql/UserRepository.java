package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql;

import java.sql.Connection;
import java.sql.SQLException;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.User;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql.builder.IEntityBuilder;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.unitofwork.IUnitOfWork;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class UserRepository extends Repository<User>{

    public UserRepository(Connection connection, IEntityBuilder<User> builder, IUnitOfWork uow) {
        super(connection, builder, uow);
    }

    @Override
    protected void setUpInsertQuery(User entity) throws SQLException {
        insert.setString(1, entity.getLogin());
        insert.setString(2, entity.getPassword());
        insert.setString(3, entity.getName());
        insert.setString(4, entity.getSurname());
        insert.setString(5, entity.getMail());
    }

    @Override
    protected String getInsertQuery() {
        return "INSERT INTO user (login, password, name, surname, mail) VALUES (?, ?, ?, ?, ?)";
    }

    @Override
    protected String getUpdateQuery() {
        return "UPDATE user SET (login, password, name, surname, mail) = (?, ?, ?, ?, ?) WHERE id = ?";
    }

    @Override
    protected String getTableName() {
        return "user";
    }

    @Override
    protected void setUpUpdateQuery(User entity) throws SQLException {
        update.setString(1, entity.getLogin());
        update.setString(2, entity.getPassword());
        update.setString(3, entity.getName());
        update.setString(4, entity.getSurname());
        update.setString(5, entity.getMail());
        update.setInt(6, entity.getId());
    }
    
}
