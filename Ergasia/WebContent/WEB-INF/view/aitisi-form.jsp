<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="ui segment">
<center>
<br>
<br>
	<h3>Αίτηση στέγασης</h3>

	<form:form action="saveAitisi" modelAttribute="aitisi" method="POST" class="ui form">
	<div class="field"> 
			
		
			<select name="student_email" form="aitisi">
  			<option>${aitisi.student_email}</option>
  			</select>
		<br>
		<br>
		
		
		</div>
		<div class="field">
			<label>Εισόδημα_________________________________________</label> 
			<form:input path="eisodima" />
		</div>
		<div class="field">
			<label>Αριθμός αδερφών που σπουδάζουν____________</label>
			<form:input path="aderfia_spoudazoun"/>
		</div>
		<div class="field">
			<label>Αριθμός άνεργων γονέων_______________________</label> 
			<form:input path="anergoi_goneis"/>
		</div>
		
		<div class="field">
			<label>Απόσταση κατοικίας από πανεπιστήμιο (χλμ)__</label> 
			<form:input path="entopiotita"/>
		</div>
		
		<div class="field">
			<label>Έτη εντός εστίας_________________________________</label> 
			<form:input path="eti_entos_estias"/>
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
