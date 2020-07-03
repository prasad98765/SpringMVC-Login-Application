<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>

<title>Welcome Login Form</title>
<body>

	<form:form action="processForm" modelAttribute="student">
	
	First Name: <form:input path="firstName" />

		<br>
		<br>
	
	Last Name: <form:input path="lastName" />

		<br>
		<br>

	Country: <form:select path="country">

			<form:options items="${theCountryOptions}" />


		</form:select>

		<br><br>
		
		Favorite Language :
		
		<form:radiobuttons path="favoriteLanguage" items = "${theLanguageOptions}"/>

		<br><br>
		
		Operating System: 
		
		<form:checkboxes items="${theOperatingSystem }" path="operatingSystem"/>
		
		<br><br>

		<input type="submit" value="Submit">




	</form:form>





</body>

</html>