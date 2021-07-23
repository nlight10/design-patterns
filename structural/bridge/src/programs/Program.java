package programs;

import developers.Developer;

/**
 * Daddy: GM
 * BirthDate: 23.07.2021
 */
public abstract class Program {
    protected Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}
