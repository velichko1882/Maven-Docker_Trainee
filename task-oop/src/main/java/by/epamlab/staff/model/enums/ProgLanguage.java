package by.epamlab.staff.model.enums;

/**
 * Enum ProgLanguage describes the programming languages and the programmer's salary increment.
 * @author Valentin Velichko
 * */
public enum ProgLanguage {

    JAVA(300),
    PHP(200),
    C(150),
    JAVASCRIPT(250),
    PYTHON(220),
    RUBY(180);

    private int bonusProgrammer;

    ProgLanguage(int bonusProgrammer) {
        this.bonusProgrammer = bonusProgrammer;
    }

    public int getBonusProgrammer() {
        return bonusProgrammer;
    }
}
