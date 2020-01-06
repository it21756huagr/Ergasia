<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="ui segment">

	<br> <br>
	<center>
		<h3>Αλλαγή τηλεφώνου επικοινωνίας</h3>
	</center>
<br>
	<form:form action="updateStudent" modelAttribute="student"
		method="POST" class="ui form">
		<center>
			<div class="field">
				<font size="4" type"bold" color="blue"> 
				<label>ID&nbsp;</label> 
				
				<select	name="id" form="student">
						<option>${student.id}</option>
				</select>&nbsp;&nbsp;&nbsp;
				
	
			<label>First Name&nbsp;</label>
			
			 <select name="firstName" form="student">
				<option>${student.firstName}</option>
			</select>&nbsp;&nbsp;&nbsp;

	
		 <label>Last Name&nbsp;</label>
	
			<select name="lastName" form="student">
				<option>${student.lastName}</option>
			</select>&nbsp;&nbsp;&nbsp;

	
		 <label>Email&nbsp;</label>
	
			<select name="email" form="student">
				<option>${student.email}</option>
			</select>&nbsp;&nbsp;&nbsp;

	 <label>Department&nbsp;</label>
	
		<select name="department" form="student">
			<option>${student.department}</option>
		</select>&nbsp;&nbsp;&nbsp;
	

<center>
	<div class="field">
		<br> <label>Add your new telephone number</label>
		<center>
			<form:input path="tel" />
		</center>
	</div>
</center>
<br>
</font>
<center>
	<button class="ui button" type="submit">Save</button>
</center>
</form:form>

<br>
<br>

</div>
