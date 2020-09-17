package CreationalDesignPatterns.AbstractFactory2.Doorfactory;

import CreationalDesignPatterns.AbstractFactory2.Door.Door;
import CreationalDesignPatterns.AbstractFactory2.FittingExpert.DoorFittingExpert;

public interface DoorFactory {
    Door makeDoor();
    DoorFittingExpert makeFittinExpert();
}
