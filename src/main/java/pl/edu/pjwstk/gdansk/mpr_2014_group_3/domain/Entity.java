package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group_3.domain;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public abstract class Entity {

    protected int id;
    protected EntityState state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EntityState getState() {
        return state;
    }

    public void setState(EntityState state) {
        this.state = state;
    }
    
}