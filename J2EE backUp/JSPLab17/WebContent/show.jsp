<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<c:url value="test.jsp" /><br/>
<a href="test.jsp"> Click Here</a><br/>
<a href='<c:url value="test.jsp" />'>Click Here</a><br/>
<a href='<%= response.encodeURL("test.jsp") %>'>Click Here</a>
</body>
</html>