<%-- 
    Document   : colegios en los estados
    Created on : 20/01/2020, 12:39:49 PM
    Author     : CECYTE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Codigo_Java.Controlador"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Colegios en los estados</title>
         <title>Colegios en los estados</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/estilos.css">
        <link rel="stylesheet" href="https://framework-gb.cdn.gob.mx/qa/assets/styles/main.css">
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>


        <link href="Css/mi-slider.css" rel="stylesheet" type="text/css"/>
        <link href="Css/Barramenu.css" rel="stylesheet" type="text/css"/>
        <link href="Css/Inicio.css" rel="stylesheet" type="text/css"/>
        <script src="JavaScrip/jquery.nivo.slider.js" type="text/javascript"></script>
        <script src="JavaScrip/colegios en los estados.js"></script>
	<script src="JavaScrip/colegios en los estados2.js"></script>
        <link rel="stylesheet" href="Css/colegios en los estados.css">
    </head>
    <body>
      <div id="espacioherencia">
            <script src="JavaScrip/barramenu1.js" type="text/javascript"></script>
        </div>   
        <div id="PIE">




	<header>
		<div class="header-top" id="colorc">
			<div class="navegacion">
				<input type="search" placeholder="Buscar . . ." id="inputBusqueda">
			</div>
		</div>
		<div class="search" id="search">
			<table class="search-table" id="searchTable">
				<thead>
					<tr>
						<td></td>
					</tr>
				</thead>
				<tbody>
					<%=Controlador.getVistabuscador()%>
				</tbody>
			</table>
		</div>
	
	</header>
	
	<script src="JavaScrip/colegios en los estados3.js"></script>
</div>
<!-- Tabla -->    
<center><h2>Colegios en los Estados</h2></center>
        <div id="directorio">   

            <div class="container"  >
                <table class="table" >
                    <%=Controlador.getVistatabla()%>
                </table>
            </div>
        </div> 
        <script src="JavaScrip/popup.js" type="text/javascript"></script>
        <script src="https://framework-gb.cdn.gob.mx/qa/gobmx.js"></script>
  
        
        
        
        
        
        
        
        
        
        
        
        
    </body>
</html>
