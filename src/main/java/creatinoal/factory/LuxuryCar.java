package creatinoal.factory;

public class LuxuryCar extends Car {

    public LuxuryCar() {
        super(CarType.LUXURY);
        construct();
    }

    @Override
    public void construct() {
        System.out.println("Constructing Luxury Car");
    }
}
