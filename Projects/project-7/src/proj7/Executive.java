package proj7;

/**
 * The executive class handles the calculation of their bonus with 
 * all the data from its superclass.
 *
 * @author Kemar Golding, Erik Zagarello, Peter Kaligeris
 */
public final class Executive extends Employee implements SalaryConstants {
    
    /**
     * Constructor that sets the default values for the name, address,
     * and salary data fields via the this reference.
     */
    public Executive() {
        this("", "", 0.0);
    }
    
    /**
     * Constructor that takes three arguments and assigns them to variables
     * via the super keyword for the name, address and salary data fields.
     * 
     * @param name The employee's full name
     * @param address The employee's address
     * @param salary The employee's salary 
     */
    public Executive(String name, String address, double salary) {
        super(name, address, salary);
    }
    
    /**
     * Returns the executive's commission which is calculated 
     * by multiplying the salary attribute by the bonus rate constant.
     * 
     * @return The commission of the executive
     */
    @Override
    public double getAdditionalIncome() {
        return getSalary() * BONUS_RATE;
    }
    
}
