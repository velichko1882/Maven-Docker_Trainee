package by.epamlab.staff.model.interfaces;

/**
 * Interface Payable contains methods for calculating salaries.
 * @author Valentin Velichko
 * */
public interface Payable {

    /**
     * This method describes the logic for calculating the full salary of an employee,
     * taking into account all bonuses.
     * @return full salary of an employee in dollars.
     * */
    int getTotalSalary();
}
