import builders.VisitCardWebsite;
import builders.parts.Website;
import director.Director;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setWebsiteBuilder(new VisitCardWebsite());
        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
