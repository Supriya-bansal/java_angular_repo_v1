/**
 * 
 */
package com.finance.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.finance.builder.TradeService;
import com.finance.model.TradeInfo;

/**
 * @author Supriya
 *
 */
@RestController
public class TradesController {
	
	
	private TradeService tradeservice;
	
	@Autowired
	public void setMethod(TradeService tradeservice) {
		
		this.tradeservice = tradeservice;
		
	}
	
	
	@RequestMapping(value="/validateTradeInfo", method=RequestMethod.POST)
    public List<TradeInfo> validateTradeInfo(@RequestBody List<TradeInfo> tradeInputObj) {
		
		try {
			tradeInputObj = this.tradeservice.validateTradesService(tradeInputObj);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
        return tradeInputObj;
    }

}
