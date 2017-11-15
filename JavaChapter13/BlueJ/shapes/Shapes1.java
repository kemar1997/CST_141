/**
 * Tests the Circle and Rectangle class which demonstrates late binding
 * as method printIt() calls the abstract method draw() from class Shape
 * which in turn calls the concrete method draw() of its subclasses.
 *
 * @author Prof. Carl B. Struck
 * @version Copyright (c) 2008 -- SCCC West
 */
public class Shapes1
{
    public static void main(String[] args)
    {
        Circle c = new Circle(150, 10);
        Rectangle r = new Rectangle(100, 20, 15);

        c.printIt();
        r.printIt();
    }
}








