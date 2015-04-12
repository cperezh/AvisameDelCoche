/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*REGISTRO EL MODULO*/
var catalogoTelefonos = angular.module('catalogoTelefonos',[]);

/*CREO UN CONTROLADOR EN EL MODULO. 
 * El segundo parametro es la funcion constructora del controlador, donde se definen las
 * variables y metodos que estaran disponibles en el ambito definido para el controlador*/
catalogoTelefonos.controller('controladorCatalogo',function ($scope,$http){
    $scope.nombre ='Carlos';
    
    $scope.buscar = function(){
        alert("buscando");
        $http.get('http://localhost:8080/AvisameDelCocheWeb/main/comprobarEstadoVehiculo/init').
            success(function(data, status, headers, config) {
            // this callback will be called asynchronously
            // when the response is available
            }).
            error(function(data, status, headers, config) {
              // called asynchronously if an error occurs
              // or server returns response with an error status.
            });
     };
 });
