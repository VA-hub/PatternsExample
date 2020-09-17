package CreationalDesignPatterns.AbstractFactory.website;

import CreationalDesignPatterns.AbstractFactory.Developer;
import CreationalDesignPatterns.AbstractFactory.ProjectManager;
import CreationalDesignPatterns.AbstractFactory.ProjectTeamFactory;
import CreationalDesignPatterns.AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
