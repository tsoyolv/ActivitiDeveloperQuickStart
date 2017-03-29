<html lang="en">
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
                <form action="rest/user" method="post"  data-toggle="validator" >
                    <h2>User</h2>
                    <div class="form-group col-xs-4">
                        <label for="name" class="control-label col-xs-4">Name:</label>
                        <input type="text" name="name" id="name" class="form-control" value="${user.name}"
                               required="true"/>

                        <label for="lastName" class="control-label col-xs-4">Last name:</label>
                        <input type="text" name="lastName" id="lastName" class="form-control" value="${user.lastName}"
                               required="true"/>
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
<script src="js/bootstrap.min.js"></script>
</body>
</html>