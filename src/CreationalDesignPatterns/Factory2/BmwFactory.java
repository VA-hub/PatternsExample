package CreationalDesignPatterns.Factory2;

public class BmwFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new Bmw();
    }
}
