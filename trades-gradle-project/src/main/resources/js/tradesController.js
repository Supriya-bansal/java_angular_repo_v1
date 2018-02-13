/**
 * 
 * @author Supriya
 */

angular.module('testModule', [])
.controller('tradeController', function($scope, $http) {
	
	
	$scope.listOftradeInfoJson=[
{"customer":"PLUTO1","ccyPair":"EURUSD","type":"Spot","direction":"BUY","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-15","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO1","ccyPair":"EURUSD","type":"Spot","direction":"SELL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-22","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO2","ccyPair":"EURUSD","type":"Forward","direction":"SELL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-22","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO2","ccyPair":"EURUSD","type":"Forward","direction":"BUY","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-21","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO2","ccyPair":"EURUSD","type":"Forward","direction":"BUY","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-08","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUT02","ccyPair":"EURUSD","type":"Forward","direction":"BUY","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-08","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO3","ccyPair":"EURUSD","type":"Forward","direction":"BUY","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"valueDate":"2016-08-22","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO1","ccyPair":"EURUSD","type":"VanillaOption","style":"EUROPEAN","direction":"BUY","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-19","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO2","ccyPair":"EURUSD","type":"VanillaOption","style":"EUROPEAN","direction":"SELL","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-21","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO1","ccyPair":"EURUSD","type":"VanillaOption","style":"EUROPEAN","direction":"BUY","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-25","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO1","ccyPair":"EURUSD","type":"VanillaOption","style":"AMERICAN","direction":"BUY","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-19","excerciseStartDate":"2016-08-12","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO2","ccyPair":"EURUSD","type":"VanillaOption","style":"AMERICAN","direction":"SELL","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-21","excerciseStartDate":"2016-08-12","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO1","ccyPair":"EURUSD","type":"VanillaOption","style":"AMERICAN","direction":"BUY","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-25","excerciseStartDate":"2016-08-12","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO1","ccyPair":"EURUSD","type":"VanillaOption","style":"AMERICAN","direction":"BUY","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-19","excerciseStartDate":"2016-08-10","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"},
{"customer":"PLUTO3","ccyPair":"EURUSD","type":"VanillaOption","style":"AMERICAN","direction":"SELL","strategy":"CALL","tradeDate":"2016-08-11","amount1":1000000.00,"amount2":1120000.00,"rate":1.12,"deliveryDate":"2016-08-22","expiryDate":"2016-08-19","excerciseStartDate":"2016-08-10","payCcy":"USD","premium":0.20,"premiumCcy":"USD","premiumType":"%USD","premiumDate":"2016-08-12","legalEntity":"CS Zurich","trader":"Johann Baumfiddler"}
];
	
	$scope.getData= function(){
    $http.get('/validateTradeInfo', $scope.listOftradeInfoJson).
        then(function(response) {
            $scope.postValidationList = response.data;
        });
    
	}
	
});