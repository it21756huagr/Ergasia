<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="ui segment">
<center>
<br>
<br>
	<h3>Παρακαλώ εισάγεται τα στοιχεία του υπαλλήλου</h3>
	<br>
	
	<form:form action="saveSecretary" modelAttribute="secretary" method="POST" class="ui form">
		<div class="field">
			<label>First Name&nbsp;</label> 
			<form:input path="firstName"/>&nbsp;&nbsp;&nbsp;
		
			<label>Last Name&nbsp;</label>
			<form:input path="lastName"/>&nbsp;&nbsp;&nbsp;
		
			<label>Email&nbsp;</label> 
			<form:input path="email"/>&nbsp;&nbsp;&nbsp;
		
			<label>Telephone&nbsp;</label> 
			<form:input path="tel"/>&nbsp;&nbsp;&nbsp;
		</div>
		<br>
		
		<div class="field">
		
			<label>Department&nbsp;</label> 
			<select name="department" form="secretary">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
				</select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
		
		 
			<label>Supervisor&nbsp;</label> 
			<select name="supervisor" form="secretary">
					<option value="false">No</option>
					<option value="true">Yes</option>
					
					

				</select>
		</div>
		<br>
		<center>
		<button class="ui button" type="submit">Save</button>
		</center>
	</form:form>
	<br>
	<br>
</center>
</div>
