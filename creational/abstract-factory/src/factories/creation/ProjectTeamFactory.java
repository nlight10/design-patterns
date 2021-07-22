package factories.creation;

import factories.creation.parts.Developer;
import factories.creation.parts.ProjectManager;
import factories.creation.parts.Tester;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public interface ProjectTeamFactory {
    Developer getFirstDeveloper();

    Developer getSecondDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
