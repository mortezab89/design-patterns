package template;

/**
 * @author m.bandidarian on 11/11/2020
 */
public class ConcreteWallHouse extends House {
    @Override
    public void decorateHouse() {
        System.out.println("Decorating concrete wall house");
    }

    @Override
    public void paintHouse() {
        System.out.println("Painting concrete wall house");
    }

    @Override
    public void constructWall() {
        System.out.println("Constructing walls for concrete wall house");
    }

    @Override
    public void constructDoors() {
        System.out.println("Constructing doors for concrete wall house");
    }

    @Override
    public void constructWindows() {
        System.out.println("Constructing windows for concrete wall house");
    }
}
