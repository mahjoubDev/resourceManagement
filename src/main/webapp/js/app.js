var taskManagerModule = angular.module('taskManagerApp', ['ngAnimate']);

taskManagerModule.controller('taskManagerController', function ($scope,$http) {
	
	var urlBase="http://localhost:8080/proxym/category";
	 $scope.toggle='!toggle';	
	$http.get(urlBase + '/getList').
    	success(function(data) {
	        $scope.tasks = data;
    });
	
	//add a new task
	$scope.addTask = function addTask() {
		if($scope.categoryName=="" || $scope.categoryReference==""){
			alert("Insufficient Data! Please provide values for category name and reference");
		}
		else{
		 $http.post(urlBase + '/add' ,{  "nameCategorie": $scope.categoryName, "reference": $scope.categoryReference},{headers: {'Content-Type': 'application/json'} }).
		  success(function(data) {
			 alert("Category added");
			 $scope.toggle='!toggle';
			 $route.reload();
		    });
		}
	};
	
});

