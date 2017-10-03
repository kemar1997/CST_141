
/**
 * Stock class assigns name & symbol of a company, then compares a manually-entered closing price of stock with the manually-entered
 * current price. Returns percent change between the two values
 * @author Erik Zagarello & Kemar Golding
 * @version 9/18/2017
 */
public class Stock
{
    //Initializes string var. name & symbol; initializes doubles previousClosingPrice & currentPrice
    private double previousClosingPrice;
    private double currentPrice;
    private String name;
    private String symbol;
    

    /**
     * constructor for class Stock
     */
    public Stock()
    {
        name = "Oracle Corporation"; //assigns default name of company as "Oracle Corporation"
        symbol = "ORCL"; //assigns default ticker symbol for company as "ORCL"
        previousClosingPrice = 34.5; //assigns default previousClosingPrice as 34.5
        currentPrice = 34.35; //assigns default currentPrice as 34.35
    }
    
    /**
     * Mutator method that updates the "previousClosingPrice" variable
     */
    public void setPreviousClosingPrice(double newPreviousClosingPrice)
    {
        if (newPreviousClosingPrice >= 0) //checks if value being set is larger or = to 0
        {
           previousClosingPrice = newPreviousClosingPrice; //if true, assign value
        } else {
            previousClosingPrice = 34.5; //otherwise, set value to 34.5 again
            System.out.println("Number received is less than 0. Value set to 34.5."); //print line describing the error
        }
    }
    
    /**
     * Mutator method that updates the "currentPrice" variable
     */
    public void setCurrentPrice(double newCurrentPrice)
    {
        if (newCurrentPrice >= 0) //checks if value being set is larger or = to 0
        {
           currentPrice = newCurrentPrice; //if true, assign value
        } else {
            currentPrice = 34.35; //otherwise, set value to 34.35
            System.out.println("Number received is less than 0. Value set to 34.35"); //print line describing error
        }
    }
    
    /**
     * Accessor method that calculates the percentage of change between the previousClosingPrice and currentPrice
     */
    public double getChangePercent()
    {
        return (currentPrice - previousClosingPrice) / previousClosingPrice; 
    }
}
