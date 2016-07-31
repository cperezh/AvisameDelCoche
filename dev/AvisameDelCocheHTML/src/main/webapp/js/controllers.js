
/*Registro el módulo de controladores del catalogo*/
var controladoresCatalogo = angular.module('controladoresCatalogo', []);

var serverURL = '/AvisameDelCocheRS/resources';

/*CREO UN CONTROLADOR EN EL MODULO. 
 * El segundo parametro es la funcion constructora del controlador, donde se definen las
 * variables y metodos que estaran disponibles en el ambito definido para el controlador*/
controladoresCatalogo.controller('controladorBuscadorCatalogo', function ($scope, $http) {

    $scope.buscar = function (matricula) {

        var url = serverURL+'/coches?matricula=' + matricula;
        var mensaje;

        $http.get(url).
                success(function (data, status, headers, config) {
                    $scope.coches = data;
                }).
                error(function (data, status, headers, config) {
                    switch (status){
                    	case 500: 
                    		mensaje = data.error;
                    		break;
                    	default:
                    		mensaje = data;
                    }
                    alert(mensaje);
                });
    };
});

controladoresCatalogo.controller('controladorDetalleCatalogo', function ($scope, $http, $routeParams, $window) {

    /*ON LOAD*/
    var url = serverURL+'/coches/' + $routeParams.matricula;

    $http.get(url).
            success(function (data, status, headers, config) {
                $scope.coche = data;
            }).
            error(function (data, status, headers, config) {
                // called asynchronously if an error occurs
                // or server returns response with an error status.
            });
	
    /*FIN ON LOAD*/

    $scope.modificar = function () {

        var url = serverURL+'/coches/' + $scope.coche.matricula;

        var parametros = $scope.coche;

        $http.post(url, parametros).
                success(function (data, status, headers, config) {
                    $scope.coche = data;
                }).
                error(function (data, status, headers, config) {
                    // called asynchronously if an error occurs
                    // or server returns response with an error status.
                });
    };
    
    $scope.comprobarEstado = function () {

        var url = serverURL+'/coches/' + $scope.coche.matricula+"/estado";

        var parametros = $scope.coche;

        $http.get(url, parametros).
                success(function (data, status, headers, config) {
                    $scope.coche = data;
                }).
                error(function (data, status, headers, config) {
                    // called asynchronously if an error occurs
                    // or server returns response with an error status.
                });
    };

    $scope.back = function () {
        $window.history.back();
    };
});

controladoresCatalogo.controller('controladorMenuCatalogo', function ($scope, $http, $routeParams, $window) {

});

controladoresCatalogo.controller('controladorAltaCatalogo', function ($scope, $http, $routeParams, $window) {


	 /*ON LOAD*/
    var url = serverURL+'/coches';

    $http.get(url).
            success(function (data, status, headers, config) {
                $scope.coche = data[0];
            }).
            error(function (data, status, headers, config) {
                // called asynchronously if an error occurs
                // or server returns response with an error status.
            });
    
    //Inicializo objetos de pantalla
    $scope.mensaje = '';
//    $scope.coche = {
//    		"matricula":"",
//    		"kilometraje":"",
//    		"estadoComponentes":[]
//    };
    
    /*FIN ON LOAD*/
	
    
    
    $scope.alta = function () {
    	
    	var urlBuscar = serverURL+'/coches/' + $scope.coche.matricula;

        parametros = $scope.coche;

        $http.get(urlBuscar, parametros).
                success(function (data, status, headers, config) {

                    //Si encuentro el coche con esa matricula
                    if (data !== '') {
                        $scope.mensaje = "El coche ya existe";
                    }
                    else {
                        var urlInsertar = serverURL+'/coches';

                        $http.put(urlInsertar, parametros).
                                success(function (data, status, headers, config) {
                                    $scope.mensaje = "Coche insertado";
                                }).
                                error(function (data, status, headers, config) {
                                    $scope.mensaje = data;
                                });
                    }
                }).
                error(function (data, status, headers, config) {
                    $scope.mensaje = data;
                });
    };

});
