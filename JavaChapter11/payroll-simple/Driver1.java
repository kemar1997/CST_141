import javax.swing.JOptionPane;

//Copyright:   Copyright (c) 2001
//Author:      Carl B. Struck
//Company:     SCCC West
//Description: Testing the classes HourlySalaryCheck, AnnualSalaryCheck and 
//             ConsultantCheck.

public class Driver1
{
    public static void main(String[] args)
    {
        HourlySalaryCheck pay1 = new HourlySalaryCheck(498, 20000, 35, 25);
        AnnualSalaryCheck pay2 = new AnnualSalaryCheck(499, 10001, 55000);

        JOptionPane.showMessageDialog(null, "Hourly Salary Check"
                                          + "\nCheck number: " + pay1.getCheckNumber()
                                          + "\nEmployee ID: " + pay1.getEmployeeID()
                                          + "\nGross pay: " + pay1.getGrossPay() );

        JOptionPane.showMessageDialog(null, "Annual Salary Check"
                                          + "\nCheck number: " + pay2.getCheckNumber()
                                          + "\nEmployee ID: " + pay2.getEmployeeID()
                                          + "\nGross pay: " + pay2.getGrossPay() );

        System.exit(0);
    }
}

