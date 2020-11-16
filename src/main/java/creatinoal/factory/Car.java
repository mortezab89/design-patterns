package creatinoal.factory;

public abstract class Car {

    private CarType model;

    public Car(CarType carType) {
        this.model = carType;
    }

    public abstract void construct();

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}
