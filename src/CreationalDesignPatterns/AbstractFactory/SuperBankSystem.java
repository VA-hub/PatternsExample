package CreationalDesignPatterns.AbstractFactory;

import CreationalDesignPatterns.AbstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating Bank system:");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
