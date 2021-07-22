package factories.banking.parts;

import factories.creation.parts.ProjectManager;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manages banking project...");
    }
}
