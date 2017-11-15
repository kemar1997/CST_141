/**
 * Tests the Circle and Rectangle class which demonstrates polymorphism 
 * behavior with late binding and the call to method center() which calls 
 * the abstract method draw() from class Shape which in turn calls the 
 * concrete method draw() of its subclasses.
 *
 * @author Prof. Carl B. Struck
 * @version Copyright (c) 2008 -- SCCC West
 */
public class Shapes2
{
    public static void main(String[] args)
    {
		Shape[] s =
		{
			new Circle(12, 8),
			new Rectangle(22, 15, 10)
		};

        for (Shape shp : s)
		{
			shp.printIt();
        }
    }
}

