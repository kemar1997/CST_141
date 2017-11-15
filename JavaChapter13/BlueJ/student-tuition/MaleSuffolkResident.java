/**
 * Compiling this class will generate a compiler error since class 
 * SuffolkResident is declared as 'final'.
 *
 * @author Prof. Carl B. Struck
 * @version Copyright (c) 2002 -- SCCC West
 */
public class MaleSuffolkResident extends SuffolkResident
{
    public MaleSuffolkResident(String firstName, String lastName,
                               String grade, int credits)
    {
        super(firstName, lastName, grade, credits);
    }
}
