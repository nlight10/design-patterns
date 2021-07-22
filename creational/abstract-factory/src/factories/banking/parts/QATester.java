package factories.banking.parts;

import factories.creation.parts.Tester;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking project...");
    }
}
