package by.epamlab.staff.model.entity;

import by.epamlab.staff.model.interfaces.Project;

/**
 * Class Manager describes managers of the company.
 * - extends - Employee.
 * - implements - Project.
 * @author Valentin Velichko.
 * */
public abstract class Manager extends Employee implements Project {

    /**
     * This field contains information about the number of the manager's room.
     * */
    private int roomNumber;

    public Manager() {
    }

    public Manager(int employeeId, String firstName, String lastName,
                   int workExperience, Salary salary, int roomNumber) {
        super(employeeId, firstName, lastName, workExperience, salary);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(super.toString());
        sb.append(" Room number = ").append(roomNumber);
        return sb.toString();
    }
}
