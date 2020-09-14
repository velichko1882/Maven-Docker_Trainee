package by.epamlab.staff.model.entity.impl;


import by.epamlab.staff.model.entity.Personal;
import by.epamlab.staff.model.entity.Salary;

/**
 * Class Cleaner describes the employees who clean the room.
 * - extends - Personal.
 * @author Valentin Velichko
 * */
public class Cleaner extends Personal {

    /**
     * This field contains information about the number of rooms that the employee cleans.
     * */
    private int numberOfRooms;

    public Cleaner() {
    }

    public Cleaner(int employeeId, String firstName, String lastName, int workExperience,
                   Salary salary, int rank, int numberOfRooms) {
        super(employeeId, firstName, lastName, workExperience, salary, rank);
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    /**
     * This method describes the logic of the cleaner.
     * */
    public void cleanRoom(){
        System.out.println("Cleaner " + getFirstName() + " cleans " + numberOfRooms + " rooms." );
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cleaner {");
        sb.append(super.toString());
        sb.append(", Number of rooms = ").append(numberOfRooms);
        sb.append('}');
        return sb.toString();
    }

    public int getTotalSalary() {
        final int maxRooms = 5;
        final int bonus = 200;
        int totalSalary = getSalary().getBaseSalary();
        if (numberOfRooms > maxRooms){
            totalSalary += bonus;
        }
        return totalSalary;
    }

    @Override
    public void work() {
        startWork();
        cleanRoom();
        endWork();
    }
}
