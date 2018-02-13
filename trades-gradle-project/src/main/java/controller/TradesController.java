/**
 * 
 */
package controller;

import java.util.List;


import pojo.TradeInfo;

/**
 * @author Supriya
 *
 */
@RestController
public class TradesController {
	
	
	@RequestMapping(value="/validateTradeInfo", method= RequestMethod.POST)
    public List<TradeInfo> validateTradeInfo(@RequestBody List<TradeInfo> tradeInputObj) {
		/*tradeObj.getErrorObj().setErrorMsg("i am in POC phase");
		tradeObj.getErrorObj().setErrorClass("alert alert-success");*/
		
        return tradeInputObj;
    }

}
