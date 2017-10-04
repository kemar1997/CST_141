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
        HourlySalaryCheck pay1 = new HourlySalaryCheck();
        HourlySalaryCheck pay2 = new HourlySalaryCheck(498, 20000, 35, 25);
        AnnualSalaryCheck pay3 = new AnnualSalaryCheck();
        AnnualSalaryCheck pay4 = new AnnualSalaryCheck(499, 10001, 55000);
        ConsultantCheck pay5 = new ConsultantCheck(500, 90001, 1250);

        JOptionPane.showMessageDialog(null, pay1);
        JOptionPane.showMessageDialog(null, pay2);
        JOptionPane.showMessageDialog(null, pay3);
        JOptionPane.showMessageDialog(null, pay4);
        JOptionPane.showMessageDialog(null, pay5);

        System.exit(0);
    }
}

