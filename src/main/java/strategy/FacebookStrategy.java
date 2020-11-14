package strategy;

/**
 * @author m.bandidarian on 11/11/2020
 */
public class FacebookStrategy implements ISocialMediaStrategy{

    @Override
    public void connectTo(String name) {
        System.out.printf("Connecting to %s through facebook\n", name);
    }
}
