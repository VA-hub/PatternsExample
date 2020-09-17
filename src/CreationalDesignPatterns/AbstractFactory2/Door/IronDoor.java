package CreationalDesignPatterns.AbstractFactory2.Door;

public class IronDoor implements Door {
    @Override
    public void getDecription() {
        System.out.println("I'm iron door");
    }
}
