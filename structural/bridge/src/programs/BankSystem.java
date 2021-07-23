package programs;

import developers.Developer;

/**
 * Daddy: GM
 * BirthDate: 23.07.2021
 */
public class BankSystem extends Program {

    protected BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}
