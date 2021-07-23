import developers.CppDeveloper;
import developers.Developer;
import developers.JavaDeveloper;

/**
 * Daddy: GM
 * BirthDate: 23.07.2021
 */
public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer firstJavaDeveloper = new JavaDeveloper();
        Developer secondJavaDeveloper = new JavaDeveloper();
        Developer cppDeveloper = new CppDeveloper();

        team.addDeveloper(firstJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.writeCode();
    }
}
