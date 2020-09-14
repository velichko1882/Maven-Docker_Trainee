package by.epamlab.staff.model.entity;

/**
 * Class Salary describes what the employee’s salary consists of.
 * @author Valentin Velichko
 * */
public class Salary {

    /**
     * This field contains information about the base salary rate.
     * */
    private int rate;

    /**
     * This field contains information about the salary increase.
     * */
    private int contractPremium;

    public Salary(int rate, int contractPremium) {
        this.rate = rate;
        this.contractPremium = contractPremium;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getContractPremium() {
        return contractPremium;
    }

    public void setContractPremium(int contractPremium) {
        this.contractPremium = contractPremium;
    }

    /**
     * This method describes the logic for calculating the employee's base salary.
     * @return employee's base salary in dollars.
     * */
    public int getBaseSalary(){
        return rate + contractPremium;
    }
}
