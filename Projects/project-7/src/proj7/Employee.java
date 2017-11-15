package proj7;

/**
 * The Employee class is abstract and is the superclass to
 * Salesperson and Executive. It handles the employee's
 * name, address, and calculates the salary of the employee.
 *
 * @author Kemar Golding, Erik Zagarello, Peter Kaligeris
 */
public abstract class Employee extends Object {
    private String name;    // The Employee's full name
    private String address; // The Employee's address
    private double salary;  // The Employee's salary
    
    /**
     * Constructor that sets the default values for the employee's name, 
     * address and salary data fields.
     */
    public Employee() {
        this("", "", 0.0);
    }
    
    /**
     * Constructor that sets the initial values for the name,
     * address and salary data fields.
     * 
     * @param name The employee's full name
     * @param address The employee's address
     * @param salary The employee's salary
     */
    public Employee(String name, String address, double salary) {
        setName(name);
        setAddress(address);
        try {
            setSalary(salary);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    /**
     * Sets the value for the Employee's full name.
     * 
     * @param name The employee's full name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Sets the value for the Employee's address.
     * 
     * @param address The employee's address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Sets the value for the Employee's salary.
     * 
     * @param salary The employee's salary
     * @throws java.lang.Exception
     */
    public void setSalary(double salary) throws Exception {
        if (salary >= 0.0) {
            this.salary = salary;
        } else {
            throw new Exception("Invalid data type, try again.");
        }
    }
    
    /**
     * Returns a string representing the name of the employee.
     * 
     * @return The employee's full name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns a string representing the address of the employee.
     * 
     * @return The employee's address
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * Returns the value of the employee's salary.
     * 
     * @return The employee's salary
     */
    public double getSalary() {
        return salary;
    }
    
    /**
     * An abstract placeholder method for the getAdditionalIncome() method
     * which assures that all subclasses of class Employee must implement 
     * this method which is called from the toString() method of this
     * Employee class.
     * 
     * @return a string representing any additional income gained by the
     * employee
     */
    public abstract double getAdditionalIncome();
    
    /**
     * Returns the salary of an Employee plus any additional income the earned
     * e.g.(commission).
     * 
     * @return a value representing the total salary of an Employee including
     * any commission earned.
     */
    public double getTotalSalary() {
        return salary + getAdditionalIncome();
    }
    
    /**
     * Returns a string representation of an employee including the data
     * fields with the return value of the getTotalSalary method and their 
     * descriptive labels.
     * 
     * @return a string representation of an Employee
     */
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        
        output.append("Employee Name: ").append(getName()).append("\n");
        output.append("Employee Address: ").append(getAddress()).append("\n");
        output.append("Employee Base Salary: ").append(getSalary()).append("\n");
        output.append("Toatal Salary: ").append(getTotalSalary())
                .append("\n");
        
        return output.toString();
    }
}
