/**
 * 
 */
package com.finance.model;

/**
 * @author Supriya
 *
 */

public enum TradeTypes {
	
Spot,Forward,Options,VanillaOption;

public static boolean contains(String s)
{
    for(TradeTypes type : values())
    {
    	if (type.name().equalsIgnoreCase(s)) {
    		 return true;
    	}
    }
           
    return false;
} 


}
