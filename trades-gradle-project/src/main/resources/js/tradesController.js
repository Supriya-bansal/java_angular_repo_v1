/**
 * 
 * @author Supriya
 */

angular.module('testModule', [])
.controller('tradeController', function($scope, $http) {
	
	$scope.getData= function(){
    $http.post('/getTradeInfo', $scope.tradeObj).
        then(function(response) {
            $scope.tradeInfoJson = response.data;
        });
    
	}
	
});