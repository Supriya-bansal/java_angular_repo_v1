/**
 * 
 */
package com.finance.model;

/**
 * @author Supriya
 *
 */

public enum OptionStyles {
	
	American,European;

public static boolean contains(String s)
{
    for(OptionStyles style : values())
    {
    	if (style.name().equalsIgnoreCase(s)) {
    		 return true;
    	}
    }
           
    return false;
} 


}
