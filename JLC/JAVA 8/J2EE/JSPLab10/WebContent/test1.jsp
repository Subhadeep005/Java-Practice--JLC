<%@page import="com.jlcindia.jsp.Student"%>
<html>
<head>
<title>Test 1 JSP</title>
</head>
<body>
<%
Student stu=new Student();
stu.setSid(99);
stu.setName("Sri");
stu.setPhone(987654321);
session.setAttribute("STUD", stu);
%>
<hr/>
<%
Student std=(Student)session.getAttribute("STUD");
%>
<h1>Sid :<%= std.getSid() %></h1><br/>
<h1>Name :<%= std.getName() %></h1><br/>
<h1>Phone :<%= std.getPhone() %></h1><br/>
</body>
</html>