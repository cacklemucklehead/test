
var app = angular.module("Shout", []);
app.controller("SignInController", ['$scope',function ($scope) {

    $scope.signInSelection = true;
    $scope.signInForm = false;
    $scope.signUpForm = false;
    $scope.homeActive = false;

   $scope.signIn = function signIn() {
       $scope.signInSelection = false;
       $scope.signInForm = true;
       $scope.homeActive = true;
        console.log("sign in");
   }

    $scope.signUp = function signUp() {
        $scope.signInSelection = false;
        $scope.signUpForm = true;
        $scope.homeActive = true;
        console.log("sign up");
    }

    $scope.home = function () {
        $scope.signInSelection = true;
        $scope.signInForm = false;
        $scope.signUpForm = false;
        $scope.homeActive = false;
        console.log("back up!");
    }

}])
