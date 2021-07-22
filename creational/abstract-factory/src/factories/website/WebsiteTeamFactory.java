package factories.website;

import factories.creation.ProjectTeamFactory;
import factories.creation.parts.Developer;
import factories.creation.parts.ProjectManager;
import factories.creation.parts.Tester;
import factories.website.parts.ManualTester;
import factories.website.parts.PhpDeveloper;
import factories.website.parts.WebsitePM;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getFirstDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Developer getSecondDeveloper() {
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
