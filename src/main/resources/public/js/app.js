
var app = angular.module("Shout", ['ngRoute']);

app.config(function($routeProvider, $locationProvider){

        $locationProvider.hashPrefix('');
        $routeProvider
            .when('/user', {
                templateUrl: 'views/userProfile.html',
                controller: 'SignInController'
            })
            .otherwise({
                redirectTo: '/'
            });
});

app.controller("SignInController", ['$scope', '$http',function ($scope, $http) {

    $scope.signInSelection = true;
    $scope.signInForm = false;
    $scope.signUpForm = false;
    $scope.homeActive = false;
    $scope.userSignedIn = false;

   $scope.signIn = function signIn() {
       $scope.signInSelection = false;
       $scope.signInForm = true;
       $scope.homeActive = true;
   }

    $scope.signUp = function signUp() {
        $scope.signInSelection = false;
        $scope.signUpForm = true;
        $scope.homeActive = true;
    }

    $scope.home = function () {
        $scope.signInSelection = true;
        $scope.signInForm = false;
        $scope.signUpForm = false;
        $scope.homeActive = false;
    }

    $scope.getUserProfile = function () {
       let user = {
           method : "GET",
           url: 'userProfile/get/user/profile',
           params: {userName:$scope.usersName, password:$scope.usersPassword}
       };
        $http(user)
            .then(function (response) {
                if (response.data.id > 0) {
                    $scope.user = response.data;
                    let href = window.location.href + 'user';
                    $scope.signInForm = false;
                    $scope.signUpForm = false;
                    $scope.homeActive = false;
                    $scope.userSignedIn = true;
                    window.location.href = href;
                }
            });
    }

    $scope.createNewUserProfile = function () {
        let user = {
            method: "POST",
            url: "userProfile/create/new/user/profile",
            params: {userName: $scope.newUserName, password: $scope.newUserPassword, email: $scope.newUserEmail, age: $scope.newUserAge}
        }
        $http(user)
            .then(function (response) {
                if (response.data.id > 0) {
                    $scope.user = response.data;
                    let href = window.location.href + 'user';
                    $scope.signInForm = false;
                    $scope.signUpForm = false;
                    $scope.homeActive = false;
                    $scope.userSignedIn = true;
                    window.location.href = href;
                }
            });
    }

}])
