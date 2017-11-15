package studenttuition;

import java.util.ArrayList;
import java.util.Collections;

/** 
 * The ValidState class definition validates state abbreviations entered 
 * by users.
 * 
 * @author Carl B. Struck
 * @version  Copyright 2002 (c) SCCC West
 */ 
public class ValidState
{
    private String state;  // A state abbreviation

    /** 
     * The constructor sets default value for the state abbreviation.
     */
    public ValidState()
    {
        this("");
    }

    /** 
     * The constructor sets initial value for the state abbreviation.
     * 
     * @param state the state abbreviation
     */
    public ValidState(String state)
    {
        setState(state);
    }

    /** 
     * Sets value for state abbreviation field which must be from the list 
     * of 50 valid state abbreviations or the District of Columbia (DC).
     * 
     * @param state the state abbreviation
     */
    public void setState(String state)
    {
        ArrayList<String> stateAbbreviations = new ArrayList();

        String[] abbreviations =
            {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FL",
             "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME",
             "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH",
             "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI",
             "SC", "SD", "TN", "TX", "UT", "VT", "VA", "WA", "WV", "WI",
             "WY"};

        Collections.addAll(stateAbbreviations, abbreviations);
        
        if ( stateAbbreviations.indexOf( state.toUpperCase() ) != -1 )
        {
            this.state = state.toUpperCase();
        }
    }

    /** 
     * Returns the state abbreviation field as a String
     * 
     * @return state abbreviation
     */
    public String getState()
    {
        return state;
    }

    /** 
     * Returns a String representation of the ValidState class which is the 
     * formatted state abbreviation field with a preceding label.
     *  
     * @return formatted first name, last name, grade and credits fields 
     *         with labels as a String.
     */
    public String toString()
    {
        return "State: " + getState();
    }
}
