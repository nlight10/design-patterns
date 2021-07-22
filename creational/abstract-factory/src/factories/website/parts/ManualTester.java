package factories.website.parts;

import factories.creation.parts.Tester;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests website...");
    }
}
