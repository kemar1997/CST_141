
/**
 * Write a description of class Stock here.
 *
 * @author Kemar Golding and Erik Zagarello
 * @version CST 141 Fall 2017
 */
public class Stock
{
    // instance variables: previousClosingPrice, currentPrice, name, symbol
    private double previousClosingPrice;
    private double currentPrice;
    private String name;
    private String symbol;
    

    /**
     * Constructor for objects of class Stock
     */
    public Stock()
    {
        // initialise instance variables
        name = "Oracle Corporation";
        symbol = "ORCL";
        previousClosingPrice = 34.5;
        currentPrice = 34.35;
    }
    
    /**
     * Mutator method that updates the "previousClosingPrice" variable
     */
    public void setPreviousClosingPrice(double newPreviousClosingPrice)
    {
        if (previousClosingPrice >= 0) 
        {
           previousClosingPrice = newPreviousClosingPrice;
        } else {
            return;
        }
    }
    
    /**
     * Mutator method that updates the "currentPrice" variable
     */
    public void setCurrentPrice(double newCurrentPrice)
    {
        if (currentPrice <= 0) 
        {
           currentPrice = newCurrentPrice;
        } else {
            newCurrentPrice = 34.35;
            System.out.println("Choose a number greater than 0!");
        }
    }
    
    /**
     * Accessor method that calculates the percentage of change between the previousClosingPrice and currentPrice
     */
    public double getChangePercent()
    {
        return (previousClosingPrice - currentPrice) / previousClosingPrice;
    }
}
