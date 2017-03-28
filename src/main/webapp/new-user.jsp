<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css"/>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <form action="rest/user" method="post"  role="form" data-toggle="validator" >
        <h2>Employee</h2>
        <div class="form-group col-xs-4">
            <label for="name" class="control-label col-xs-4">Name:</label>
            <input type="text" name="name" id="name" class="form-control" value="${user.name}"
                   required="true"/>

            <label for="lastName" class="control-label col-xs-4">Last name:</label>
            <input type="text" name="lastName" id="lastName" class="form-control" value="${user.lastName}"
                   required="true"/>
            <br></br>
            <button type="submit" class="btn btn-primary  btn-md">Accept</button>
        </div>
    </form>
</div>
</body>
</html>