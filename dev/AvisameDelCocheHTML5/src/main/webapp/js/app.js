
/*Registro la aplicación y los módulos de los que depende*/
var catalogoTelefonos = angular.module('catalogoTelefonos', [
    'controladoresCatalogo',
    'ngRoute'
]);

catalogoTelefonos.config(['$routeProvider',
  function($routeProvider) {
    $routeProvider.
      when('/buscador', {
        templateUrl: 'buscador.html',
        controller: 'controladorCatalogo'
      }).
      when('/detalle/:matricula', {
        templateUrl: 'detalle.html',
        controller: 'controladorCatalogo'
      }).
      otherwise({
        redirectTo: '/buscador'
      });
  }]);

