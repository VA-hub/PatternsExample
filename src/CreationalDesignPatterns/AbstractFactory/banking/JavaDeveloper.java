package CreationalDesignPatterns.AbstractFactory.banking;

import CreationalDesignPatterns.AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes code...");
    }
}
