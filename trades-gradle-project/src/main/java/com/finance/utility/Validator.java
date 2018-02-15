/**
 * 
 */
package com.finance.utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.finance.constants.ApplicationConstants;
import com.finance.model.OptionStyles;
import com.finance.model.TradeTypes;
import com.finance.model.ValidCurrencyCodes;

/**
 * @author Supriya
 *
 */
public class Validator {

	public static boolean validateJavaDate(String dateValue1, String dateValue2)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(dateValue1);
		Date date2 = sdf.parse(dateValue2);

		if (date1.compareTo(date2) < 0) {
			return false;
		}
		

		return true;

	}
	
	public static boolean validateExerciseStartToTradeDate(String dateValue1, String dateValue2)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(dateValue1);
		Date date2 = sdf.parse(dateValue2);


		if (date1.compareTo(date2) <= 0) {
			return false;
		}

		return true;

	}
	
	public static boolean validateExerciseStartToExpiryDate(String dateValue1, String dateValue2)
			throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = sdf.parse(dateValue1);
		Date date2 = sdf.parse(dateValue2);


		if (date1.compareTo(date2) < 0) {
			return true;
		}

		return false;

	}
	

	public static boolean validateCounterParty(String customer) {

		if (customer.equalsIgnoreCase(ApplicationConstants.VALID_CUSTOMER1)
				|| customer
						.equalsIgnoreCase(ApplicationConstants.VALID_CUSTOMER2)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean validateLegalEntity(String legalEntity) {

		if (legalEntity
				.equalsIgnoreCase(ApplicationConstants.VALID_LEGAL_ENTITY)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean validateTradeTypes(String tradeType) {

		if (TradeTypes.contains(tradeType)) {
			return true;
		} else {
			return false;
		}

	}
	
	public static boolean validateOptionStyles(String style) {

		if (OptionStyles.contains(style)) {
			return true;
		} else {
			return false;
		}

	}
	
/*This method validates if the Currency Input is Valid (if provided). Assumption : Currency is not mandatory.*/
	public static boolean validateCurrency(String currency) {
		if (isNotNullOrEmpty(currency)) {
			if (ValidCurrencyCodes.contains(currency)) {
				return true;
			} else {
				return false;
			}

		}
		return true;

	}

	
	public static boolean isNotNullOrEmpty(String stringObj) {

		if (null != stringObj && !ApplicationConstants.BLANK.equalsIgnoreCase(stringObj)) {
			return true;
		} else {
			return false;
		}

	}

}
