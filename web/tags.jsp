<%@page contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
	<title>Tags</title>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="Servlet" method="POST">
		<h1 align="center">Tags</h1>
		<div class="form-group" align="center">
                    <div class="form-group" align="center">
                    <div class="row">
                        <div class="col-md-3">
                            <img name="tag1">
                            <p name="tag1"></p>
                        </div>
                        <div class="col-md-3">
                            <img name="tag2">
                            <p name="tag2"></p>
                        </div>
                        <div class="col-md-3">
                            <img name="tag3">
                            <p name="tag3"></p>
                        </div>
                        <div class="col-md-3">
                            <img name="tag4">
                            <p name="tag4"></p>
                        </div>
                    </div>
                    <input align="center" type="submit" name="Editar" value="Editar" class="btn btn-default">
		</div>
	</form>
</body>
</html>