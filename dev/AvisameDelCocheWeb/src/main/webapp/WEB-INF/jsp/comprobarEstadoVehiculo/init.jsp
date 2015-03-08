<%-- 
    Document   : init
    Created on : 31-ago-2014, 20:33:41
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html ng-app="phonecatApp"  ng-controller="PhoneListCtrl2">
    <head>
        <title>Avísame del Coche {{query}}</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular-resource.js"></script>
        
        <script src = "../../js/controllers.js" ></script>
        <script>

            $(document).ready(inicializa);

            function inicializa() {
                $("#resultados").hide();
                $("#actualizarKilometraje").hide();
                $("#kilometraje").val(0);
            }

            function buscar() {

                $.ajax({
                    type: "POST",
                    url: "buscar",
                    data: $("#buscarCocheForm").serialize(),
                    success: muestraResultado
                })
            }

            function comprobarEstado() {

                //Ocultamos la capa de resultados.
                $("#resultados").hide();

                $.ajax({
                    type: "POST",
                    url: "comprobarEstado",
                    data: $("#buscarCocheForm").serialize(),
                    success: muestraResultado
                });
            }

            function muestraResultado(coche) {

                $("#coche").html(coche.matricula);
                $("#kilometraje").val(coche.kilometraje);
                $("#matricula").val(coche.matricula);
                $("#kilometros").val(coche.kilometraje);
                $("#resultados").show();
            }

            function actualizarKilometrajeMostrar() {
                $("#actualizarKilometraje").show();
            }

            function actualizarKilometraje() {

                //Ocultamos la capa de resultados.
                $("#actualizarKilometraje").hide();

                $("#kilometraje").val($("#kilometros").val());

                alert($("#buscarCocheForm").serialize());

                $.ajax({
                    type: "POST",
                    url: "actualizarKilometraje",
                    data: $("#buscarCocheForm").serialize(),
                    success: muestraResultado
                });
            }

        </script>
    </head>
    <body>
        <button ng-click="enviar2()">Enviar</button>
        <div class="container-fluid">
            <div class="row">
                <div class="col-md-2">
                    <!--Sidebar content-->

                    Search: <input ng-model="query">

                </div>
                <div class="col-md-10">
                    <!--Body content-->

                    <ul class="phones">
                        <li ng-repeat="phone in phones| filter:query">
                            {{phone.name}}
                            <p>{{phone.snippet}}</p>
                        </li>
                    </ul>

                </div>
            </div>
        </div>
        <p>{{query}}</p>
         <p>{{name}}</p>
        <ul>
            <li ng-repeat="phone in phones">
                <span>{{phone.name}}</span>
                <p>{{phone.snippet}}</p>
            </li>
        </ul>
        <p>Total number of phones: {{phones.length}}</p>
       
        <table>
            <tr><th>row</th></tr>
            <tr ng-repeat="i in [0, 1, 2, 3, 4, 5, 6, 7]"><td><th>column</th></td><td ng-repeat="j in [0, 1, 2, 3, 4, 5, 6, 7]">{{i}}{{j}}</td></tr>
        </table>
        
        <form id="buscarCocheForm">
            <input type="text" id="matricula" name="matricula">
            <input type="hidden" id="kilometraje" name="kilometraje">
            <input type="button" value="Buscar" onclick="buscar()">
        </form>
        <div id="resultados">
            <div id="resultado">
                <div id="coche"></div>
                <input type="button" value="Comprobar estado" onclick="comprobarEstado()"/>
                <input type="button" value="Actualizar kilometraje" onclick="actualizarKilometrajeMostrar()"/>
                <input id="cocheSeleccionado" type="hidden" value=""/>
            </div>
        </div>
        <div id="actualizarKilometraje">
            <form id="actualizarKilometrajeCocheForm">
                <input type="text" id="kilometros" name="kilometros">
                <input type="button" value="actualizar" onclick="actualizarKilometraje()">
            </form>
        </div>
    </body>
</html>
