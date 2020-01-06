
	<div id="wrapper">
		<div id="header">
		<br>
		<br>
			<h2>Λίστα Φοιτητών</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<!--  add our html table here -->
			<table>
				<tr>
					<th>ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<th>First Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<th>Last Name&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<th>Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<th>Telephone Number&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<th>Department&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					
				</tr>
				<!-- loop over and print our Students -->
				<c:forEach var="tempStudent" items="${students}">

					<tr>
						<td><p>${tempStudent.id}</p></td>
						<td><p>${tempStudent.firstName}</p></td>
						<td><p>${tempStudent.lastName}</p></td>
						<td><p>${tempStudent.email}</p></td>
						<td><p>${tempStudent.tel}</p></td>
						<td><p>${tempStudent.department}</p></td>
						
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

