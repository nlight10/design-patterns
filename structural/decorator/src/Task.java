import developers.Developer;
import developers.JavaDeveloper;
import developers.JavaTeamLead;
import developers.SeniorJavaDeveloper;

/**
 * Daddy: GM
 * BirthDate: 23.07.2021
 */
public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        //Developer developer = new SeniorJavaDeveloper(new JavaTeamLead(new JavaDeveloper()));

        System.out.println(developer.makeJob());
    }
}
