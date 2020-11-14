package strategy;

/**
 * @author m.bandidarian on 11/11/2020
 */
public class LinkedinStrategy implements ISocialMediaStrategy {
    @Override
    public void connectTo(String name) {
        System.out.printf("connecting to %s through LinkedIn\n", name);
    }
}
