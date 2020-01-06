<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="ui segment">

	<br> <br>
	<center>
		<h3>Ενεργοποίηση Αίτησης Φοιτητή</h3>
	</center>
<br>
	<form:form action="updateStudent" modelAttribute="student1"	method="POST" class="ui form">
		<center>
			<div class="field">
				<font size="4" type"bold" color="blue"> 
				
		<label>Email&nbsp;</label> 
			<form:input path="email"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

	
	<select	name="aitisi_enable" form="student">
										<option value="0">No</option>
										<option value="1">Yes</option>
									</select>&nbsp;&nbsp;&nbsp;

</div>
<br>
</font>
<center>
	<button class="ui button" type="submit">Save</button>
</center>
</form:form>

<br>
<br>

</div>
