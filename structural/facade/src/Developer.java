/**
 * Daddy: GM
 * BirthDate: 26.07.2021
 */
public class Developer {
    public void doJobBeforeDeadline(BugTracker bugTracker) {
        if (bugTracker.isActiveSprint()) {
            System.out.println("Developer is solving problems...");
        } else {
            System.out.println("Developer is reading Habrhabr...");
        }
    }
}
