import factories.DeveloperFactory;
import factories.CppDeveloperFactory;
import factories.JavaDeveloperFactory;
import factories.PhpDeveloperFactory;
import models.Developer;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("java");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty.");
        }
    }
}
