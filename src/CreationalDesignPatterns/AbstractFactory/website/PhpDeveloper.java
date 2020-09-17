package CreationalDesignPatterns.AbstractFactory.website;

import CreationalDesignPatterns.AbstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP Developer write's code...");
    }
}
