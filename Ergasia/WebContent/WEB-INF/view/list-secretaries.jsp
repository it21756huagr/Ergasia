
	<div id="wrapper">
		<div id="header">
		<br>
		<br>
			<h2>Λίστα Γραμματέων</h2>
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
					<th>Supervisor&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
				</tr>
				<!-- loop over and print our secretaries -->
				<c:forEach var="tempSecretary" items="${secretaries}">

					<tr>
						<td><p>${tempSecretary.id}</p></td>
						<td><p>${tempSecretary.firstName}</p></td>
						<td><p>${tempSecretary.lastName}</p></td>
						<td><p>${tempSecretary.email}</p></td>
						<td><p>${tempSecretary.tel}</p></td>
						<td><p>${tempSecretary.department}</p></td>
						<td><p>${tempSecretary.supervisor}</p></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

