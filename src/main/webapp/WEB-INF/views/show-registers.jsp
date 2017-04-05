<%--
  Created by IntelliJ IDEA.
  User: o.tsoy
  Date: 24.03.2017
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Habitica</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/css/cover.css" rel="stylesheet">
</head>
<body>
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>
<script>
    jQuery(document).ready(function($) {
        $(".clickable-row").click(function() {
            window.location = $(this).attr("href");
        });
    });
</script>
<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                    <h3 class="masthead-brand">Habitica</h3>
                    <nav class="nav nav-masthead">
                        <a class="nav-link active" href="${pageContext.request.contextPath}/">Home</a>
                        <a class="nav-link" href="#">tab2</a>
                        <a class="nav-link" href="#">tab3</a>
                    </nav>
                </div>
            </div>


            <div class="container">
                <h2>Registered Users Table</h2>
                <table class="table">
                    <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Second Name</th>
                        <th>Last Name</th>
                        <th>Age</th>
                    </tr>
                    <tbody>
                    <c:forEach items="${users}" var="user">
                        <tr class='clickable-row' href='user/${user.id}'>
                            <th>${user.firstName}</th>
                            <th>${user.secondName}</th>
                            <th>${user.lastName}</th>
                            <th>${user.age}</th>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>

                <!-- Button trigger modal -->
                <button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
                    Launch demo modal
                </button>

                <!-- Modal -->
                <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
                    <div class="modal-dialog" role="document">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                <h4 class="modal-title" id="myModalLabel">Modal title</h4>
                            </div>
                            <div class="modal-body">

                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="mastfoot">
                <div class="inner">
                    <p>Created by <a href="https://github.com/TcoiOleg">TcoiOleg</a>.</p>
                </div>
            </div>

        </div>

    </div>

</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>

</body>
</html>