<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Header JSP</title>
</head>
<body>
<h1>${param.companyName}</h1>
<h1> <c:out value="${param.companyName}" /> </h1>
</body>
</html>