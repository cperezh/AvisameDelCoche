
/*Registro el módulo de controladores del catalogo*/
var controladoresCatalogo = angular.module('controladoresCatalogo', []);

/*CREO UN CONTROLADOR EN EL MODULO. 
 * El segundo parametro es la funcion constructora del controlador, donde se definen las
 * variables y metodos que estaran disponibles en el ambito definido para el controlador*/
 controladoresCatalogo.controller('controladorBuscadorCatalogo', function ($scope, $http,$location) {

    $scope.buscar = function (matricula) {

        var url = serverURL+'/coches?matricula=' + matricula;
        var mensaje;

        $http.get(url).
        then(
            function success(response) {
                $scope.coches = response.data;
            },
            function error(response) {
                mensaje = response.data;
            } 
        );
    };

    $scope.nav = function(url){
        $location.url(url);
    }
});

 controladoresCatalogo.controller('controladorDetalleCatalogo', function ($scope, $http, $routeParams, $window) {

    /*ON LOAD*/
    var url = serverURL+'/coches/' + $routeParams.matricula;

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

 controladoresCatalogo.controller('controladorMenuCatalogo', function ($scope, $http, $routeParams, $window) {

 });

 controladoresCatalogo.controller('controladorAltaCatalogo', function ($scope, $http, $routeParams, $window) {


    /*ON LOAD*/
    $http.get(serverURL+'/coches').
    then(
        function success(response) {
            $scope.coche = response.data[0];
        },
        function error(response) {
                   
        }
    );
  
    //Inicializo objetos de pantalla
    $scope.mensaje = '';
    
    /*FIN ON LOAD*/
    
    
    
    $scope.alta = function () {
    	
        parametros = $scope.coche;

        $http.get(serverURL+'/coches/' + $scope.coche.matricula).
        then(
            function success(response) {

                    //Si encuentro el coche con esa matricula
                    if (response.data !== '') {
                        $scope.mensaje = "El coche ya existe";
                    }
                    else {
                        var urlInsertar = serverURL+'/coches';

                        $http.put(urlInsertar, parametros).
                        then(
                            function success(response) {
                                $scope.mensaje = "Coche insertado";
                            },
                            function error(response) {
                                $scope.mensaje = response.data;
                            }
                        );
                    }
            },
            function error(response) {
                $scope.mensaje = response.data;
            }
        );
    };

});
