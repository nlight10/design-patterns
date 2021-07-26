/**
 * Daddy: GM
 * BirthDate: 26.07.2021
 */
public class InsertCommand implements Command {
    Database database;

    public InsertCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.insert();
    }
}
