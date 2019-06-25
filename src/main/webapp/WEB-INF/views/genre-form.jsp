<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Genre Form</title>
</head>
<body background="C:\Users\Admin\Desktop\Avengers_Logo_Deco_Light_01.jpg">


	<c:set var="contextPath" value="${pageContext.request.contextPath}" />

	<a href="${contextPath}/account/">Producer HomePage</a><br/>

	<h2>Add a New Genre</h2>


	<form:form action="${contextPath}/genre/add" method="post" commandName="genre">

		<table>
			<tr>
				<td>Genre Title:</td>
				<td><form:input path="title" size="30" required="required" /> <font color="red"><form:errors
							path="title" /></font></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="Create Genre" /></td>
			</tr>
		</table>

	</form:form>

</body>
</html>