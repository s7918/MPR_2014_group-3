package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Article;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql.builder.IEntityBuilder;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.unitofwork.IUnitOfWork;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class ArticleRepository extends Repository<Article>{

    public ArticleRepository(Connection connection, IEntityBuilder<Article> builder, IUnitOfWork uow) {
        super(connection, builder, uow);
    }

    @Override
    protected void setUpInsertQuery(Article entity) throws SQLException {
        insert.setString(1, entity.getContent());
        insert.setDate(2, (Date) entity.getDate());
        insert.setString(3, entity.getTitle());
    }

    @Override
    protected String getInsertQuery() {
        return "INSETR INTO article SET (content, date, title) = (?, ?, ?) VALUES (?, ?, ?)";
    }

    @Override
    protected String getUpdateQuery() {
        return "UDPATE article SET (content, date, title) WHERE id=?";
    }

    @Override
    protected String getTableName() {
        return "article";
    }

    @Override
    protected void setUpUpdateQuery(Article entity) throws SQLException {
        update.setString(1, entity.getContent());
        update.setDate(2, (Date) entity.getDate());
        update.setString(3, entity.getTitle());
        update.setInt(4, entity.getId());
    }
    
    
    
}
