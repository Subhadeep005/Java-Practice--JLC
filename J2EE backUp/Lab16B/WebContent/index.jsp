<html>
<head>
<title>Index JSP</title>
</head>
<body>

<%
String hello="hello.jsp";
String hai="hai.jsp";
HttpSession sess=request.getSession();
hello=response.encodeURL(hello);
hai=response.encodeURL(hai);
out.println(hello);
%>
<br/>
<%
out.println(hai);
%>
<form >
<input type="hidden" name="JSESSIONID" value="<%= session.getId() %>">
<h1><a href="<%= hello %>" />HelloGuys</a></h1>
<h1><a href="<%= hai %>" />HaiGuys</a></h1>
</form>
</body>
</html>