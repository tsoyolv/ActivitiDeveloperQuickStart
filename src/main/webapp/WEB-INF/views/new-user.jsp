<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Habitica</title>

    <!-- Bootstrap core CSS -->
    <link href="../../css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="../../css/cover.css" rel="stylesheet">
</head>

<body>

<div class="site-wrapper">
    <div class="site-wrapper-inner">
        <div class="cover-container">
            <div class="masthead clearfix">
                <div class="inner">
                    <h3 class="masthead-brand">Habitica</h3>
                    <nav class="nav nav-masthead">
                        <a class="nav-link active" href="../../welcome.jsp">Home</a>
                        <a class="nav-link" href="#">tab2</a>
                        <a class="nav-link" href="#">tab3</a>
                    </nav>
                </div>
            </div>

            <div class="container">
                <form action="/user" method="post" data-toggle="validator" >
                    <h2>User</h2>
                    <div class="form-group col-xs-4">
                        <label for="firstName" class="control-label col-xs-4">First name:</label>
                        <input type="text" name="firstName" id="firstName" class="form-control" value="${user.firstName}" required="true"/>

                        <label for="secondName" class="control-label col-xs-4">Last name:</label>
                        <input type="text" name="secondName" id="secondName" class="form-control" value="${user.secondName}"/>

                        <label for="lastName" class="control-label col-xs-4">Second name:</label>
                        <input type="text" name="lastName" id="lastName" class="form-control" value="${user.lastName}" required="true"/>

                        <label for="login" class="control-label col-xs-4">Login:</label>
                        <input type="text" name="login" id="login" class="form-control" value="${user.login}" required="true"/>

                        <label for="password" class="control-label col-xs-4">Password:</label>
                        <input type="text" name="password" id="password" class="form-control" value="${user.password}" required="true"/>

                        <label for="age" class="control-label col-xs-4">Age:</label>
                        <input type="text" name="age" id="age" class="form-control" value="${user.age}"/>
                        <br></br>
                        <button type="submit" class="btn btn-lg btn-secondary">Create</button>
                    </div>
                </form>
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
<script src="../../js/bootstrap.min.js"></script>
</body>
</html>