import javax.swing.JOptionPane;

/**
 * Demonstration of JOptionPane methods for Payee class application
 * 
 * @author Prof. Carl B. Struck
 * @version CST141 Fall 2013
 */
public class Main
{
    public static void main(String[] args)
    {
        Payee pay1 = new Payee();

        double hoursWorked, payRate;

        hoursWorked = Double.parseDouble(
            JOptionPane.showInputDialog("Enter hours worked") );
        payRate = Double.parseDouble(
            JOptionPane.showInputDialog("Enter pay rate (7.25 - 75.00)") );

        pay1.setHoursWorked(hoursWorked);
        pay1.setPayRate(payRate);

        JOptionPane.showMessageDialog(null, 
            "Hours worked: " + pay1.getHoursWorked()
            + "\nPay rate: " + pay1.getPayRate()
            + "\nGross pay: " + pay1.getGrossPay() );
    }
}
