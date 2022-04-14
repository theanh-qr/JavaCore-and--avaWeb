<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="author" content="Untree.co">
	<link rel="shortcut icon" href="../favicon.png">
	<meta name="description" content="" />
	<meta name="keywords" content="bootstrap, bootstrap5" />
<link href="${pageContext.request.contextPath}/bootstrap/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/font/fontawesome/css/all.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/bootstrap/tiny-slider.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/css/login.css" rel="stylesheet">
<title>Furni</title>
</head>
<body>
<main class="container">
    <div class="row">
      <div class="col-12 col-md-5"></div>
      <div class="col-12 col-md-2">
        <button class="btn btn-success btn-add" type="button">Login</button>
      </div>
      <div class="col-12 col-md-5"></div>
      <div class="col-12 col-md-3"></div>
      <div class="bg-form-show"></div>
      <div class="col-12 col-md-6 bg-light border border-danger rounded form-add">
          <i class="fas fa-window-close" id="close-form" type="button"></i>
          <form class="row g-3">
              <div class="col-md-12 mb-3">
							    <label for="inputEmail" class="form-label text-primary"><i class="fa-solid fa-envelope text-primary"></i> Email</label>
							    	<input type="email" class="form-control" id="inputEmail" placeholder="Enter Email">
							  	</div>
							  	<div class="col-md-12 mb-3">
								    <label for="inputPassword" class="form-label text-primary"><i class="fa-solid fa-key text-primary"></i> Password</label>
								    <input type="password" class="form-control" id="inputPassword" placeholder="Enter Password">
							  	</div>
							  	<div class="col-md-12 mb-3">
							    	<label for="inputFullName" class="form-label text-primary"><i class="fa-solid fa-user text-primary"></i> Full Name</label>
							    	<input type="text" class="form-control" id="inputFullName" placeholder="Enter Your Name">
							  	</div>
							  	<div class="col-md-12 mb-3">
							    	<label for="inputAddress" class="form-label text-primary"><i class="fa-solid fa-location-dot text-primary"></i> Address</label>
							    	<input type="text" class="form-control" id="inputAddress" placeholder="Enter Your Address">
							  	</div>
							    <div class="col-12 form-check mb-3">
							      	<input class="form-check-input" type="checkbox" id="gridCheck">
							      	<label class="form-check-label text-primary" for="gridCheck">
							        	Subscribe to our newsletter<br/>

										Your personal data will be used to support your<br/> experience throughout this website, to manage access to<br/> your account, and for other <br/>purposes described in our privacy policy.
							      	</label>
							    </div>
								<div class="col-12">
								    <button type="submit" class="btn btn-primary">Register</button>
								</div>
            </form>
      </div>
      <div class="col-12 col-md-3"></div>
    </div>
</main>

<!-- End Slider Section -->
	<script src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/tiny-slider.js"></script>
	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/custom.js"></script>
</body>
</html>