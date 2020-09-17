package CreationalDesignPatterns.AbstractFactory2.FittingExpert;

public class Carpenter implements DoorFittingExpert {
    @Override
    public void getDescription() {
        System.out.println("Creating wooden door");
    }
}
