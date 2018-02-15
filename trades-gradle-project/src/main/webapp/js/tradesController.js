/**
 * 
 * @author Supriya
 */


var testModule = angular.module("myApp", []);


testModule.controller('tradeController', ['$scope', '$http',function($scope, $http) {
	
	
	$scope.listOftradeInfoJson=[
/*{"customer":"PLUTO1","ccyPair":"EURUSD","type":"Spo","direction":"BUY","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-15","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO1","ccyPair":"EURUSD","type":"Spot","direction":"SELL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-22","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO2","ccyPair":"EURUSD","type":"Forward","direction":"SELL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-22","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO2","ccyPair":"EURUSD","type":"Forward","direction":"BUY","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-21","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO2","ccyPair":"EURUSD","type":"Forward","direction":"BUY","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-08","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUT02","ccyPair":"EURUSD","type":"Forward","direction":"BUY","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-08","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO3","ccyPair":"EURUSD","type":"Forward","direction":"BUY","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-22","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO1","ccyPair":"EURUSD","type":"VanillaOption","style":"EUROPEAN","direction":"BUY","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-19","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO2","ccyPair":"EURUSD","type":"VanillaOption","style":"EUROPEAN","direction":"SELL","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-21","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO1","ccyPair":"EURUSD","type":"VanillaOption","style":"EUROPEAN","direction":"BUY","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-25","payCcy":"INA","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS","trader":"Johann Baumfiddler"},
{"customer":"PLUTO1","ccyPair":"EURUSD","type":"VanillaOption","style":"AMERICAN","direction":"BUY","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-19","excerciseStartDate":"2016-08-12","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO2","ccyPair":"EURUSD","type":"VanillaOption","style":"AMERICAN","direction":"SELL","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-21","excerciseStartDate":"2016-08-12","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO1","ccyPair":"EURUSD","type":"VanillaOption","style":"AMERICAN","direction":"BUY","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-25","excerciseStartDate":"2016-08-12","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO1","ccyPair":"EURUSD","type":"VanillaOption","style":"AMERICAN","direction":"BUY","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-19","excerciseStartDate":"2016-08-10","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO3","ccyPair":"EURUSD","type":"VanillaOption","style":"ASIAN","direction":"SELL","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-19","excerciseStartDate":"2016-08-10","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"}
*/];
	
	$scope.getData= function(){
		$scope.errorList=[];
		$scope.postValidationList=[];
		$scope.parentErrorObj={};
		
	if($scope.listOftradeInfoJson != undefined && null != $scope.listOftradeInfoJson && $scope.listOftradeInfoJson.length !=0){

		    /*$http.post('/trades-gradle-project/validateTradeInfo', $scope.listOftradeInfoJson).
		        then(function(response) {
		        	if(undefined != response.data.message && null != response.data.message && '' != response.data.message){
		        		 $scope.parentErrorObj.errorMsg = response.data.message;
		                 $scope.parentErrorObj.errorClass ='alert alert-danger';
		        	}
		        	else{
		        		 $scope.postValidationList = response.data;
		        		
		           
		        	}
		        }).errror(function(response){
		        	$scope.parentErrorObj.errorMsg = response.data.message;
	                 $scope.parentErrorObj.errorClass ='alert alert-danger';
		        });*/
		
$http.post('/trades-gradle-project/validateTradeInfo', $scope.listOftradeInfoJson).success(function(response) {
	if(undefined != response.message && null != response.message && '' != response.message){
		 $scope.parentErrorObj.errorMsg = response.data.message;
        $scope.parentErrorObj.errorClass ='alert alert-danger';
	}
	else{
		 $scope.postValidationList = response;
		 
		 if(null != $scope.postValidationList && 0== $scope.postValidationList.length){
			 $scope.parentErrorObj.errorMsg = "No Data Available";
		        $scope.parentErrorObj.errorClass ='alert alert-danger';
		 }
  
	}
			
		}).error(function(response) {

			$scope.parentErrorObj.errorMsg = response.message;
	        $scope.parentErrorObj.errorClass ='alert alert-danger';
		});
}

		 
		else{
			$scope.parentErrorObj={
					'errorMsg' : 'Please enter Data!!',
					'errorClass' : 'alert alert-danger'
			}
		}
	}
	
	$scope.getErrorDetails= function(details){
		$scope.errorList = details;
	}
}]);