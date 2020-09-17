package CreationalDesignPatterns.AbstractFactory2.Doorfactory;

import CreationalDesignPatterns.AbstractFactory2.Door.Door;
import CreationalDesignPatterns.AbstractFactory2.Door.WoodenDoor;
import CreationalDesignPatterns.AbstractFactory2.FittingExpert.Carpenter;
import CreationalDesignPatterns.AbstractFactory2.FittingExpert.DoorFittingExpert;

public class WoodenDoorFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeFittinExpert() {
        return new Carpenter();
    }
}
