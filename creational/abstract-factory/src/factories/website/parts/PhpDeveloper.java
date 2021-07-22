package factories.website.parts;

import factories.creation.parts.Developer;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes php code...");
    }
}
