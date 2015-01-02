package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories;

import java.util.List;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Comment;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.User;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public interface ICommentRepository extends IRepository<Comment> {
    public List<Comment> byUser(User user);
    public List<Comment> byUser(String userName);
    public List<Comment> byUser(int userId);
}