package CreationalDesignPatterns.AbstractFactory2.Door;

public class WoodenDoor implements Door {
    @Override
    public void getDecription() {
        System.out.println("I'm wooden door");
    }
}
