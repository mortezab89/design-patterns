package template;

/**
 * @author m.bandidarian on 11/11/2020
 */
public class GlassWallHouse extends House {
    @Override
    public void decorateHouse() {
        System.out.println("Decorating glass wall house");
    }

    @Override
    public void paintHouse() {
        System.out.println("Painting glass wall house");
    }

    @Override
    public void constructWall() {
        System.out.println("Constructing walls for glass wall house");
    }

    @Override
    public void constructDoors() {
        System.out.println("Constructing doors for glass wall house");
    }

    @Override
    public void constructWindows() {
        System.out.println("Constructing windows for glass wall house");
    }
}
