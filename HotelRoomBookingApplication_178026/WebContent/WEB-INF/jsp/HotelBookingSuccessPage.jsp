<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HotelBookingSuccessPage</title>
</head>
<body bgcolor="solid black">
	<h1 align="center">Your Rooms are booked at ${hotelName}</h1>
	<h1 align="center">Your Customer Id is ${customerId}</h1>

	<!-- Redirects the page back to home -->
	<form action="HotelDetailsPage.obj">
		<h4 align="center">
			<input type="submit" value="Home">
		</h4>
	</form>
</body>
</html>