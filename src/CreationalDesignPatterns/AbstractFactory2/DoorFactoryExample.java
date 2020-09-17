package CreationalDesignPatterns.AbstractFactory2;

import CreationalDesignPatterns.AbstractFactory2.Door.Door;
import CreationalDesignPatterns.AbstractFactory2.Doorfactory.DoorFactory;
import CreationalDesignPatterns.AbstractFactory2.Doorfactory.IronDoorFactory;
import CreationalDesignPatterns.AbstractFactory2.Doorfactory.WoodenDoorFactory;
import CreationalDesignPatterns.AbstractFactory2.FittingExpert.DoorFittingExpert;

public class DoorFactoryExample {
    public static void main(String[] args) {
        //дерево
        DoorFactory doorFactory1 = new WoodenDoorFactory();
        Door door1 = doorFactory1.makeDoor();
        DoorFittingExpert expert1 = doorFactory1.makeFittinExpert();
        door1.getDecription();
        expert1.getDescription();

        //железо
        DoorFactory doorFactory2 = new IronDoorFactory();
        Door door2 = doorFactory2.makeDoor();
        DoorFittingExpert expert2 = doorFactory2.makeFittinExpert();
        door2.getDecription();
        expert2.getDescription();
    }


}
