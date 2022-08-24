<html>
<head>
<title>Index JSP</title>
</head>
<body>
<h1>Java Learning Center</h1>
<table>
<tr>
<td><h1>Total Visited :<%=application.getAttribute("TV") %></h1></td>
</tr>
<tr>
<td><h1>Total Active :<%=application.getAttribute("TA") %></h1></td>
</tr>
</table>
<br/><br/>
<h1>This is INDEX PAGE</h1><br><br>
<a href="logout.jlc">LOGOUT</a>
</body>
</html>