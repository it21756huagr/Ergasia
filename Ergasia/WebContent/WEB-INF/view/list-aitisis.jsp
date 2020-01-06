
	<div id="wrapper">
		<div id="header">
		<br>
		<br>
			<h2>Λίστα Αιτήσεων</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<!--  add our html table here -->
			<table>
				<tr>
					<th>ID&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<th>Email Φοιτητή&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<th>Εισόδημα&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<th>Αδέρφια που σπουδάζουν&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<th>Εντοπιότητα&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<th>Άνεργοι γονείς&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<th>Έτη εντός εστίας&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<th><a href="<c:url value="/aitisi/listdesc"></c:url>" class="btn btn-link">Μόρια Ταξινόμηση</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
					<th>Κατάσταση</th>
					
				
				<!-- loop over and print our Students -->
				<c:forEach var="tempAitisi" items="${aitisis}">

					<tr>
						<td>${tempAitisi.id}</td>
						<td>${tempAitisi.student_email}</td>
						<td>${tempAitisi.eisodima}</td>
						<td>${tempAitisi.aderfia_spoudazoun}</td>
						<td>${tempAitisi.entopiotita}</td>
						<td>${tempAitisi.anergoi_goneis}</td>
						<td>${tempAitisi.eti_entos_estias}</td>
						<td>${tempAitisi.moria}</td>
						<td>${tempAitisi.katastasi}</td>
						
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>

</body>
</html>
