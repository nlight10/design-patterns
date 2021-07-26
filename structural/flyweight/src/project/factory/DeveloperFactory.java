package project.factory;

import project.developers.CppDeveloper;
import project.developers.Developer;
import project.developers.JavaDeveloper;

import java.util.HashMap;
import java.util.Map;

/**
 * Daddy: GM
 * BirthDate: 26.07.2021
 */
public class DeveloperFactory {

    // Простая Фабрика всегда возвращает новый объект. Здесь же объекты создаются лишь по одному разу
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = developers.get(specialty);

        if (developer == null) {
            switch (specialty) {
                case "java":
                    System.out.println("Hiring Java developer");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring C++ developer");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(specialty, developer);
        }
        return developer;
    }
}
