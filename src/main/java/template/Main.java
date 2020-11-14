package template;

/**
 * @author m.bandidarian on 11/11/2020
 */
public class Main {

    public static void main(String[] args) {
        House concreteWallHouse = new ConcreteWallHouse();
        concreteWallHouse.buildHouse();;

        System.out.println();
        House glassWallHouse = new GlassWallHouse();
        glassWallHouse.buildHouse();
    }
}
