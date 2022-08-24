<%@ page import="java.io.IOException" %>
<%@page extends="javax.servlet.http.HttpServlet" %>
<html>
<head>
<title>Index JSP</title>
</head>
<body>
<h1>
<%!
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException ,IOException{
	System.out.println("Http Service Method Called");
	_jspService(req,res);
}
%>
THIS IS JSP<br>
</h1>
</body>
</html>