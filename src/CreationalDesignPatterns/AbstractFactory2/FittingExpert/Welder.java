package CreationalDesignPatterns.AbstractFactory2.FittingExpert;

public class Welder implements DoorFittingExpert {
    @Override
    public void getDescription() {
        System.out.println("Creating iron door");
    }
}
