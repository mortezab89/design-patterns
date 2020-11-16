package creatinoal.factory;

public class Main {

    public static void main(String[] args) {
        Car car = CarFactory.buildCar(CarType.LUXURY);
        System.out.println(car instanceof SmallCar);
        System.out.println(car instanceof LuxuryCar);

    }
}
