
/*Registro el módulo de controladores del catalogo*/
var controladoresCatalogo = angular.module('controladoresCatalogo', []);

/*CREO UN CONTROLADOR EN EL MODULO. 
 * El segundo parametro es la funcion constructora del controlador, donde se definen las
 * variables y metodos que estaran disponibles en el ambito definido para el controlador*/
controladoresCatalogo.controller('controladorBuscadorCatalogo', function ($scope, $http) {

    $scope.buscar = function (matricula) {

        var url = '/AvisameDelCocheRS/resources/coches?matricula=' + matricula;

        $http.get(url).
                success(function (data, status, headers, config) {
                    $scope.coches = data;
                }).
                error(function (data, status, headers, config) {
                    // called asynchronously if an error occurs
                    // or server returns response with an error status.
                });
    };
});

controladoresCatalogo.controller('controladorDetalleCatalogo', function ($scope, $http, $routeParams,$window) {

    /*ON LOAD*/
    var url = '/AvisameDelCocheRS/resources/coches/' + $routeParams.matricula;

    $http.get(url).
            success(function (data, status, headers, config) {
                $scope.coche = data;
            }).
            error(function (data, status, headers, config) {
                // called asynchronously if an error occurs
                // or server returns response with an error status.
            });
            
    /*FIN ON LOAD*/

    $scope.actualizarKilometraje = function (matricula, kilometraje) {

        var url = '/AvisameDelCocheRS/resources/coches/' + matricula + "/kilometraje";

        var parametros = 'kilometraje=' + kilometraje;

        var config = {headers: {'Content-Type': 'application/x-www-form-urlencoded'}};

        $http.post(url, parametros, config).
                success(function (data, status, headers, config) {
                    $scope.coche = data;
                }).
                error(function (data, status, headers, config) {
                    // called asynchronously if an error occurs
                    // or server returns response with an error status.
                });
    };
    
   $scope.back = function(){
       $window.history.back();
   };
});
