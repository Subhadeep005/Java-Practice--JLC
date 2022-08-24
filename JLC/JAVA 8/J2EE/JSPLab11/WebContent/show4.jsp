<html>
<head>
<title>Show4 JSP</title>
</head>
<body>
<jsp:useBean id="ST4" class="com.jlcindia.jsp.Student" />
<jsp:setProperty property="sid" name="ST4"/>
<jsp:setProperty property="name" name="ST4"/>
<jsp:setProperty property="phone" name="ST4"/>
<jsp:setProperty property="phone" name="ST4" param="studphone"/>
<hr/><h1>Sid :
<jsp:getProperty property="sid" name="ST4" /><br/>
Name :
<jsp:getProperty property="name" name="ST4" /><br/>
Phone :
<jsp:getProperty property="phone" name="ST4" /><br/>
Student Phone :
<jsp:getProperty property="phone" name="ST4" /></h1>
</body>
</html>