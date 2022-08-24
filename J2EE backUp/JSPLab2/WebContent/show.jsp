<html>
<head>
<title>Show JSP</title>
</head>
<body>
<%!
String str="JLC";
void m1(){
	System.out.println(str);
}
%>
<h1>THIS IS SHOW JSP</h1>
<%
int a=99;
out.println(a);
m1();
//System.out.println(a);
%>
<%="HELLO" %>
</body>
</html>