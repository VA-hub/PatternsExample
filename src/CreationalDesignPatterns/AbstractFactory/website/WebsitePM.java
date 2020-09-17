package CreationalDesignPatterns.AbstractFactory.website;

import CreationalDesignPatterns.AbstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
