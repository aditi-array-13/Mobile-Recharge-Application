<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<link href="styles.css" rel="stylesheet">
<style type="text/css">
	.container {
	border: medium;
	border-color: black;
	border-style: double;
	}
</style>
</head>
<body>
<header class="header">
    <nav class="navbar sticky-top navbar-expand-lg">
        <div class="container-fluid">
            <a class="navbar-brand text-white" href="#">TransactEase</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav ms-auto">
                    <li class="nav-item">
                        <a class="nav-link" href="index.html">BacktoHome</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>
<main>
    <div class="container justify-content-center mt-4 pt-4 mb-4 pb-4 border-box">
        <h2>User Registration</h2>
        <form action="RegisterServlet" method="post">
            <div class="mb-3">
                <label for="mobileno" class="form-label">Mobile Number</label>
                <input type="text" class="form-control" id="mobileno" name="mobileno" required>
            </div>
            <div class="mb-3">
                <label for="fullname" class="form-label">Full Name</label>
                <input type="text" class="form-control" id="fullname" name="fullname" required>
            </div>
            <div class="mb-3">
                <label for="username" class="form-label">Username</label>
                <input type="text" class="form-control" id="username" name="username" required>
            </div>
            <div class="mb-3">
                <label for="emailid" class="form-label">Email Address</label>
                <input type="email" class="form-control" id="emailid" name="emailid" required>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <div class="mb-3">
                <label for="balance" class="form-label">Initial Balance</label>
                <input type="number" step="0.01" class="form-control" id="balance" name="balance" required>
            </div>
            <div class="mb-3">
            <button type="submit" class="btn btn-primary">Register</button><br/>
            Already have an account?<a href="Login.jsp">Login</a>
            </div>
        </form>
    </div>
</main>
<footer class="footer p-4 text-center fixed-bottom">
	<p>&copy; 2024 TransactEase. All Rights Reserved.</p>
</footer>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js" integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy" crossorigin="anonymous"></script>
</body>
</html>
