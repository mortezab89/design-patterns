package statePattern;

public class ShippedState implements PackageState{

    private static final ShippedState instance = new ShippedState();

    public ShippedState() {
    }

    public static ShippedState instance(){
        return instance;
    }

    public void update(Package aPackage) {
        aPackage.setState(InTransition.instance());
    }
}
