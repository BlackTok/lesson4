angular.module('app', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:8081';

    $scope.loadProducts = function () {
        $http.get(contextPath + "/products")
            .then(function (response) {
                $scope.ProductsList = response.data;
            });
    }

    $scope.deleteProduct = function (productId) {
        $http({
            url: contextPath + "/products/delete/",
            method: "GET",
            params: {
                productId: productId
            }
        }).then(function (response) {
            $scope.loadProducts()
        });
    }

    $scope.changeCost = function (productId, delta) {
        $http({
            url: contextPath + "/products/change/",
            method: "GET",
            params: {
                productId: productId,
                delta: delta
            }
        }).then(function (response) {
            $scope.loadProducts()
        });
    }

    $scope.addProduct = function (inputId, inputTitle, inputCost) {
        $http({
            url: contextPath + "/products/add/",
            method: "GET",
            params: {
                productId: inputId,
                productTitle: inputTitle,
                productCost: inputCost
            }
        }).then(function (response) {
            $scope.loadProducts()
        });
    }

    $scope.loadProducts();
});