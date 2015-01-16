package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql;

import java.sql.Connection;
import java.sql.SQLException;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.TypeOfUser;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql.builder.IEntityBuilder;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.unitofwork.IUnitOfWork;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class TypeOfUserRepository extends Repository<TypeOfUser> {

    public TypeOfUserRepository(Connection connection, IEntityBuilder<TypeOfUser> builder, IUnitOfWork uow) {
        super(connection, builder, uow);
    }

    @Override
    protected void setUpInsertQuery(TypeOfUser entity) throws SQLException {
        insert.setString(1, entity.getName());
    }

    @Override
    protected String getInsertQuery() {
        return "INSERT INTO typeofuser (name) VALUES (?)";
    }

    @Override
    protected String getUpdateQuery() {
        return "UPDATE typeofuser SET (name) = (?) WHERE id = ?";
    }

    @Override
    protected String getTableName() {
        return "typeofuser";
    }

    @Override
    protected void setUpUpdateQuery(TypeOfUser entity) throws SQLException {
        update.setString(1, entity.getName());
        update.setInt(2, entity.getId());
    }
    
}
