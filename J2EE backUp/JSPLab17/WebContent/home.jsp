<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Home JSP</title>
</head>
<body>
<h1>Hello guys No Gaurantee</h1>
<c:set var="CN" value="${param.courseName}" scope="session" />
<c:choose>
<c:when test="${CN eq 'java'}">
<c:redirect url="java.jsp">
<c:param name="stuName" value="${param.studentName }" />
<c:param name="couName" value="${param.courseName }" />
</c:redirect>
</c:when>

<c:when test="${CN eq 'jdbc'}">
<c:redirect url="jdbc.jsp">
<c:param name="stuName" value="${param.studentName }" />
<c:param name="couName" value="${param.courseName }" />
</c:redirect>
</c:when>
<c:otherwise>
<c:redirect url="other.jsp">
<c:param name="stuName" value="${param.studentName }" />
<c:param name="couName" value="${param.courseName }" />
</c:redirect>
</c:otherwise>
</c:choose>
</body>
</html>