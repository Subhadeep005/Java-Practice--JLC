<%@page isErrorPage="true" %>
<html>
<head>
<title>Err JSP</title>
</head>
<body>
<font color="red" size="6">ERROR OCCURED</font>
<h1><%= exception %><br>
<%=exception.getMessage() %>
</h1>
</body>
</html>