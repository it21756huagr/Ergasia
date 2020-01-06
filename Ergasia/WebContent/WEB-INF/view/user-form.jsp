<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="ui segment">
	<center>
		<br> <br>
		<h3>Παρακαλώ εισάγεται τα στοιχεία του χρήστη</h3>
		<br>

		<form:form action="saveUser" modelAttribute="user" method="POST"
			class="ui form">
			<div class="field">
				<label>Username&nbsp;</label>
				<form:input path="username" />&nbsp;&nbsp;&nbsp;
			
				<label>Password&nbsp;</label>
				<form:input path="password" />&nbsp;&nbsp;&nbsp;
			
				<label>Enabled&nbsp;</label>
				 <select name=enabled form="user">
					<option value="true">Yes</option>
					<option value="false">No</option>
				</select>&nbsp;&nbsp;&nbsp;
			
			
				<label>Authority&nbsp;</label>
				 <select name="authority" form="user">
					<option value="ROLE_ADMIN">Admin</option>
					<option value="ROLE_USER">Student</option>
					<option value="ROLE_SEC">Secretary</option>

				</select>&nbsp;&nbsp;&nbsp;



			</div>
			<br>
			<center>
				<button class="ui button" type="submit">Save</button>
			</center>
		</form:form>
		<br> <br>
	</center>
</div>
