/**
 * 
 */
package com.finance.builder;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.finance.constants.ApplicationConstants;
import com.finance.model.ErrorDto;
import com.finance.model.TradeInfo;
import com.finance.utility.Validator;

/**
 * @author Supriya
 *
 */

@Service
public class TradeService {
	
	public List<TradeInfo>validateTradesService(List<TradeInfo> tradeInputObj) throws ParseException{
		
		ArrayList<TradeInfo> output = new ArrayList<>();
		for(int i=0;i<tradeInputObj.size();i++){
			output.add(validateTrade(tradeInputObj.get(i)));
		}
			
		return output;
		
	}

	private TradeInfo validateTrade(TradeInfo input) throws ParseException{

		// Validation 0 : Value Date Should not fall on Weekend or non working day for currency 
				/*if(Validator.isNotNullOrEmpty(input.getValueDate()))){
				if(!Validator.validateJavaDate(input.getValueDate(),input.getTradeDate()))
				{
					input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_VALUE_TRADE_DATE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
				}
			}
			else{
				input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_VALUE_TRADE_MISSING_DATE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
				}*/
				
		// Validation 1
		if(Validator.isNotNullOrEmpty(input.getValueDate()) && Validator.isNotNullOrEmpty(input.getTradeDate())){
		if(!Validator.validateJavaDate(input.getValueDate(),input.getTradeDate()))
		{
			input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_VALUE_TRADE_DATE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
		}
	}
	else{
		input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_VALUE_TRADE_MISSING_DATE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
		}
		
		//Validation 2
		if(!Validator.validateCounterParty(input.getCustomer())){
		
			input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_CUSTOMER_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
		}
		
		//Validation 3
        if(!Validator.validateLegalEntity(input.getLegalEntity())){
			
			input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_LEGAL_ENTITY_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
		}
        
        // Validation 4
        if(!Validator.validateTradeTypes(input.getType())){
		
			input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_TRADE_TYPE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
		}
        
     // Validation 5
        if(!Validator.validateCurrency(input.getPayCcy())){
		
			input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_PAY_CURRENCY_TYPE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
		}
        
     // Validation 6
        if(!Validator.validateCurrency(input.getPremiumCcy())){
		
			input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_PREMIUM_CURRENCY_TYPE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
		}
        
        // Validation 7 - OPTIONS Specific : style can be either American or European
        if(ApplicationConstants.APPLICATION_TRADE_TYPE_OPTIONS.equalsIgnoreCase(input.getType()) || ApplicationConstants.APPLICATION_TRADE_TYPE_VANILLAOPTION.equalsIgnoreCase(input.getType())){
        if(!Validator.validateOptionStyles(input.getStyle())){
			input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_OPTION_STYLE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
		}
        
        if(ApplicationConstants.APPLICATION_OPTIONS_STYLE_AMERICAN.equalsIgnoreCase(input.getStyle())){
        	
        	 // Validation 8
        	if(Validator.isNotNullOrEmpty(input.getExcerciseStartDate()) && Validator.isNotNullOrEmpty(input.getTradeDate())){
        		if(!Validator.validateExerciseStartToTradeDate(input.getExcerciseStartDate(),input.getTradeDate()))
        		{
        			input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_EXERCISE_TRADE_DATE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
        		}
        	}
        	else{
        		input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_EXERCISE_TRADE_MISSING_DATE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
        	}
        	
        	 // Validation 9
        	if(Validator.isNotNullOrEmpty(input.getExcerciseStartDate()) && Validator.isNotNullOrEmpty(input.getExpiryDate())){
        		if(!Validator.validateExerciseStartToExpiryDate(input.getExcerciseStartDate(),input.getExpiryDate()))
        		{
        			input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_EXERCISE_EXPIRY_DATE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
        		}
        	}
        	else{
        		input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_EXERCISE_EXPIRY_MISSING_DATE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
        	}
        	
        }
        
        // Validation 10
        if(Validator.isNotNullOrEmpty(input.getExpiryDate()) && Validator.isNotNullOrEmpty(input.getDeliveryDate())){
    		if(!Validator.validateExerciseStartToExpiryDate(input.getExpiryDate(),input.getDeliveryDate()))
    		{
    			input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_EXPIRY_DELIVERY_DATE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
    		}
    	}
    	else{
    		input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_DELIVERY_EXPIRY_MISSING_DATE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
    	}
        
        // Validation 11
        if(Validator.isNotNullOrEmpty(input.getPremiumDate()) && Validator.isNotNullOrEmpty(input.getDeliveryDate())){
    		if(!Validator.validateExerciseStartToExpiryDate(input.getPremiumDate(),input.getDeliveryDate()))
    		{
    			input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_PREMIUM_DELIVERY_DATE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
    		}
    	}
    	else{
    		input.getListOfErrors().add(new ErrorDto(ApplicationConstants.APPLICATION_VALIDATION_PREMIUM_DELIVERY_MISSING_DATE_MESSAGE, ApplicationConstants.APPLICATION_VALIDATION_CODE, ApplicationConstants.APPLICATION_VALIDATION_ERRORCLASS));
    	}
        
        
        }
    	return input;
	}
	
	
}
