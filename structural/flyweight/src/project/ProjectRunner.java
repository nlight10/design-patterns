package project;

import project.developers.Developer;
import project.factory.DeveloperFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Daddy: GM
 * BirthDate: 26.07.2021
 */
public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = new DeveloperFactory();

        List<Developer> developers = new ArrayList<>();

        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("java"));
        developers.add(developerFactory.getDeveloperBySpecialty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialty("c++"));
        developers.add(developerFactory.getDeveloperBySpecialty("c++"));

        System.out.println("developers.size = " + developers.size());

        for(Developer developer: developers){
            developer.writeCode();
        }

    }
}
