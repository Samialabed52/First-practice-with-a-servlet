<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reversed Characters</title>
</head>
<body>
	<%
		String chars = "";
		Object revString = request.getAttribute("string");
		if(revString != null){
			chars = revString.toString();
		}
	%>
	Your entry reversed: <%=chars%>
</body>
</html>