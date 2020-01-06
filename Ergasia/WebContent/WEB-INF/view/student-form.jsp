<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="ui segment">
<center>
<br>
<br>
	<h3>Παρακαλώ εισάγεται τα στοιχεία του φοιτητή</h3>
<br>
<br>
	<form:form action="saveStudent" modelAttribute="student" method="POST" class="ui form">
		<div class="field">
			<label>First Name&nbsp;</label> 
			<form:input path="firstName"/>&nbsp;&nbsp;&nbsp;&nbsp;
		
		
			<label>Last Name&nbsp;</label>
			<form:input path="lastName"/>&nbsp;&nbsp;&nbsp;&nbsp;
		
		
			<label>Email&nbsp;</label> 
			<form:input path="email"/>&nbsp;&nbsp;&nbsp;&nbsp;
		 
			<label>Telephone&nbsp;</label> 
			<form:input path="tel"/>&nbsp;&nbsp;&nbsp;&nbsp;
		
		 
			<label>Department&nbsp;</label> 
			<select name="department" form="student">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
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
