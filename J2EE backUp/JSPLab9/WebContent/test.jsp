<html>
<head>
<title>Test JSP</title>
</head>
<body>
<%
String bn=request.getParameter("branch");
if(bn.equals("MKR")){
	%>
	<jsp:forward page="mkr.jsp">
	<jsp:param value="MKR" name="bn"/>
	<jsp:param value="mkr@jlc.com" name="email"/>
	</jsp:forward>
	<%
}
	else if(bn.equals("BTM")){
		%>
		<jsp:forward page="btm.jsp">
		<jsp:param value="BTM Layout" name="bn"/>
		<jsp:param value="btm@jlc.com" name="email"/>
		</jsp:forward>
		<%
	}
	else if(bn.equals("MHA")){
		%>
		<jsp:forward page="mha.jsp">
		<jsp:param value="MHA" name="bn"/>
		<jsp:param value="mha@jlc.com" name="email"/>
		</jsp:forward>
		<%
	}
%>
</body>
</html>