package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql.builder;

import java.sql.ResultSet;
import java.sql.SQLException;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Article;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.User;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class ArticleBuilder implements IEntityBuilder<Article>{

    @Override
    public Article build(ResultSet rs) throws SQLException {
        Article article = new Article();
        article.setId(rs.getInt("id"));
        article.setContent(rs.getString("content"));
        article.setDate(rs.getDate("date"));
        article.setTitle(rs.getString("title"));
        return article;
    }
    
}
