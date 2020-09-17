package CreationalDesignPatterns.AbstractFactory2.Doorfactory;

import CreationalDesignPatterns.AbstractFactory2.Door.Door;
import CreationalDesignPatterns.AbstractFactory2.Door.IronDoor;
import CreationalDesignPatterns.AbstractFactory2.FittingExpert.DoorFittingExpert;
import CreationalDesignPatterns.AbstractFactory2.FittingExpert.Welder;

public class IronDoorFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert makeFittinExpert() {
        return new Welder();
    }
}
