<%@page import="com.jlcindia.jsp.Student"%>
<html>
<head>
<title>Test 2 JSP</title>
</head>
<body>
<%
Object obj=request.getAttribute("STUD");
Student st=null;
if(obj!=null){
	st=(Student)obj;
}
%>
<h1>Sid :<%= st.getSid() %></h1><br/>
<h1>Name :<%= st.getName() %></h1><br/>
<h1>Phone :<%= st.getPhone() %></h1><br/>
</body>
</html>