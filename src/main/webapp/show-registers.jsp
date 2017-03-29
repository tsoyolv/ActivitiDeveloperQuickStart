<%@ page import="com.olts.registration.ShowRegisteredUsers" %><%--
  Created by IntelliJ IDEA.
  User: o.tsoy
  Date: 24.03.2017
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Habitica</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/cover.css" rel="stylesheet">
</head>
<body>

<div class="site-wrapper">

    <div class="site-wrapper-inner">

        <div class="cover-container">

            <div class="masthead clearfix">
                <div class="inner">
                    <h3 class="masthead-brand">Habitica</h3>
                    <nav class="nav nav-masthead">
                        <a class="nav-link active" href="welcome.jsp">Home</a>
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
                    <%= ShowRegisteredUsers.show(request.getServletContext()) %>
                    </tbody>
                </table>
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
<script src="js/bootstrap.min.js"></script>
</body>
</html>