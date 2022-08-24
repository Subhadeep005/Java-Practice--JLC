<html>
<head>
<title>Show JSP</title>
</head>
<body>
<jsp:useBean id="ST" class="com.jlcindia.jsp.Student" scope="request">
<jsp:setProperty name="ST" property="sid" value="${param.sid }"/>
<jsp:setProperty name="ST" property="name" value="${param.name }"/>
<jsp:setProperty name="ST" property="phone" value="${param.phone }"/>

<h1>Sid :<jsp:getProperty name="ST" property="sid"/></h1>
<h1>Name :<jsp:getProperty name="ST" property="name"/></h1>
<h1>Phone :<jsp:getProperty name="ST" property="phone"/></h1>

</jsp:useBean>
</body>
</html>