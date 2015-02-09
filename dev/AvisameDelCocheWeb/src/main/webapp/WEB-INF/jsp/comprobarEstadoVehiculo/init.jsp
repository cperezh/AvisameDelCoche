<%-- 
    Document   : init
    Created on : 31-ago-2014, 20:33:41
    Author     : Carlos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Avísame del Coche</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
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
