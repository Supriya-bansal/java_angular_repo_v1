/**
 * 
 * @author Supriya
 */


var testModule = angular.module("myApp", []);


testModule.controller('tradeController', ['$scope', '$http',function($scope, $http) {
	
	
	$scope.listOftradeInfoJson=[];
	
	$scope.getData= function(){
		$scope.errorList=[];
		$scope.postValidationList=[];
		$scope.parentErrorObj={};
		
	if($scope.listOftradeInfoJson != undefined && null != $scope.listOftradeInfoJson && $scope.listOftradeInfoJson.length !=0){

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
