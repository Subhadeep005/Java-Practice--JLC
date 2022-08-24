<%@page import="java.util.List"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Test JSP</title>
</head>
<body>
<center><h2><font color="blue">Welcome to Java Learning Center</font></h2></center>
</body>
</html>

<% 
String str="ERROR";
Object obj=request.getAttribute("MSG");
if(obj!=null){
	str=obj.toString();
	out.print("<center><font color=red size=6 >" +str+"</font></center><br/>");
}
%>
<center><font color=red size=6 > <%= str %></font></center>
<%
Object obj1=request.getAttribute("LIST");
if(obj1!=null){
	List<String> list=(List<String>)obj1;
	for(String x:list){
	out.print("<center><font color=green size=6 >" +x+"</font></center>");
}
}
%>