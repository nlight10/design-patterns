package factories.banking;

import factories.banking.parts.BankingPM;
import factories.banking.parts.JavaDeveloper;
import factories.banking.parts.QATester;
import factories.creation.ProjectTeamFactory;
import factories.creation.parts.Developer;
import factories.creation.parts.ProjectManager;
import factories.creation.parts.Tester;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public class BankTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getFirstDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
