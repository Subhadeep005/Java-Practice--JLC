<%@page import="com.jlcindia.jsp.Student"%>
<html>
<head>
<title>Test 2 JSP</title>
</head>
<body>
<h1>Using useBean and other tags
<hr/>
<jsp:useBean id="ST" class="com.jlcindia.jsp.Student" scope="session"></jsp:useBean>
<jsp:setProperty property="sid" name="ST" value="88"/>
<jsp:setProperty property="name" name="ST" value="Nivas"/>
<jsp:setProperty property="phone" name="ST" value="88888"/>
Sid :<jsp:getProperty property="sid" name="ST"/><br/>
Name :<jsp:getProperty property="name" name="ST"/><br/>
Phone :<jsp:getProperty property="phone" name="ST"/><br/>
</h1>
</body>
</html>