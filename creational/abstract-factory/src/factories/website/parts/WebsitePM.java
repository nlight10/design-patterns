package factories.website.parts;

import factories.creation.parts.ProjectManager;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
