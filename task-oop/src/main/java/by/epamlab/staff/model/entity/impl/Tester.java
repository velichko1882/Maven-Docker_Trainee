package by.epamlab.staff.model.entity.impl;

import by.epamlab.staff.model.entity.Engineer;
import by.epamlab.staff.model.entity.Salary;
import by.epamlab.staff.model.enums.Category;
import by.epamlab.staff.model.enums.TesterType;

/**
 * Class Tester describes the company's testers.
 * - extends - Engineer.
 * @author Valentin Velichko
 * */
public class Tester extends Engineer {

    /**
     * This field contains information about the type of tester.
     * */
    private TesterType testerType;

    public Tester() {
    }

    public Tester(int employeeId, String firstName, String lastName, int workExperience,
                  Salary salary, Category category, int workPlaceNumber, TesterType testerType) {
        super(employeeId, firstName, lastName, workExperience, salary, category, workPlaceNumber);
        this.testerType = testerType;
    }

    public TesterType getTesterType() {
        return testerType;
    }

    public void setTesterType(TesterType testerType) {
        this.testerType = testerType;
    }

    /**
     * This method describes the program testing logic.
     * */
    public void testProgram(){
        System.out.println("Tester " + getFirstName() + " testing new module.");
    }

    /**
     * This method describes the logic of the report on bugs found.
     * */
    public void reportBugs(){
        System.out.println("Tester " + getFirstName() + " report new bug.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tester{");
        sb.append(super.toString());
        sb.append(", Type = ").append(testerType);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int getTotalSalary() {
        return super.getTotalSalary() + testerType.getBonusTester();
    }

    public void workInProject() {
        testProgram();
        reportBugs();
    }

    @Override
    public void work() {
        startWork();
        attendMetting();
        workInProject();
        endWork();
    }
}
