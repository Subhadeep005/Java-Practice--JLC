<html>
<head>
<title>Show1 JSP</title>
</head>
<body>
<jsp:useBean id="ST2" class="com.jlcindia.jsp.Student" />
<jsp:setProperty property="*" name="ST2"/>
<hr/><h1>Sid :
<jsp:getProperty property="sid" name="ST2" /><br/>
Name :
<jsp:getProperty property="name" name="ST2" /><br/>
Phone :
<jsp:getProperty property="phone" name="ST2" /></h1>
</body>
</html>