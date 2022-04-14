<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="author" content="Untree.co">
<link rel="shortcut icon" href="${pageContext.request.contextPath}/favicon.png">
<meta name="description" content="" />
<meta name="keywords" content="bootstrap, bootstrap5" />
<link href="${pageContext.request.contextPath}/css/index.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/bootstrap/bootstrap.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/font/fontawesome/css/all.min.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/bootstrap/tiny-slider.css" rel="stylesheet">


<title>Furni</title>
</head>
<body>
	<jsp:include page="view/header.jsp" />

	<!-- Start Product Section -->
	<div class="product-section">
		<div class="container">
			<div class="row">
				<div class="col-md-12 col-lg-3 mb-5 mb-lg-0">
					<h2 class="mb-4 section-title">Crafted with excellent
						material.</h2>
					<p class="mb-4">Donec vitae odio quis nisl dapibus malesuada.
						Nullam ac aliquet velit. Aliquam vulputate velit imperdiet dolor
						tempor tristique.</p>
					<p class="btn-md-centrer">
						<a href="shop.html" class="btn">Explore</a>
					</p>
				</div>

				<div class="col-12 col-md-4 col-lg-3 mb-5 mb-md-0">
					<a class="product-item" href="cart.html"> <img
						src="${pageContext.request.contextPath}/images/product-1.png" class="img-fluid product-thumbnail">
						<h3 class="product-title">Nordic Chair</h3> <strong
						class="product-price">$50.00</strong> <span class="icon-cross">
							<img src="${pageContext.request.contextPath}/images/cross.svg" class="img-fluid">
					</span>
					</a>
				</div>

				<div class="col-12 col-md-4 col-lg-3 mb-5 mb-md-0">
					<a class="product-item" href="cart.html"> <img
						src="${pageContext.request.contextPath}/images/product-2.png" class="img-fluid product-thumbnail">
						<h3 class="product-title">Kruzo Aero Chair</h3> <strong
						class="product-price">$78.00</strong> <span class="icon-cross">
							<img src="${pageContext.request.contextPath}/images/cross.svg" class="img-fluid">
					</span>
					</a>
				</div>

				<div class="col-12 col-md-4 col-lg-3 mb-5 mb-md-0">
					<a class="product-item" href="cart.html"> <img
						src="${pageContext.request.contextPath}/images/product-3.png" class="img-fluid product-thumbnail">
						<h3 class="product-title">Ergonomic Chair</h3> <strong
						class="product-price">$43.00</strong> <span class="icon-cross">
							<img src="${pageContext.request.contextPath}/images/cross.svg" class="img-fluid">
					</span>
					</a>
				</div>
			</div>
		</div>
	</div>
	<!-- End Product Section -->

	<!-- Start Why Choose Us Section -->
	<div class="why-choose-section">
		<div class="container">
			<div class="row justify-content-between">
				<div class="col-lg-6">
					<h2 class="section-title">Why Choose Us</h2>
					<p>Donec vitae odio quis nisl dapibus malesuada. Nullam ac
						aliquet velit. Aliquam vulputate velit imperdiet dolor tempor
						tristique.</p>
					<div class="row my-5">
						<div class="col-6 col-md-6">
							<div class="feature">
								<div class="icon">
									<img src="${pageContext.request.contextPath}/images/truck.svg" alt="Image" class="img-fluid">
								</div>
								<h3>Fast &amp; Free Shipping</h3>
								<p>Donec vitae odio quis nisl dapibus malesuada. Nullam ac
									aliquet velit. Aliquam vulputate.</p>
							</div>
						</div>

						<div class="col-6 col-md-6">
							<div class="feature">
								<div class="icon">
									<img src="${pageContext.request.contextPath}/images/bag.svg" alt="Image" class="img-fluid">
								</div>
								<h3>Easy to Shop</h3>
								<p>Donec vitae odio quis nisl dapibus malesuada. Nullam ac
									aliquet velit. Aliquam vulputate.</p>
							</div>
						</div>

						<div class="col-6 col-md-6">
							<div class="feature">
								<div class="icon">
									<img src="${pageContext.request.contextPath}/images/support.svg" alt="Image" class="img-fluid">
								</div>
								<h3>24/7 Support</h3>
								<p>Donec vitae odio quis nisl dapibus malesuada. Nullam ac
									aliquet velit. Aliquam vulputate.</p>
							</div>
						</div>

						<div class="col-6 col-md-6">
							<div class="feature">
								<div class="icon">
									<img src="${pageContext.request.contextPath}/images/return.svg" alt="Image" class="img-fluid">
								</div>
								<h3>Hassle Free Returns</h3>
								<p>Donec vitae odio quis nisl dapibus malesuada. Nullam ac
									aliquet velit. Aliquam vulputate.</p>
							</div>
						</div>

					</div>
				</div>

				<div class="col-lg-5 img-full">
					<div class="img-wrap ">
						<img src="${pageContext.request.contextPath}/images/why-choose-us-img.jpg" alt="Image"
							class="img-fluid">
					</div>
				</div>

			</div>
		</div>
	</div>
	<!-- End Why Choose Us Section -->

	<!-- Start We Help Section -->
	<div class="we-help-section">
		<div class="container">
			<div class="row justify-content-between">
				<div class="col-lg-7 mb-5 mb-lg-0 img-full">
					<div class="imgs-grid">
						<div class="grid grid-1">
							<img src="${pageContext.request.contextPath}/images/img-grid-1.jpg" alt="Untree.co">
						</div>
						<div class="grid grid-2">
							<img src="${pageContext.request.contextPath}/images/img-grid-2.jpg" alt="Untree.co">
						</div>
						<div class="grid grid-3">
							<img src="${pageContext.request.contextPath}/images/img-grid-3.jpg" alt="Untree.co">
						</div>
					</div>
				</div>
				<div class="col-lg-5 ps-lg-5">
					<h2 class="section-title mb-4">We Help You Make Modern
						Interior Design</h2>
					<p>Donec facilisis quam ut purus rutrum lobortis. Donec vitae
						odio quis nisl dapibus malesuada. Nullam ac aliquet velit. Aliquam
						vulputate velit imperdiet dolor tempor tristique. Pellentesque
						habitant morbi tristique senectus et netus et malesuada</p>

					<ul class="list-unstyled custom-list my-4">
						<li>Donec vitae odio quis nisl dapibus malesuada</li>
						<li>Donec vitae odio quis nisl dapibus malesuada</li>
						<li>Donec vitae odio quis nisl dapibus malesuada</li>
						<li>Donec vitae odio quis nisl dapibus malesuada</li>
					</ul>
					<p class="btn-md-centrer">
						<a herf="#" class="btn">Explore</a>
					</p>
				</div>
			</div>
		</div>
	</div>
	<!-- End We Help Section -->

	<!-- Start Popular Product -->
	<div class="popular-product">
		<div class="container">
			<div class="row">
				<div class="col-12 col-md-6 col-lg-4 mb-4 mb-lg-0">
					<div class="product-item-sm d-flex">
						<div class="thumbnail">
							<img src="${pageContext.request.contextPath}/images/product-1.png" alt="Image" class="img-fluid">
						</div>
						<div class="pt-3">
							<h3>Nordic Chair</h3>
							<p>Donec facilisis quam ut purus rutrum lobortis. Donec vitae
								odio</p>
							<p>
								<a href="#">Read More</a>
							</p>
						</div>
					</div>
				</div>

				<div class="col-12 col-md-6 col-lg-4 mb-4 mb-lg-0">
					<div class="product-item-sm d-flex">
						<div class="thumbnail">
							<img src="${pageContext.request.contextPath}/images/product-2.png" alt="Image" class="img-fluid">
						</div>
						<div class="pt-3">
							<h3>Kruzo Aero Chair</h3>
							<p>Donec facilisis quam ut purus rutrum lobortis. Donec vitae
								odio</p>
							<p>
								<a href="#">Read More</a>
							</p>
						</div>
					</div>
				</div>

				<div class="col-12 col-md-6 col-lg-4 mb-4 mb-lg-0">
					<div class="product-item-sm d-flex">
						<div class="thumbnail">
							<img src="${pageContext.request.contextPath}/images/product-3.png" alt="Image" class="img-fluid">
						</div>
						<div class="pt-3">
							<h3>Ergonomic Chair</h3>
							<p>Donec facilisis quam ut purus rutrum lobortis. Donec vitae
								odio</p>
							<p>
								<a href="#">Read More</a>
							</p>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
	<!-- End Popular Product -->

	<!-- Start Testimonial Slider -->
	<div class="testimonial-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-7 mx-auto text-center">
					<h2 class="section-title">Testimonials</h2>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-lg-12">
					<div class="testimonial-slider-wrap text-center">
						<div id="testimonial-nav">
							<span class="prev" data-controls="prev"><span
								class="fa fa-chevron-left"></span></span> <span class="next"
								data-controls="next"><span class="fa fa-chevron-right"></span></span>
						</div>
						<div class="testimonial-slider">
							<div class="item">
								<div class="row justify-content-center">
									<div class="col-lg-8 mx-auto">
										<div class="testimonial-block text-center">
											<blockquote class="mb-5">
												<p>&ldquo;Donec facilisis quam ut purus rutrum lobortis.
													Donec vitae odio quis nisl dapibus malesuada. Nullam ac
													aliquet velit. Aliquam vulputate velit imperdiet dolor
													tempor tristique. Pellentesque habitant morbi tristique
													senectus et netus et malesuada fames ac turpis egestas.
													Integer convallis volutpat dui quis scelerisque.&rdquo;</p>
											</blockquote>
											<div class="author-info">
												<div class="author-pic">
													<img src="${pageContext.request.contextPath}/images/avatar.jpg" alt="Hoàng Tôn"
														class="img-fluid">
												</div>
												<h3 class="font-weight-bold">Hoàng Tôn</h3>
												<span class="position d-block mb-3">CEO, Co-Founder,
													XYZ Inc.</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<!-- END item -->
							<div class="item">
								<div class="row justify-content-center">
									<div class="col-lg-8 mx-auto">
										<div class="testimonial-block text-center">
											<blockquote class="mb-5">
												<p>&ldquo;Donec facilisis quam ut purus rutrum lobortis.
													Donec vitae odio quis nisl dapibus malesuada. Nullam ac
													aliquet velit. Aliquam vulputate velit imperdiet dolor
													tempor tristique. Pellentesque habitant morbi tristique
													senectus et netus et malesuada fames ac turpis egestas.
													Integer convallis volutpat dui quis scelerisque.&rdquo;</p>
											</blockquote>
											<div class="author-info">
												<div class="author-pic">
													<img src="${pageContext.request.contextPath}/images/avatar.jpg" alt="Hoàng Tôn"
														class="img-fluid">
												</div>
												<h3 class="font-weight-bold">Hoàng Tôn</h3>
												<span class="position d-block mb-3">CEO, Co-Founder,
													XYZ Inc.</span>
											</div>
										</div>

									</div>
								</div>
							</div>
							<!-- END item -->
							<div class="item">
								<div class="row justify-content-center">
									<div class="col-lg-8 mx-auto">
										<div class="testimonial-block text-center">
											<blockquote class="mb-5">
												<p>&ldquo;Donec facilisis quam ut purus rutrum lobortis.
													Donec vitae odio quis nisl dapibus malesuada. Nullam ac
													aliquet velit. Aliquam vulputate velit imperdiet dolor
													tempor tristique. Pellentesque habitant morbi tristique
													senectus et netus et malesuada fames ac turpis egestas.
													Integer convallis volutpat dui quis scelerisque.&rdquo;</p>
											</blockquote>

											<div class="author-info">
												<div class="author-pic">
													<img src="${pageContext.request.contextPath}/images/avatar.jpg" alt="Hoàng Tôn"
														class="img-fluid">
												</div>
												<h3 class="font-weight-bold">Hoàng Tôn</h3>
												<span class="position d-block mb-3">CEO, Co-Founder,
													XYZ Inc.</span>
											</div>
										</div>
									</div>
								</div>
							</div>
							<!-- END item -->
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- End Testimonial Slider -->

	<jsp:include page="view/footer.jsp" />

	<script src="${pageContext.request.contextPath}/js/bootstrap.bundle.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/tiny-slider.js"></script>
	<script src="${pageContext.request.contextPath}/js/custom.js"></script>
</body>
</html>