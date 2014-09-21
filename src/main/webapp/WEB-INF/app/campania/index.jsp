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
                    <a href="<%=request.getContextPath()%>/campania/create" class="btn btn-primary pull-right" >Nuevo</a>
                    <h1 class="page-header">Campañas</h1>

                    <table class="table table-hover table-striped">

                        <tr class="bg-info">
                            <th width="30%">Campaña</th>
                            <th width="45%">Fecha Inicio</th>
                            <th width="45%">Fecha Inicio</th>
                            <th></th>
                            <th></th>
                        </tr>

                        <c:forEach var="i" items="${campania}">
                            <tr>
                                <td><c:out value="${i.nombre}"/></td>
                                <td><c:out value="${i.fecha_inicio}"/></td>
                                <td><c:out value="${i.fecha_fin}"/></td>
                                <td>
                                    <c:if test="${i.estado == 'ACTIVO'}">
                                        <span class="label label-success"> <c:out value="${i.estado}"/> </span>
                                    </c:if>
                                    <c:if test="${i.estado == 'INACTIVO'}">
                                        <span class="label label-danger"> <c:out value="${i.estado}"/> </span>
                                    </c:if>
                                </td>
                                <td>
                                    <div class="btn-group">
                                        <button class="btn btn-link dropdown-toggle" data-toggle="dropdown">
                                            <span class="glyphicon glyphicon-cog"></span>
                                        </button>
                                        <ul class="dropdown-menu pull-right" role="menu">
                                            <li><a href="<%=request.getContextPath()%>/campania/update/${i.id}">Editar</a></li>
                                            <li><a href="<%=request.getContextPath()%>/campania/delete/${i.id}">Eliminar</a></li>
                                        </ul>
                                    </div>
                                </td>
                            </tr>
                        </c:forEach>

                    </table>
                </section>
                <!-- CONTENIDO -->
                
                
            </div>
        </div>
    </body>
    <%@include file="/public/footer.jsp" %>
</html>
