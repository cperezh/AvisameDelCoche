/*Registro el módulo de controladores del catalogo*/
var controladoresParametrizacion = angular.module('controladoresParametrizacion', []);

controladoresParametrizacion.controller('controladorDetalleComponente', function ($scope, $http, $routeParams, $window) {

    /*ON LOAD*/
    var url = serverURL+'/componentes/' + $routeParams.componente;

    $http.get(url).
    then(
        function succes(response) {
            $scope.coche = response.data; 
        },
        function error(response) {

        }
    );
    
    /*FIN ON LOAD*/

    $scope.modificar = function () {

        var url = serverURL+'/coches/' + $scope.coche.matricula;

        var parametros = $scope.coche;

        $http.post(url, parametros).
        then(
            function success(response) {
                $scope.coche = response.data;
            },
            function error (response) {
            }
        );
    };
    
    $scope.comprobarEstado = function () {

        var url = serverURL+'/coches/' + $scope.coche.matricula+"/estado";

        var parametros = $scope.coche;

        $http.get(url, parametros).
        then(
            function success(response) {
                $scope.coche = response.data;
            },
            function error(response) {
                        // called asynchronously if an error occurs
                        // or server returns response with an error status.
            }
        );
    };

    $scope.back = function () {
        $window.history.back();
    };
});