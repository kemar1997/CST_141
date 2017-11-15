import javax.swing.JOptionPane;

/** 
 * Tests the Student class and demonstrates polymorphism with classes
 * SuffolkResident, NassauResident, NonResident and SeniorCitizen.
 * 
 * @author Carl B. Struck
 * @version  Copyright 2002 (c) SCCC West
 */ 
public class AbstractsAndInterfaces
{
    public static void main(String[] args)
    {
        /**
         * Instantiates SuffolkResident, NassauResident, NonResident and SeniorCitizen 
         * objects and calls their getTuitionString() and toString() methods.
         * 
         * @param args the String[] array command line parameter
         */
        SuffolkResident s = new SuffolkResident(
			"Sally", "Walters", "Z", 7);
        NassauResident n = new NassauResident(
			"Charles", "Jones", "B+", 13);
        NonResident o = new NonResident(
			"Corrine", "Alexander", "A", 12, "Wendover", "ma");
        SeniorCitizen r = new SeniorCitizen(
			"Joseph", "Roberts");

        JOptionPane.showMessageDialog(null,
        	s.getTuitionString() + "\n\n" + s);
        JOptionPane.showMessageDialog(null,
        	n.getTuitionString() + "\n\n" + n);
        JOptionPane.showMessageDialog(null,
        	o.getTuitionString() + "\n\n" + o);
        JOptionPane.showMessageDialog(null,
        	r.getTuitionString() + "\n\n" + r);

        System.exit(0);
    }
}

