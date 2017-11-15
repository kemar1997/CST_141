package webcrawler;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Kemar Golding
 */
public class WebCrawler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = input.nextLine();
        crawler(url); // Traverse the Web from the starting url        
    }
    
    
    
}
