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
            
            function inicializa(){
                $("#resultados").hide();
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
                $.ajax({
                    type: "POST",
                    url: "comprobarEstado",
                    data: $("#buscarCocheForm").serialize(),
                    success: muestraResultado
                })
            }

            function muestraResultado(coche) {
               // $("#cocheSeleccionado").on(click,)
                $("#resultado").html(coche.matricula);  
                $("#resultados").show();
            }
        </script>
    </head>
    <body>
        <form id="buscarCocheForm" action="comprobar" method="post">
            <input type="text" id="matricula" name="matricula">
            <input type="button" value="Buscar" onclick="buscar()">
        </form>
        <div id="resultados">
            <div id="resultado" style="float: left"></div><div style="float: left"><input id="cocheSeleccionado" type="button" value="Comprobar estado" onclick="comprobarEstado()"></div>
        </div>
    </body>
</html>
