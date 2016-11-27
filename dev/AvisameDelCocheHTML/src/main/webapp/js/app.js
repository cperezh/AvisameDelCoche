
var serverURL = '/AvisameDelCocheRS/resources';

/*Registro la aplicación y los módulos de los que depende*/
var catalogoTelefonos = angular.module('catalogoTelefonos', [
    'controladoresCatalogo',
    'controladoresParametrizacion',
    'ngRoute',
    'ngMessages'
]);

catalogoTelefonos.config(['$routeProvider',
    function ($routeProvider) {
        $routeProvider.
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
                 when('/buscarComponente', {
                    templateUrl: 'param/buscador.html',
                    controller: 'controladorBuscarComponente'
                }).
                when('/detalleComponente/:idComponente', {
                    templateUrl: 'param/detalleComponente.html',
                    controller: 'controladorDetalleComponente'
                }).
                otherwise({
                    redirectTo: '/buscador'
                });
    }])



