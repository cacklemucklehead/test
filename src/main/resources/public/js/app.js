
var app = angular.module("Shout", []);
app.controller("SignInController", ['$scope',function ($scope) {

   $scope.signIn = function signIn() {
        console.log("sign in");
   }

    $scope.signUp = function signUp() {
        console.log("sign up");
    }

}])
