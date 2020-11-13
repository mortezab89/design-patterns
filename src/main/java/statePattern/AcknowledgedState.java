package statePattern;

public class AcknowledgedState implements PackageState {

    private static final AcknowledgedState instance = new AcknowledgedState();

    public AcknowledgedState() {
    }

    public static AcknowledgedState instance(){
        return instance;
    }

    public void update(Package aPackage) {
        aPackage.setState(ShippedState.instance());
    }
}
