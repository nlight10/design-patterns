package adapter;

import application.JavaApplication;
import database.Database;

/**
 * Daddy: GM
 * BirthDate: 23.07.2021
 */
public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}
