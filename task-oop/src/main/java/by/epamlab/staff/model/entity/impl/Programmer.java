package by.epamlab.staff.model.entity.impl;

import by.epamlab.staff.model.entity.Engineer;
import by.epamlab.staff.model.entity.Salary;
import by.epamlab.staff.model.enums.Category;
import by.epamlab.staff.model.enums.ProgLanguage;

/**
 * Class Programmer describes the programmers of the company.
 * - extends - Engineer.
 * @author Valentin Velichko
 * */
public class Programmer extends Engineer {

    /**
     * This field contains information about the programming language in which the programmer writes.
     * */
    private ProgLanguage progLanguage;

    public Programmer() {
    }

    public Programmer(int employeeId, String firstName, String lastName, int workExperience,
                      Salary salary, Category category, int workPlaceNumber, ProgLanguage progLanguage) {
        super(employeeId, firstName, lastName, workExperience, salary, category, workPlaceNumber);
        this.progLanguage = progLanguage;
    }

    public ProgLanguage getProgLanguage() {
        return progLanguage;
    }

    public void setProgLanguage(ProgLanguage progLanguage) {
        this.progLanguage = progLanguage;
    }

    /**
     * This method describes the logic of writing code by the programmer.
     * */
    public void writeCode(){
        System.out.println("Programmer " + getFirstName() + " write new feature.");
    }

    /**
     * This method describes the logic of bug fixing by a programmer.
     * */
    public void fixBugs(){
        System.out.println("Programmer " + getFirstName() + " fix new bugs.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Programmer{");
        sb.append(super.toString());
        sb.append(", Programming language = ").append(progLanguage);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int getTotalSalary() {
        return super.getTotalSalary() + progLanguage.getBonusProgrammer();
    }

    public void workInProject() {
        writeCode();
        fixBugs();
    }

    @Override
    public void work() {
        startWork();
        attendMetting();
        workInProject();
        endWork();
    }
}
