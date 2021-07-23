package decorators;

import developers.Developer;

/**
 * Daddy: GM
 * BirthDate: 23.07.2021
 */
public class DeveloperDecorator implements Developer {
    Developer developer;

    public DeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String makeJob() {
        return developer.makeJob();
    }
}
