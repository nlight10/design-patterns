package factories;

import factories.banking.BankTeamFactory;
import factories.creation.ProjectTeamFactory;
import factories.creation.parts.Developer;
import factories.creation.parts.ProjectManager;
import factories.creation.parts.Tester;

/**
 * main class of using Abstract Factory
 */
public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankTeamFactory();
        Developer teamLead = projectTeamFactory.getFirstDeveloper();
        Developer developer = projectTeamFactory.getSecondDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating Super Banking project...");
        teamLead.writeCode();
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
