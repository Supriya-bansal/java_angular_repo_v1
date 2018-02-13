/**
 * 
 */
package controller;

import java.util.List;








import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import builder.TradeService;
import pojo.TradeInfo;

/**
 * @author Supriya
 *
 */
@RestController
public class TradesController {
	
	@Autowired
	TradeService tradeservice;
	
	@RequestMapping(value="/validateTradeInfo", method= RequestMethod.GET)
    public List<TradeInfo> validateTradeInfo(@RequestBody List<TradeInfo> tradeInputObj) {
		/*tradeObj.getErrorObj().setErrorMsg("i am in POC phase");
		tradeObj.getErrorObj().setErrorClass("alert alert-success");*/
		
		for(int i=0;i<tradeInputObj.size();i++){
			if(i%2 ==0){
				tradeInputObj.get(i).getErrorObj().setErrorClass("alert alert-success");
				tradeInputObj.get(i).getErrorObj().setErrorMsg("This is even row");
			}
			else{
				tradeInputObj.get(i).getErrorObj().setErrorClass("alert alert-danger");
				tradeInputObj.get(i).getErrorObj().setErrorMsg("This is odd row");
			}
		}
		
        return tradeInputObj;
    }

}
