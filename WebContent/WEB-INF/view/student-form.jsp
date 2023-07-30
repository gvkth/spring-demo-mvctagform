<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Home</h3>
	<form:form action="processForm" modelAttribute="student">
		First name:<form:input path="firstName"/>
		<br><br>
		Last name:<form:input path="lastName"/>
		<br><br>
		
		
		<!-- Kieu 1 -->
<%-- 		<form:select value="Vietnam" path="country"> --%>
<%-- 			<form:option value="Germany" label="Germany"></form:option> --%>
<%-- 			<form:option value="Vietnam" label="Vietnam"></form:option> --%>
<%-- 		</form:select> --%>
		<br>
		
		<!-- Kieu 2 -->
<%-- 		<form:select path="country"> --%>
<%-- 			<form:options items="${student.countryOptions }"/> --%>
<%-- 		</form:select> --%>
		
		<!-- Kieu 3 -->
		<form:select path="country">
			<form:options items="${theCountryOptions }"/>
		</form:select>
		
	<p>
		Favorite Language:
		</p>
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		JS <form:radiobutton path="favoriteLanguage" value="JS"/>
		PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
		<br/>
	<hr>
		Operating Systems:
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>
		MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
		<br><br>
		<input type="submit" value="Submit" />
		<br><br>
	</form:form>
	

	
	
</body>
</html>