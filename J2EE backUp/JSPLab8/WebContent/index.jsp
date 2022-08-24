<%@ page isELIgnored="true" %>
<html>
<head>
<title>Index JSP</title>
</head>
<body>
<h1>THIS IS INDEX PAGE
<%
request.setAttribute("NAME", "Srinivas");
%>
<br/> Name :${NAME }
</h1>
</body>
</html>