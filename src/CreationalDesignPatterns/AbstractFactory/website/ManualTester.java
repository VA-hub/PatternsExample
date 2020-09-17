package CreationalDesignPatterns.AbstractFactory.website;

import CreationalDesignPatterns.AbstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester tests code...");
    }
}
