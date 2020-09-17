package CreationalDesignPatterns.Factory2;

public class HondaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Honda();
    }
}
