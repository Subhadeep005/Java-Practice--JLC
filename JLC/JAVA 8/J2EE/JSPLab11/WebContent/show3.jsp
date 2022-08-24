<html>
<head>
<title>Show3 JSP</title>
</head>
<body>
<jsp:useBean id="ST3" class="com.jlcindia.jsp.Student" />
<jsp:setProperty property="sid" name="ST3"/>
<jsp:setProperty property="phone" name="ST3" param="studphone"/>
<hr/><h1>Sid :
<jsp:getProperty property="sid" name="ST3" /><br/>
Phone :
<jsp:getProperty property="phone" name="ST3" /></h1>
</body>
</html>