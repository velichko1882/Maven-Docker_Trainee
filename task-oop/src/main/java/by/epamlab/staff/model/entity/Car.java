package by.epamlab.staff.model.entity;

/**
 * Сlass Car describes a car for drivers.
 * @author Valentin Velichko
 * */

public class Car {

    /**
     * This field contains information about the car model.
     * */
    private String model;

    /**
     * This field contains information about the car registration number.
     * */
    private String regNumber;

    public Car() {
    }

    public Car(String model, String regNumber) {
        this.model = model;
        this.regNumber = regNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("model = '").append(model).append('\'');
        sb.append(", registration number = '").append(regNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
