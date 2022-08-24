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
request.setAttribute("STUD", stu);
/* RequestDispatcher rd=request.getRequestDispatcher("test22.jsp");
rd.forward(request, response); */
%>
<jsp:forward page="test22.jsp"></jsp:forward>
</body>
</html>