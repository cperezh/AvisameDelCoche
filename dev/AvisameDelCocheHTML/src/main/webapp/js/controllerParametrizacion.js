/*Registro el módulo de controladores del catalogo*/
var controladoresParametrizacion = angular.module('controladoresParametrizacion', []);

var urlComponentes = serverURL+'/componentes/'

controladoresParametrizacion.controller('controladorDetalleComponente', function ($scope, $http, $routeParams, $window,$filter) {

	/*ON LOAD*/
	var url = urlComponentes + $routeParams.idComponente;
	$scope.mensaje = "";

	$http.get(url).
	then(
		function succes(response) {
			$scope.componente = response.data; 
		},
		function error(response) {

		}
		);

	/*FIN ON LOAD*/

	$scope.modificar = function () {

		var url = urlComponentes + $scope.componente.idcomponente;

		$http.post(url, $scope.componente).
		then(
			function success(response) {
				$scope.mensaje = "Componente modificado";
			},
			function error (response) {
			}
			);
	};

	/*Verifica si hay otro componente con el mismo nombre */
	$scope.verificarNombreNoRepetido = function (componente){

		var url = urlComponentes + "?q=all";

		$http.get(url).
		then(
			function success(response) {

				var componentes = response.data;

				$scope.modificarComponenteForm.nombre.$setValidity("nombreRepetido",!buscarDuplicado(componente,componentes));

			},
			function error (response) {
			}
			);
	}

	/*Busca un duplicado del componente por nombre, en la lista de componentes*/
	function buscarDuplicado(componente,componentes){

		var componenteAux;

		var componenteMayuscula = $filter('uppercase')(componente.nombre);
		var componeneAuxMayuscula;

		for (i=0;i<componentes.length;i++){

			componenteAux = componentes[i];

			componeneAuxMayuscula = $filter('uppercase')(componenteAux.nombre);

			if (componenteMayuscula == componeneAuxMayuscula && componenteAux.idcomponente != componente.idcomponente){
				return true;
			}
		}

		return false;
	}
});