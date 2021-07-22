package factories.banking.parts;

import factories.creation.parts.Developer;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}
