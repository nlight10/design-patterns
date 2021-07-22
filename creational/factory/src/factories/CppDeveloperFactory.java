package factories;

import models.CppDeveloper;
import models.Developer;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public class CppDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
