package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql;

import java.sql.Connection;
import java.sql.SQLException;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Category;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql.builder.IEntityBuilder;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.unitofwork.IUnitOfWork;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class CategoryRepository extends Repository<Category>{

    public CategoryRepository(Connection connection, IEntityBuilder<Category> builder, IUnitOfWork uow) {
        super(connection, builder, uow);
    }

    @Override
    protected void setUpInsertQuery(Category entity) throws SQLException {
        insert.setString(1, entity.getName());
    }

    @Override
    protected String getInsertQuery() {
        return "INSERT into category (name) VALUES (?)";
    }

    @Override
    protected String getUpdateQuery() {
        return "UPDATE category SET (name) = (?) WHERE id = ?";
    }

    @Override
    protected String getTableName() {
        return "category";
    }

    @Override
    protected void setUpUpdateQuery(Category entity) throws SQLException {
        update.setString(1, entity.getName());
        update.setInt(2, entity.getId());
    }
    
    
    
}
