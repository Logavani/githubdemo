<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HotelDetails</title>
<style>
th, td {
	padding: 10px;
}

table {
	border-collapse: collapse;
	border: 2px solid black;
	padding: 10px;
}
</style>
</head>
<body bgcolor="solid black">
	<h1 align="center">Hotel Room Booking</h1>
	<table border="1" align="center">
		<tr>
			<th>Hotel Id</th>
			<th>Name</th>
			<th>Rating</th>
			<th>Rate</th>
			<th>Available Rooms</th>
		</tr>
		
		<!-- Displays the hotel details in the tabular format -->
		<c:forEach var="tempuser" items="${hotelDetails}">
			<tr>
				<td>${tempuser.id}</td>
				
				<!-- Return the hotel id to book hotel at specified Hotel -->
				<td><a href="BookHotel.obj?id=${tempuser.id}">${tempuser.name}</a></td>
				<td>${tempuser.rating}</td>
				<td>${tempuser.rate}</td>
				<td>${tempuser.availablerooms}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>