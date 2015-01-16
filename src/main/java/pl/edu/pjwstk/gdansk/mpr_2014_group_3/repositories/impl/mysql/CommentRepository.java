package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Comment;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql.builder.IEntityBuilder;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.unitofwork.IUnitOfWork;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class CommentRepository extends Repository<Comment>{

    public CommentRepository(Connection connection, IEntityBuilder<Comment> builder, IUnitOfWork uow) {
        super(connection, builder, uow);
    }

    @Override
    protected void setUpInsertQuery(Comment entity) throws SQLException {
        insert.setString(1, entity.getContent());
        insert.setDate(2, (Date) entity.getDate());
    }

    @Override
    protected String getInsertQuery() {
        return "INSERT INTO comment (content, date) VALUES (?, ?)";
    }

    @Override
    protected String getUpdateQuery() {
        return "UPDATE comment SET (content, date) = (?, ?) WHERE id = ?";
    }

    @Override
    protected String getTableName() {
        return "comment";
    }

    @Override
    protected void setUpUpdateQuery(Comment entity) throws SQLException {
        update.setString(1, entity.getContent());
        update.setDate(2, (Date) entity.getDate());
        update.setInt(3, entity.getId());
    }
    
    
}
