import developers.CppDeveloper;
import developers.JavaDeveloper;
import programs.BankSystem;
import programs.Program;
import programs.StockExchange;

/**
 * Daddy: GM
 * BirthDate: 23.07.2021
 */
public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for (Program program: programs) {
            program.developProgram();
        }
    }
}
