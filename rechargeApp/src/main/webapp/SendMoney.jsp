<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transact Money</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<link href="styles.css" rel="stylesheet">
</head>
<style type="text/css">
	.container {
	border: medium;
	border-color: black;
	border-style: double;
	}
</style>
</head>
<body>
	<header>
		<nav class="navbar sticky-top navbar-expand-lg">
			<div class="container-fluid">
				<a class="navbar-brand text-white" href="#">TransactEase</a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarNav"
					aria-controls="navbarNav" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarNav">
					<ul class="navbar-nav ms-auto">
						<li class="nav-item"><a class="nav-link" href="index.html">Back
								to Home</a></li>
						<li class="nav-item"><a class="nav-link" href="Profile.jsp"
							style="background-color: #C0C0C0; border-radius: 45%;"> <svg
									xmlns="http://www.w3.org/2000/svg" width="16" height="16"
									fill="currentColor" class="bi bi-person" viewBox="0 0 16 16">
                                <path
										d="M8 8a3 3 0 1 0 0-6 3 3 0 0 0 0 6m2-3a2 2 0 1 1-4 0 2 2 0 0 1 4 0m4 8c0 1-1 1-1 1H3s-1 0-1-1 1-4 6-4 6 3 6 4m-1-.004c-.001-.246-.154-.986-.832-1.664C11.516 10.68 10.289 10 8 10s-3.516.68-4.168 1.332c-.678.678-.83 1.418-.832 1.664z" />
                            </svg>
						</a></li>
						<li class="nav-item"><a class="nav-link" href="LogoutServlet">Logout</a>
						</li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<main>
		<div class="container justify-content-center mt-4 pt-4 mb-4 pb-4 border-box">
			<h2>Send Money</h2>
			<form action="SendMoneyServlet" method="post">
			<table class="table">
			<tr>
				<td><label for="mobileno" class="form-label">Recipient Mobile No:</label></td>
				<td><input type="text" id="mobileno" name="mobileno" class="form-control" required></td>
				</tr>
				<tr>
					<td><label for="amount" class="form-label">Amount:</label></td>
					<td><input type="number" id="amount" name="amount" class="form-control" required></td>
				</tr>
				<tr>
					<td colspan="2">
					<div class="vstack gap-2 col-md-5 mx-auto">
						<button type="submit" class="btn btn-primary">Send Money</button>
						<a href="Dashboard.jsp" class="btn btn-secondary">Go toDashboard</a>
					</div></td>
				</tr>
			</table>
			</form>
		</div>
	</main>
	<footer class="footer p-4 text-center fixed-bottom">
		<p>&copy; 2024 TransactEase. All Rights Reserved.</p>
	</footer>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
		integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.min.js"
		integrity="sha384-0pUGZvbkm6XF6gxjEnlmuGrJXVbNuzT9qBBavbLwCsOGabYfZo0T0to5eqruptLy"
		crossorigin="anonymous"></script>
</body>
</html>
