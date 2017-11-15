package studenttuition;

/** 
 * The Tuition interface definition for SCCC tuition.
 * 
 * @author Carl B. Struck
 * @version  Copyright 2002 (c) SCCC West
 */ 
public interface Tuition
{
    // No need for the keywords public or abstract
    // because they are redundant for methods
    int getTuition();
    
    // The keywords public, static, and final are not needed
    // to declare a constant because they are redundant
    int PT_TUITION = 203;
    int FT_TUITION = 2435;
}
