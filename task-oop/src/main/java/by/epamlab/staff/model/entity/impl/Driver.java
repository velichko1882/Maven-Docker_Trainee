package by.epamlab.staff.model.entity.impl;

import by.epamlab.staff.model.entity.Car;
import by.epamlab.staff.model.entity.Personal;
import by.epamlab.staff.model.entity.Salary;

/**
 * Class Driver describes the drivers of the company.
 * - extends - Personal.
 * @author Valentin Velichko
 * */
public class Driver extends Personal {

    /**
     * This field contains information about the car on which the driver works.
     * */
    private Car car;

    /**
     * This field contains information on the number of fines last year.
     *
     * */
    private int finesLastYear;

    public Driver() {
    }

    public Driver(int employeeId, String firstName, String lastName, int workExperience,
                  Salary salary, int rank, Car car, int finesLastYear) {
        super(employeeId, firstName, lastName, workExperience, salary, rank);
        this.car = car;
        this.finesLastYear = finesLastYear;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public int getFinesLastYear() {
        return finesLastYear;
    }

    public void setFinesLastYear(int finesLastYear) {
        this.finesLastYear = finesLastYear;
    }

    /**
     * This method describes the driver logic.
     * */
    public void driveCar(){
        System.out.println("Driver " + getFirstName() + " drives " + car.getModel());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Driver{");
        sb.append(super.toString());
        sb.append(", Car = ").append(car);
        sb.append(", Fines in last year = ").append(finesLastYear);
        sb.append('}');
        return sb.toString();
    }

    public int getTotalSalary() {
        final int bonus = 100;
        int totalSalary = getSalary().getBaseSalary();
        if (finesLastYear == 0) {
            totalSalary += bonus;
        }
        return totalSalary;
    }

    @Override
    public void work() {
        startWork();
        driveCar();
        endWork();
    }
}
