package by.epamlab.staff.model.entity;

import by.epamlab.staff.model.enums.Category;
import by.epamlab.staff.model.interfaces.Project;
import by.epamlab.staff.model.interfaces.WorkTime;

/**
 * Class Engineer describes the engineering staff of the company.
 * - extends - Employee.
 * - implements - WorkTime, Project.
 * @author Valentin Velichko.
 * */
public abstract class Engineer extends Employee implements WorkTime, Project {

    /**
     * This field contains information about the engineer category.
     * */
    private Category category;

    /**
     * This field contains information about the number of the engineer’s workplace.
     * */
    private int workPlaceNumber;

    public Engineer() {
    }

    public Engineer(int employeeId, String firstName, String lastName, int workExperience,
                    Salary salary, Category category, int workPlaceNumber) {
        super(employeeId, firstName, lastName, workExperience, salary);
        this.category = category;
        this.workPlaceNumber = workPlaceNumber;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getWorkPlaceNumber() {
        return workPlaceNumber;
    }

    public void setWorkPlaceNumber(int workPlaceNumber) {
        this.workPlaceNumber = workPlaceNumber;
    }

    public void startWork() {
        System.out.println(getFirstName() + " started work in his workplace.");
    }

    public void endWork() {
        System.out.println(getFirstName() + " finished work in his workplace.");
    }

    public void attendMetting() {
        System.out.println("Listens and answers questions on the metting.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" Category = ").append(category);
        sb.append(", Work place number = ").append(workPlaceNumber);
        return sb.toString();
    }

    public int getTotalSalary() {
        return getSalary().getBaseSalary() + category.getBonusCategory();
    }
}
