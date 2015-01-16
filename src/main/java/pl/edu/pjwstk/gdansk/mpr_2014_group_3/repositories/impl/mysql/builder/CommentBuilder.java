package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql.builder;

import java.sql.ResultSet;
import java.sql.SQLException;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Comment;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class CommentBuilder implements IEntityBuilder<Comment>{

    @Override
    public Comment build(ResultSet rs) throws SQLException {
        Comment comment = new Comment();
        comment.setId(rs.getInt("id"));
        comment.setContent(rs.getString("content"));
        comment.setDate(rs.getDate("date"));
        return comment;
    }
    
}
