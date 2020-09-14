package by.epamlab.staff.model.entity;

import by.epamlab.staff.model.interfaces.WorkTime;

/**
 * Class Personal describes the company's attendants.
 * - extends - Employee.
 * - implements - WorkTime.
 * @author Valentin Velichko.
 * */
public abstract class Personal extends Employee implements WorkTime {

    /**
     * This field contains information about employee rank.
     * */
    private int rank;

    public Personal() {
    }

    public Personal(int employeeId, String firstName, String lastName, int workExperience, Salary salary, int rank) {
        super(employeeId, firstName, lastName, workExperience, salary);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void startWork() {
        System.out.println(getFirstName() + " starts work.");
    }

    public void endWork() {
        System.out.println(getFirstName() + " finishes work.");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" Rank = ").append(rank);
        return sb.toString();
    }
}
