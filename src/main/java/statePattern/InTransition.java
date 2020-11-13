package statePattern;

public class InTransition implements PackageState{

    private static final InTransition instance = new InTransition();

    public InTransition() {
    }

    public static InTransition instance(){
        return instance;
    }

    public void update(Package aPackage) {

    }
}
