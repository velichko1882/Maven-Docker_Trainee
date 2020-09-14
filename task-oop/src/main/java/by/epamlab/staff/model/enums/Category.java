package by.epamlab.staff.model.enums;

/**
 * Enum Category describes the engineer category and the salary increment.
 * @author Valentin Velichko
 * */
public enum Category {

    JUNIOR(100), MIDDLE(300), SENIOR(500);

    private int bonusCategory;

    Category(int bonusCategory) {
        this.bonusCategory = bonusCategory;
    }

    public int getBonusCategory() {
        return bonusCategory;
    }

}
