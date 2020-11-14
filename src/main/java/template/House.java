package template;

/**
 * @author m.bandidarian on 11/11/2020
 */
public abstract class House {

    public void buildHouse(){

        constructBase();
        constructRoof();
        decorateHouse();
        paintHouse();
        constructRoof();
        constructWall();
        constructDoors();
        constructWindows();
    }

    public abstract void decorateHouse();
    public abstract void paintHouse();
    public abstract void constructWall();
    public abstract void constructDoors();
    public abstract void constructWindows();

    public final void constructBase(){
        System.out.println("Constructing Base");
    }

    public final void constructRoof(){
        System.out.println("Constructing Roof");
    }

}
