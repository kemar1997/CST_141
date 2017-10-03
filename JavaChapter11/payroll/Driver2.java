//Copyright:   Copyright (c) 2001
//Author:      Carl B. Struck
//Company:     SCCC West
//Description: Testing the classes HourlySalaryCheck, AnnualSalaryCheck and 
//             ConsultantCheck.  Demonstrates subtyping with an array and 
//             calling the toString method of an object.

import javax.swing.JOptionPane;

public class Driver2
{
    public static void main(String[] args)
    {
        PayrollCheck[] pay = new PayrollCheck[5];

        pay[0] = new HourlySalaryCheck();
        pay[1] = new HourlySalaryCheck(498, 20000, 35, 25);
        pay[2] = new AnnualSalaryCheck();
        pay[3] = new AnnualSalaryCheck(499, 10001, 55000);
        //pay[4] = new ConsultantCheck(500, 90001);

        for (int index = 0; index < pay.length; index++)
        {
            JOptionPane.showMessageDialog( null, pay[index] );
        }

        System.exit(0);
    }
}
