<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Test JSP</title>
</head>
<body>
<div align="center">
<c:import url="header.jsp">
<c:param name="companyName" value="Java Learning Center" />
</c:import>
<form action="home.jsp" method="post">
<h2>Enter Course Name</h2>
<input type="text" name="courseName" />
<h2>Enter Student Name</h2>
<input type="text" name="studentName" />
<br/><br/>
<input type="submit" name="Submit" />
</form>
<c:import url="footer.jsp">
<c:param name="companyName" value="Java Learning Center" />
</c:import>
</div>
</body>
</html>