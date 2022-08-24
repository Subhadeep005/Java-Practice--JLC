<%@ page import="java.util.*" session="true"%>
<%@ page language="java" %>
<html>
<head>
<title>Index JSP</title>
</head>
<body>
<h1>THIS IS JSP<br>
<%=session %>
<br>
<%=session.getId() %>
</h1>
</body>
</html>