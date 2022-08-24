<html>
<head>
<title>Mathikere Branch</title>
</head>
<body><center>
<jsp:include page="header.jsp">
<jsp:param value="Java Learning Center" name="cname"/>
</jsp:include>
<h3>This Is Mathikere Home Page
<br/>
Which shows ${param.bn} branch details Contact email : ${param.email}
</h3>
<jsp:include page="footer.jsp">
<jsp:param value="Java Learning Center" name="cname"/>
</jsp:include>
</center></body>
</html>