<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Other JSP</title>
</head>
<body>
<div align="center">
<c:import url="header.jsp">
<c:param name="companyName" value="Java Learning Center" />
</c:import>
<h1>This is other.jsp<br/>
Hello ! ${param.stuName},<br/>
You have selected ${param.couName}</h1>
<c:import url="footer.jsp">
<c:param name="companyName" value="Java Learning Center" />
</c:import>
</div>
</body>
</html>