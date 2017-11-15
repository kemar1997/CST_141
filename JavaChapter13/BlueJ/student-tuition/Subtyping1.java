import javax.swing.JOptionPane;

/** 
 * Tests the Student class and demonstrates polymorphism and subtyping with 
 * classes SuffolkResident, NassauResident, NonResident and SeniorCitizen.
 * 
 * @author Carl B. Struck
 * @version  Copyright 2002 (c) SCCC West
 */ 
public class Subtyping1
{
    public static void main(String[] args)
    {
        /**
         * Instantiates SuffolkResident, NassauResident, NonResident and 
         * SeniorCitizen objects using subtyping and calls their toString() 
         * methods of the objects.
         * 
         * @param args the String[] array command line parameter
         */
        Student s = new SuffolkResident(
			"Sally", "Walters", "Z", 7);
        Student n = new NassauResident(
			"Charles", "Jones", "B+", 13);
        Student o = new NonResident(
			"Corrine", "Alexander", "A", 12, "Wendover", "ma");
        Student r = new SeniorCitizen(
			"Joseph", "Roberts");

        JOptionPane.showMessageDialog(null, s);
        JOptionPane.showMessageDialog(null, n);
        JOptionPane.showMessageDialog(null, o);
        JOptionPane.showMessageDialog(null, r);

        System.exit(0);
    }
}

