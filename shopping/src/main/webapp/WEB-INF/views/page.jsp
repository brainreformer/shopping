<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<%-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>shopping</title>
</head>
<body>
${contextRoot} says - ${greeting}
</body>
</html> --%>


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Shopping - ${title}</title>

<script>
	window.menu = '${title}';
</script>

<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Theme -->
<link href="${css}/bootstrap-readable-theam.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="${ css }/myapp.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

<script type="text/javascript"
	src="https://gc.kis.v2.scr.kaspersky-labs.com/7C486547-9CB0-D848-8819-C97462171922/main.js"
	charset="UTF-8"></script>
</head>

<body>
	<div class="wrapper">
		<%@include file="./shared/navbar.jsp"%>

		<div class="content">
			<c:if test="${ userClickHome == true }">
				<%@include file="./home.jsp"%>
			</c:if>

			<c:if test="${ userClickAbout == true }">
				<%@include file="./about.jsp"%>
			</c:if>

			<c:if test="${ userClickContact == true }">
				<%@include file="./contact.jsp"%>
			</c:if>
			<c:if test="${ userClickAllProducts == true or userClickCategoryProducts == true }">
				<%@include file="./listProducts.jsp"%>
			</c:if>
		</div>

		<%@include file="./shared/footer.jsp"%>
		<!-- jQuery -->
		<script src="${js}/jquery.js"></script>

		<!-- Bootstrap Core JavaScript -->
		<script src="${js}/bootstrap.min.js"></script>

		<!-- Self scripted -->
		<script src="${js}/myapp.js"></script>

	</div>
</body>

</html>
