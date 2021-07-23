import adapter.AdapterJavaToDatabase;
import database.Database;

/**
 * Daddy: GM
 * BirthDate: 23.07.2021
 */
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
