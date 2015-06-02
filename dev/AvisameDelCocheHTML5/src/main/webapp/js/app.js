
/*Registro la aplicación y los módulos de los que depende*/
var catalogoTelefonos = angular.module('catalogoTelefonos', [
    'controladoresCatalogo',
    'ngRoute'
]);

catalogoTelefonos.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
                when('/menu', {
                    templateUrl: 'menu.html',
                    controller: 'controladorMenuCatalogo'
                }).
                when('/buscador', {
                    templateUrl: 'buscador.html',
                    controller: 'controladorBuscadorCatalogo'
                }).
                when('/detalle/:matricula', {
                    templateUrl: 'detalle.html',
                    controller: 'controladorDetalleCatalogo'
                }).
                when('/alta', {
                    templateUrl: 'alta.html',
                    controller: 'controladorAltaCatalogo'
                }).
                otherwise({
                    redirectTo: '/menu'
                });
    }]);

