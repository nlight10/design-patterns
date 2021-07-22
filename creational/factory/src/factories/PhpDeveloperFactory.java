package factories;

import models.Developer;
import models.PhpDeveloper;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public class PhpDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
