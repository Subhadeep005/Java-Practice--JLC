<html>
<head>
<title>Show JSP</title>
</head>
<body>
<h1>
1)Storing attribute in Context Scope
<br/>A) Using PageContext object
<%
pageContext.setAttribute("AA", "100", pageContext.APPLICATION_SCOPE);
%>
<br/>B) Using servletContext object
<%
application.setAttribute("A", "10");
%>
<br/>
2)Storing attribute in Session Scope
<br/>A) Using PageContext object
<%
pageContext.setAttribute("BB", "200", pageContext.SESSION_SCOPE);
%>
<br/>B) Using HttpSession object
<%
session.setAttribute("B", "20");
%>
<br/>
3)Storing attribute in Request Scope
<br/>A) Using PageContext object
<%
pageContext.setAttribute("CC", "300", pageContext.REQUEST_SCOPE);
%>
<br/>B) Using HttpRequest object
<%
request.setAttribute("C", "30");
%>
<br/>
4)Storing attribute in Page Scope
<br/>A) Using PageContext object
<%
pageContext.setAttribute("DD", "400", pageContext.PAGE_SCOPE);
pageContext.setAttribute("D", "40");
%>
<hr/>
<%=application.getAttribute("AA") %>
<br/><%=pageContext.getAttribute("A", pageContext.APPLICATION_SCOPE) %><hr/>
<%=session.getAttribute("BB") %>
<br/><%=pageContext.getAttribute("B", pageContext.SESSION_SCOPE) %><hr/>
<%=request.getAttribute("CC") %>
<br/><%=pageContext.getAttribute("C", pageContext.REQUEST_SCOPE) %><hr/>
<%=pageContext.getAttribute("DD") %>
<br/><%=pageContext.getAttribute("D", pageContext.PAGE_SCOPE) %>
</h1>
</body>
</html>