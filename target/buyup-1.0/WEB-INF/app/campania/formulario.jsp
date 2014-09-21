<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Campaña</title>
        <%@include file="/public/header.jsp" %>
    </head>
    <body>
        <%@include file="/public/topbar.jsp" %>
        <div class="container-fluid">
            <div class="row">
                <%@include file="/public/menu.jsp" %>

                <!-- CONTENIDO -->
                <section class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">

                    <h1 class="page-header">Nueva Campaña</h1>

                    <form method="post" action="<%=request.getContextPath()%>/campania/save" class="form-horizontal">
                        
                         <input type="hidden" value="${campania.id}" name="id">
                        
                        <div class="form-group">
                            <label class="col-sm-2 control-label">Nombre</label>

                            <div class="col-sm-10">
                                <input type="text" name="nombre" class="form-control" value="${campania.nombre}" >
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label">Fecha Inicio</label>

                            <div class="col-sm-10">
                                <input id="fecha_inicio" type="text" name="fecha_inicio" class="form-control" value="${campania.fecha_inicio}">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label">Fecha Fin</label>

                            <div class="col-sm-10">
                                <input id="fecha_fin" type="text" name="fecha_fin" class="form-control" value="${campania.fecha_fin}">
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <button type="submit" class="btn btn-primary">Guardar</button>
                                <a class="btn btn-link" href="<%=request.getContextPath()%>/campania"> Cancelar</a>
                            </div>
                        </div>
                    </form>

                </section>
                <!-- CONTENIDO -->
            </div>
        </div>
    </body>
    
    <%@include file="/public/footer.jsp" %>
    <script>
        $(function(){
           $( "#fecha_inicio" ).datepicker();
           $( "#fecha_fin" ).datepicker();
            
        });
        
    </script>
</html>
