package main.java.pl.edu.pjwstk.gdansk.mpr_2014_group.domain;

/**
 *
 * @author Leszek Karwacki<s7918@pjwstk.edu.pl>
 */
public abstract class Entity {

    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}