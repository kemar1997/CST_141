package shapesbackup;

/**
 * Tests the Circle and Rectangle class which demonstrates polymorphism behavior
 * with late binding and the call to method center() which calls the abstract
 * method draw() from class Shape which in turn calls the concrete method draw()
 * of its subclasses.
 *
 * @author Prof. Carl B. Struck
 * @version Copyright (c) 2008 -- SCCC West
 */
public class ShapesBackup
{

    /**
     * Instantiates and prints fields for Circle and Rectangle objects using 
     * subtyping from the abstract Shape class
     * @param args the String[] array command line parameter
     */
    public static void main(String[] args)
    {
        Shape[] s =
        {
            new Circle(12, -15, 8),
            new Rectangle(22, 12, 15, 10)
        };

        for (Shape shape : s)
        {
            shape.printIt();
        }
    }
}
