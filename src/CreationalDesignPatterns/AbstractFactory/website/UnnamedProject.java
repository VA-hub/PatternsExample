package CreationalDesignPatterns.AbstractFactory.website;

import CreationalDesignPatterns.AbstractFactory.Developer;
import CreationalDesignPatterns.AbstractFactory.ProjectManager;
import CreationalDesignPatterns.AbstractFactory.ProjectTeamFactory;
import CreationalDesignPatterns.AbstractFactory.Tester;
import CreationalDesignPatterns.AbstractFactory.banking.BankingTeamFactory;

public class UnnamedProject {
    public static void main(String[] args) {
        ProjectTeamFactory dreamTeam = createDreamTeam("banking");

        Developer developer = dreamTeam.getDeveloper();
        Tester tester = dreamTeam.getTester();
        ProjectManager projectManager = dreamTeam.getProjectManager();

        System.out.println("Creating project:");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
    static ProjectTeamFactory createDreamTeam(String wannaBeAPartOfTeam){
        switch (wannaBeAPartOfTeam){
            case "banking":
                return new BankingTeamFactory();
            case "web":
                return new WebsiteTeamFactory();
            default: throw new RuntimeException("HOLY SHIT!!!");
        }
    }
}
