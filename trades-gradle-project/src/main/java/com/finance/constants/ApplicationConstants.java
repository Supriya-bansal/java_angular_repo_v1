/**
 * 
 */
package com.finance.constants;

/**
 * @author Supriya
 *
 */
public class ApplicationConstants {

	public static final String VALID_CUSTOMER1 = "PLUTO1";
	public static final String VALID_CUSTOMER2 = "PLUTO2";
	public static final String VALID_LEGAL_ENTITY = "CS ZURICH";
	public static final String APPLICATION_VALIDATION_CODE = "101";
	public static final String APPLICATION_VALIDATION_ERRORCLASS = "alert alert-danger";
	public static final String APPLICATION_VALIDATION_SUCCESSCLASS = "alert alert-success";
	public static final String BLANK = "";
	public static final String APPLICATION_TRADE_TYPE_SPOT="SPOT";
	public static final String APPLICATION_TRADE_TYPE_FORWARD="FORWARD";
	public static final String APPLICATION_TRADE_TYPE_OPTIONS="OPTIONS";
	public static final String APPLICATION_TRADE_TYPE_VANILLAOPTION="VANILLAOPTION";
	public static final String APPLICATION_OPTIONS_STYLE_AMERICAN="AMERICAN";
	public static final String APPLICATION_OPTIONS_STYLE_EUROPEAN="EUROPEAN";
	
	// Validation Messages
	public static final String APPLICATION_VALIDATION_CUSTOMER_MESSAGE = "Not a Valid Customer (Only PLUTO1 and PLUTO2 are allowed)";
	public static final String APPLICATION_VALIDATION_LEGAL_ENTITY_MESSAGE = "Not a Valid Legal Entity (Only CS Zurich allowed)";
	public static final String APPLICATION_VALIDATION_VALUE_TRADE_DATE_MESSAGE = "Value date cannot be before Trade date";
	public static final String APPLICATION_VALIDATION_EXERCISE_TRADE_DATE_MESSAGE = "Exercise Start date should be after Trade date";
	public static final String APPLICATION_VALIDATION_EXERCISE_EXPIRY_DATE_MESSAGE = "Exercise Start date should be before Expiry date";
	public static final String APPLICATION_VALIDATION_EXPIRY_DELIVERY_DATE_MESSAGE = "Expiry date should be before Delivery date";
	public static final String APPLICATION_VALIDATION_PREMIUM_DELIVERY_DATE_MESSAGE = "Premium date should be before Delivery date";
	
	
	public static final String APPLICATION_VALIDATION_TRADE_TYPE_MESSAGE="Not a Valid Trade Type (Only Spot,Forward,Options,VanillaOption are allowed)";
	public static final String APPLICATION_VALIDATION_CURRENCY_TYPE_MESSAGE = "Not a Valid Currency as per ISO 4217 (Reference  : https://en.wikipedia.org/wiki/ISO_4217)";
	public static final String APPLICATION_VALIDATION_PAY_CURRENCY_TYPE_MESSAGE = "Not a Valid PAY Currency as per ISO 4217 (Reference  : https://en.wikipedia.org/wiki/ISO_4217)";
	public static final String APPLICATION_VALIDATION_PREMIUM_CURRENCY_TYPE_MESSAGE = "Not a Valid PREMIUM Currency as per ISO 4217 (Reference  : https://en.wikipedia.org/wiki/ISO_4217)";
	
	public static final String APPLICATION_VALIDATION_OPTION_STYLE_MESSAGE="For Options : Style must be American or European";
	public static final String APPLICATION_VALIDATION_VALUE_TRADE_MISSING_DATE_MESSAGE="Value Date and Trade Date could not be compared since atleast one of them is missing!";
	public static final String APPLICATION_VALIDATION_EXERCISE_TRADE_MISSING_DATE_MESSAGE="Exercise Start Date and Trade Date could not be compared since atleast one of them is missing!";

	public static final String APPLICATION_VALIDATION_EXERCISE_EXPIRY_MISSING_DATE_MESSAGE="Exercise Start Date and Expiry Date could not be compared since atleast one of them is missing!";
	public static final String APPLICATION_VALIDATION_DELIVERY_EXPIRY_MISSING_DATE_MESSAGE="Delivery Date and Expiry Date could not be compared since atleast one of them is missing!";
	public static final String APPLICATION_VALIDATION_PREMIUM_DELIVERY_MISSING_DATE_MESSAGE="Premium Date and Delivery Date could not be compared since atleast one of them is missing!";

	public static final String APPLICATION_DATE_FORMAT_YYYY_MM_DD_ERROR_MESSAGE="Please correct Date format to yyyy-MM-dd";
	public static final String APPLICATION_IMPROPER_REQUEST_FORMAT_ERROR_MESSAGE="Input Data is not in Correct format";
	public static final String APPLICATION_UNSUPPORTED_METHOD_ERROR_MESSAGE="This request does not support GET method";
	
	
}
