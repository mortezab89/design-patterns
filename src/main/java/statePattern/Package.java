package statePattern;

public class Package {

    private PackageState state;
    private String testPackage;

    public Package(PackageState state, String testPackage) {

        this.state = state;
        this.testPackage = testPackage;

        if(state == null)
            this.state = AcknowledgedState.instance();
    }

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public String getTestPackage() {
        return testPackage;
    }

    public void setTestPackage(String testPackage) {
        this.testPackage = testPackage;
    }

    public void updateState() {
        state.update(this);
    }
}
