package by.epamlab.staff.model.entity;

import by.epamlab.staff.model.interfaces.Payable;

/**
 * Сlass Employee describes general information about company employees.
 * - implements - Payable.
 * @author Valentin Velichko
 * */
public abstract class Employee implements Payable {

    private int employeeId;
    private String firstName;
    private String lastName;
    /**
     * This field contains information about how many years the employee has worked.
     * */
    private int workExperience;
    /**
     * This field contains employee salary information.
     * */
    private Salary salary;

    public Employee() {
    }

    public Employee(int employeeId, String firstName, String lastName, int workExperience, Salary salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.workExperience = workExperience;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personnel number = ").append(employeeId);
        sb.append(", First name = '").append(firstName).append('\'');
        sb.append(", Last name = '").append(lastName).append('\'');
        sb.append(", Experience = ").append(workExperience).append(" years");
        sb.append(", Base salary = ").append(salary.getBaseSalary());
        sb.append("$,\n\t");
        return sb.toString();
    }
}
