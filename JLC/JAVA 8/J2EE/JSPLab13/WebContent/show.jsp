<html>
<head>
<title>Show JSP</title>
</head>
<body>
<%
pageContext.setAttribute("MSG", "Page Scope Message");
pageContext.setAttribute("MSG", "Request Message", pageContext.REQUEST_SCOPE);
pageContext.setAttribute("MSG", "Session Message", pageContext.SESSION_SCOPE);
pageContext.setAttribute("MSG", "Context Message", pageContext.APPLICATION_SCOPE);
pageContext.setAttribute("ERROR", "ERROR MESSAGE", pageContext.APPLICATION_SCOPE);
%>
<h1>USING WEB CONTAINER OBJECT<BR/>
<%
String msg1=request.getAttribute("MSG").toString();
String msg2=session.getAttribute("MSG").toString();
String msg3=application.getAttribute("MSG").toString();
%>
<%=msg1  %><br/>
<%=msg2  %><br/>
<%=msg3  %><br/>
<hr/>
<h1>USING PAGE CONTEXT OBJECT<BR/>
<%
String data1=pageContext.getAttribute("MSG").toString();
String data2=pageContext.getAttribute("MSG", pageContext.PAGE_SCOPE).toString();
String data3=pageContext.getAttribute("MSG", pageContext.REQUEST_SCOPE).toString();
String data4=pageContext.getAttribute("MSG", pageContext.SESSION_SCOPE).toString();
String data5=pageContext.getAttribute("MSG", pageContext.APPLICATION_SCOPE).toString();
%>
<%=data1  %><br/>
<%=data2  %><br/>
<%=data3  %><br/>
<%=data4  %><br/>
<%=data5  %><br/>
<hr/>
<%
Object obj1=pageContext.findAttribute("MSG");
Object obj2=pageContext.findAttribute("ERROR");
%>
<%= obj1 %><br/>
<%= obj2 %>
</h1>
</body>
</html>