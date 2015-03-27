function Hello($scope, $http) {
    $http.get('/proxym/user/get').
        success(function(data) {
            $scope.greeting = data;
        });
}


