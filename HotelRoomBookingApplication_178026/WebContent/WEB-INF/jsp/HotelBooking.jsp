<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HotelBooking</title>
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
	<h1 align="center">Book Hotel</h1>
	<form:form action="ConfirmBookHotel.obj"
		modelAttribute="bookingDetails">
		<table border="1" align="center">
			<tr>
				<td>Customer Name</td>
				<td><form:input path="customername" required="true" /></td>
			</tr>
			<!-- Hotel id is read only value to confirm the hotel -->
			<tr>
				<td>Hotel Id</td>
				<td><form:input path="hotelid"
						value="${bookingDetails.hotelid}" readOnly="true" /></td>
			</tr>
			<tr>
				<td>Check In Date</td>
				<td><form:input path="todate" type="date" required="true" /></td>
			</tr>
			<tr>
				<td>Check Out Date</td>
				<td><form:input path="fromdate" type="date" required="true" /></td>
			</tr>
			<tr>
				<td>No of Rooms</td>
				<td><form:input path="noofrooms" required="true" min="1" max="20"/></td>
			</tr>
			<tr>
				<td colspan=2 align="center"><input type="submit"
					value="Book Hotel" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>