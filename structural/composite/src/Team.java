import developers.Developer;

import java.util.ArrayList;
import java.util.List;

/**
 * Daddy: GM
 * BirthDate: 23.07.2021
 */
public class Team implements Developer {
    private List<Developer> developers = new ArrayList<Developer>();

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(Developer developer) {
        developers.remove(developer);
    }

    @Override
    public void writeCode() {
        System.out.println("Team creates project ...\n");
        for (Developer developer: developers) {
            developer.writeCode();
        }
    }
}
