package by.epamlab.staff.model.enums;

/**
 * Enum TesterType describes the type of tester and his salary increment.
 * @author Valentin Velichko
 * */
public enum TesterType {

    FUNCTIONAL(50), AUTOMATED(150);
    
    private int bonusTester;

    TesterType(int bonusTester) {
        this.bonusTester = bonusTester;
    }

    public int getBonusTester() {
        return bonusTester;
    }
}
