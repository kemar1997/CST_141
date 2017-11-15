package proj7;

/**
 * The SalesPerson class inherits all of the data fields from its superclass
 * Employee and also handles its separate data field "sales".
 *
 * @author Kemar Golding, Erik Zagarello, Peter Kaligeris
 */
public final class Salesperson extends Employee implements SalaryConstants {
    private int sales;  // The amount of sales
    
    /**
     * Constructor that sets the default values for the name, address,
     * salary and sales data fields via the this reference.
     */
    public Salesperson() {
        this("", "", 0.0, 0);
    }
    
    /**
     * Constructor that takes three arguments and assigns them to variables
     * via the super keyword for the name, address and salary data fields. 
     * Also assigning the sales variable a value through its set method.
     * 
     * @param name The employee's full name
     * @param address The employee's address
     * @param salary The employee's salary
     * @param sales The amount of sales made
     */
    public Salesperson(String name, String address, double salary, int sales) {
        super(name, address, salary);
        try {
            setSales(sales);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    /**
     * Sets the initial value to the sales instance variable.
     * 
     * @param sales The amount of sales
     * @throws Exception for invalid data input
     */
    public void setSales(int sales) throws Exception {
        if (sales >= 0) {
            this.sales = sales;
        } else {
            throw new Exception("Invalid data type, try again.");
        }
    }
    
    /**
     * Returns the amount of sales made.
     * 
     * @return the amount of sales made
     */
    public int getSales() {
        return sales;
    }
    
    /**
     * Returns the salesperson's commission which is calculated 
     * by multiplying the sales attribute by the sales rate constant.
     * 
     * @return The commission of the salesperson
     */
    @Override
    public double getAdditionalIncome() {
        return Math.round(getSales() * COMMISSION_RATE);
    }
    
    
}
