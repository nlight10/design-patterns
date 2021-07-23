import factory.Project;
import factory.ProjectFactory;

/**
 * Daddy: GM
 * BirthDate: 23.07.2021
 */
public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "Super Project", "Code of project...");

        System.out.println(master);
        System.out.println(master.hashCode());

        ProjectFactory factory = new ProjectFactory(master);
        Project masterClone = factory.cloneProject();

        System.out.println("===============================");
        System.out.println(masterClone);
        System.out.println(masterClone.hashCode());
    }
}
