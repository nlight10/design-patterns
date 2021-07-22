package factories;

import models.Developer;
import models.JavaDeveloper;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
