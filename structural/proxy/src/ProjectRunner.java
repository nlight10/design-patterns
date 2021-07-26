/**
 * Daddy: GM
 * BirthDate: 26.07.2021
 */
public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.someUrl.com/realProject");

        project.run();
    }
}
