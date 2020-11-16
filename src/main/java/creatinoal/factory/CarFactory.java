package creatinoal.factory;

public class CarFactory {


    public static Car buildCar(CarType carType){
        Car car = null;
        switch (carType){
            case SEDAN:{
                car = new SedanCar();
                break;
            }
            case SMALL:{
                car = new SmallCar();
                break;
            }
            case LUXURY:{
                car = new LuxuryCar();
                break;
            }
        }
        return car;
    }


}
