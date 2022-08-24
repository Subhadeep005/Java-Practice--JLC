<%@page import="java.util.ArrayList"%>
<html>
<title>Show Cart</title>
</head>
<body>
<center>
<h1>JLC Bookstore</h1>
<h2>Book Search</h2>
<table align="center"  >
<%
Object obj=request.getAttribute("MSG");
if(obj!=null){
	%>
	<center><h3><font color="red"> <%= obj %></font></h3></center>
	<tr><td colspan="3" align="middle"><a href="index.jsp">Go To Search Page</a></td></tr>
	<%
}else{
int count=1;
obj=request.getAttribute("CART");
if(obj!=null){
	ArrayList<String> blist=(ArrayList<String>)obj;
	for(String bnm:blist){
	%>
	<form action="removefromcart.jlc">
<input type="hidden" name="bname" value="<%= bnm %>"/>
	<tr><td><font size="5"><%= count %>.</font></td><td><font size="5"> <%= bnm %> </font></td>
	<td><input type="submit"  value="Remove From Cart"/></td></tr>
	</form>
	<%
	count++;
}
%>
<tr><td colspan="3" align="middle"><a href="showbooks.jsp">Continue Shopping</a></td></tr>
<tr><td colspan="3" align="middle">
	<form action="placeorder.jsp">
	<input type="submit"  value="Checkout"/>
	</form></td></tr>
</table>
<%
}
}
%>

</center>
</body>
</html>