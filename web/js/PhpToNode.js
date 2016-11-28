"use strict";
var app = angular.module('PhpToNode', ['ngRoute']);

app.controller('NavigationController', ['$scope', '$http', function ($scope, $http) {
	$scope.progress = {"width":"0%"};
	$scope.progressNum = 0;
	$scope.finish = false;
	$scope.isSended = false;
	$scope.showConsole = false;
	$scope.consoleServer = "";
	$scope.getProgress = null;
	$scope.targetPath = "";
	$scope.sourcePath = "";

	$scope.convert = function(){
		$scope.isSended = true;
		$http.post('Service', [$scope.sourcePath, $scope.targetPath])
			.then(function (response) {
				$scope.finish = true;
				$scope.showConsole = true;
				$scope.isSended = false;
				$scope.consoleServer = response.data;
				clearInterval($scope.getProgress);
			});

		$scope.getProgress = setInterval(function() {
			$http.get('Service/getProgress')
				.then(function (response) {
					$scope.progress = {"width":""+ response.data +"%"};
				});
		}, 200);

	};

	$scope.closeWindow = function () {
		$scope.progress = {"width":"0%"};
		$scope.progressNum = 0;
		$scope.finish = false;
		$scope.isSended = false;
		$scope.showConsole = false;
		$scope.consoleServer = "";
		$scope.targetPath = "";
		$scope.sourcePath = "";
	}
}]);

app.controller('HomeController', ['$scope', '$http', function ($scope, $http) {
}]);

app.config(['$locationProvider', '$routeProvider', function ($locationProvider, $routeProvider) {
	$routeProvider
		.when('/', {
			templateUrl: 'partials/home.html',
			controller: 'HomeController'
		})

		.otherwise({redirectTo: '/'});

	//html5mode causes several issues when the front end is embedded with the web service.
	//$locationProvider.html5Mode(true);
	$locationProvider.hashPrefix('!');
}]);
