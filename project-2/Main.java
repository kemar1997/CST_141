
/**
 * Driver for the RegularPolygon class.
 *
 * @author Kemar Golding & Erik Zagarello
 * @version 9/25/2017
 */
public class Main
{
    /**
     * Instantiate and test three RegularPolygon objects
     */
    public static void main(String[] args) {
        // Instantiate the RegularPolygon objects
        RegularPolygon regularP1 = new RegularPolygon();
        RegularPolygon regularP2 = new RegularPolygon(6, 4);
        RegularPolygon regularP3 = new RegularPolygon(10, 4, 5.6, 7.8);
        
        // Print the perimeter and area
        regularP1.printArea_Perimeter();
        regularP2.printArea_Perimeter();
        regularP3.printArea_Perimeter();
    }
}
