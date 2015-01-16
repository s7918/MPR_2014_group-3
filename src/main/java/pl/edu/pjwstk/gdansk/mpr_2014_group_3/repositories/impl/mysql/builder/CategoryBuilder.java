package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.repositories.impl.mysql.builder;

import java.sql.ResultSet;
import java.sql.SQLException;
import main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain.Category;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public class CategoryBuilder implements IEntityBuilder<Category>{

    @Override
    public Category build(ResultSet rs) throws SQLException {
        Category category = new Category();
        category.setId(rs.getInt("id"));
        category.setName(rs.getString("name"));
        return category;
    }
    
    
}
