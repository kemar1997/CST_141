
/**
 * Class ConsultantCheck for consultants who recieve a one time payment.
 * 
 * @author Kemar Golding 
 * @version 10/2/17
 */
public class ConsultantCheck extends PayrollCheck {
    // instance variables
    // the one-time payment amount
    private double payment;

    /**
     * No parameter constructor that sets checkNumber, employeeID and payment amount
     * to 0.
     */
    public ConsultantCheck() {
        this(0, 0, 0.0);
    }
    
    /**
     * Constructor that sets check number, employee ID and payment to the values 
     * of the parameters
     * 
     * @param checkNumber Number of payroll check.
     * @param employeeID Employee's identification number.
     * @param payment The amount of the one-time consultant payment.
     * 
     */
    public ConsultantCheck(int checkNumber, int employeeID, double payment) {
        super(checkNumber, employeeID);
        setPayment(payment);
    }
    
    /**
     * Updates the amount of the one-time payment whichh must be zero or greater
     * 
     * @param payment Amount of the one-time payment
     */
    
    public void setPayment(double payment) {
        if ( payment >= 0 ) {
            this.payment = payment;
        }
    }
    
    /**
     * Returns the amount of the one-time payment
     * 
     * @return the one time payment amount
     */
    public double getPayment() {
        return payment;
    }
    
    /**
     * Returns the gross pay of the one-time payment
     * 
     * @return gross pay amount of one-time payment check
     */
    public double getGrossPay() {
        return getPayment();
    }
    
    /**
     * Returns a string representation of a consultant check object with
     * checkNumber, employeeID and amount of one-time payment.
     * 
     * @return Check number, employeeID and one time payment amoount
     */
    @Override
    public String toString() {
        return super.toString()
            + "\nPayment: " + dollarsCents.format( getGrossPay() );
    }
}
