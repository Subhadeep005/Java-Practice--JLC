<html>
<head>
<title>Home JSP</title>
</head>
<body><center>
<jsp:include page="header.jsp">
<jsp:param value="Java Learning Center" name="cname"/>
</jsp:include>
<form action="test.jsp"><h1>Select The Branch</h1>
<select name="branch">
<option value="MKR">Mathikere</option>
<option value="BTM">BTM Layout</option>
<option value="MHA">Marathalli</option>
</select><br/>
<input type="submit" value="Submit" />
</form>
<%-- <% request.setAttribute("cname", "Java Learning Center"); %> --%>
<jsp:include page="footer.jsp">
<jsp:param value="Java Learning Center" name="cname"/>
</jsp:include>
</center>
</body>
</html>