<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<%@ page language="java" session="true" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Security mvc default (XML)</title>
</head>
<body>
	<div align="center">
		<sec:authorize access="hasRole('ROLE_ADMIN')">
			<h1>hasRole('ROLE_ADMIN')</h1>
		</sec:authorize>
		
		<h1>${title}</h1>
		<h2>${message}</h2>
		<c:if test="${pageContext.request.userPrincipal.name != null}">
			<h2>Welcome : ${pageContext.request.userPrincipal.name} | 
				<a href="<c:url value="/logout" />" > Logout</a></h2>  
	</c:if>				
	</div>
</body>
</html>