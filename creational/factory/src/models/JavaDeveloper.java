package models;import models.Developer;

/**
 * Daddy: GM
 * BirthDate: 22.07.2021
 */
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes java code...");
    }
}
