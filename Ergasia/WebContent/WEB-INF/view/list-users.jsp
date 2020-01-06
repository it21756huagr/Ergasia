

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>List Users</title>
<!-- reference our style sheet -->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
		<br>
		<br>
			<h2>Λίστα χρηστών</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<!--  add our html table here -->
			<table>
				<tr>
					<th>ID</th>
					<th>User Name</th>
					<th>Password</th>
					<th>Enabled</th>
					<th>Authority</th>
				</tr>
				<!-- loop over and print our Users -->
				<c:forEach var="tempUser" items="${users}">

					<tr>
						<td><p>${tempUser.id}</p></td>
						<td><p>${tempUser.username}</p></td>
						<td><p>${tempUser.password}</p></td>
						<td><p>${tempUser.enabled}</p></td>
						<td><p>${tempUser.authority}</p></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>
