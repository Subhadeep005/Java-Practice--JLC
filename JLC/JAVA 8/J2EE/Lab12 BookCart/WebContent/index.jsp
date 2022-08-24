<!DOCTYPE html>
<html>
<head>
<title>Book Cart Index</title>
</head>
<body><center>
<h1>JLC Bookstore</h1>
<h2>Book Search</h2>

<%
Object obj=request.getAttribute("MSG");
if(obj !=null){
	String msg=obj.toString();
%>
<center><h3><font color="red"> <%= msg %></font></h3></center>
<% }  %>

<form action="searchbooks.jlc" method="post">
<table align="center"><tr><td colspan="2" align="middle"><font size="5"> Select Category </font></td></tr>
<tr><td><font size="5"> 
<select name="category">
<option value="">--Select--</option>
<option value="Java">Java</option>
<option value="Testing">Testing</option>
<option value=".NET">.NET</option>
<option value="SAP">SAP</option>
</select>
</td></font><td> <font size="5"> <input type="submit" value="Search Books"/> </font> </td></tr>
</table>
</form>
</body>
</center>
</html>