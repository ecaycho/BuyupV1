<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>BuyUP - Ingresar</title>
        <%@include file="/public/header.jsp" %>
    </head>
    <body>

        <div class="container-fluid">
            <div class="row">
                <div class="col-md-12 cabecera">
                    <img style="margin: 0px 100px 10px;" width="150px;" src="<%=request.getContextPath()%>/images/buyup.png" />
                </div>    
            </div>
            <div class="row row-centered">

                <form role="form" action="<%=request.getContextPath()%>/j_spring_security_check" method="POST" >

                    <div class="col-sm-6 col-md-6 col-centered" style="width: 400px; text-align: center; margin-left: auto; margin-right: auto;">

                        <h2 style="margin-bottom: 50px;" class="form-signin-heading text-center">Ingreso al CRM</h2>
                        <input style="margin-bottom: 10px;" type="email" class="form-control" placeholder="Correo" required="" autofocus="" name="j_username">
                        <input style="margin-bottom: 10px;" type="password" class="form-control" placeholder="Contraseña" required="" name="j_password">

                        <c:if test="${loginError}">
                            <p style="margin-bottom: 10px;" class="text-danger text-center">Usuario y/o contraseña incorrectos.</p>
                        </c:if>

                        <button style="margin-bottom: 10px;" class="btn btn-lg btn-primary btn-block" type="submit">Ingresar</button>
                    </div>
                  
                </form>


            </div>




            <%@include file="/public/footer.jsp" %>
        </div>
    </body>

</html>
