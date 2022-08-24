<%@page import="java.util.*"%>

<html>
<head>
<title>Show Books</title>
</head>
<body><center>
<h1>JLC Bookstore</h1>
<h2>Book Search</h2>
<table align="center"  >
<form action="showcart.jlc" method="post">
<input type="submit"  value="SHOW CART"/>
</form>
<tr><font size="5"><td width="50"><font size="4">Sl No.</font></td><td><font size="4">Book Name</font></td><td><font size="4">Add to Cart</font></td></tr>
<%
int count=1;
Object obj =session.getAttribute("BOOKS");
ArrayList<String> blist=(ArrayList<String>)obj;
for(String bnm:blist){
%>
<form action="addtocart.jlc">
<input type="hidden" name="bname" value="<%= bnm %>"/>
<tr><td><font size="5"><%= count %>.</font></td><td><font size="5"> <%= bnm %> </font></td>
<td><input type="submit"  value="ADD TO CART"/></td></tr>
</form>
<% 
count++;
}
%>
</table>
</center>
</body>
</html>