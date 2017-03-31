<%@taglib uri="http://www.springframework.org/tags/form" prefix="spring_form"%><html lang="en">
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

<div class="site-wrapper">
    <div class="site-wrapper-inner">
        <div class="cover-container">
            <div class="masthead clearfix">
                <div class="inner">
                    <h3 class="masthead-brand">Habitica</h3>
                    <nav class="nav nav-masthead">
                        <a class="nav-link active" href="${pageContext.request.contextPath}/welcome.jsp">Home</a>
                        <a class="nav-link" href="#">tab2</a>
                        <a class="nav-link" href="#">tab3</a>
                    </nav>
                </div>
            </div>

            <div class="container">
                <h1 class="cover-heading">${user.login}</h1>
                <p class="lead">
                    <a>First name: ${user.firstName}</a><br>
                    <a>Second name: ${user.secondName} </a><br>
                    <a>Last name: ${user.lastName}</a><br>
                    <a>Age: ${user.age}</a>
                </p>
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