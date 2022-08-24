<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Show JSP</title>
</head>
<body>
<h1 style="color:blue" align="center">Java Learning Center</h1>
<table border="2" align="center" style="color:blue">
<tr>
<td><font size="5"><b>1) String,Wrappers and Date.</b></font></td>
<td><font size="5"><c:out value="${requestScope.EM}" /><br/>
${sessionScope.PH}<br/>
${applicationScope.DOB}</font></td>
</tr>

<tr>
<td><font size="5"><b>2) Collection of String,Wrappers and Date.</b></font></td>
<td>
<c:forEach var="x" items="${requestScope.AL }">
<font size="5"> ${x} , </font>
</c:forEach>
<c:forEach var="x" items="${sessionScope.STR }">
<font size="5"> ${x} ,</font>
</c:forEach>
</td>
</tr>

<tr>
<td><font size="5"><b>3) Collection of Collection (*JSTL).</b></font></td>
<td><font size="5">
<c:forEach var="list" items="${requestScope.AL1}">
<c:forEach var="x" items="${list}">
<font size="5"> ${x} , </font>
</c:forEach>
</c:forEach>
</font></td>
</tr>

<tr>
<td><font size="5"><b>4A) Custom or User defined class Object.</b></font></td>
<td><font size="5">Cid :${CUST.cid}<br/>
Cname :${sessionScope.CUST.cname }<br/>
Email :${sessionScope.CUST.email }<br/>
Phone :${sessionScope.CUST.phone }<br/>
Accno :${sessionScope.CUST.account.accno }<br/>
Atype :${sessionScope.CUST.account.atype }<br/>
Bal :${sessionScope.CUST.account.bal}<br/>
Street :${sessionScope.CUST.account.address.street}<br/>
City :Street :${sessionScope.CUST.account.address.city}</font></td>
</tr>

<tr>
<td><font size="5"><b>4B) Custom or User defined class Object.</b></font></td>
<td><font size="5">Cid :${CUST1.cid}<br/>
Cname :${sessionScope.CUST1.cname }<br/>
Email :${sessionScope.CUST1.email }<br/>
Phone :${sessionScope.CUST1.phone }<br/>
Accno :${sessionScope.CUST1.account.accno }<br/>
Atype :${sessionScope.CUST1.account.atype }<br/>
Bal :${sessionScope.CUST1.account.bal}<br/>
Street :${sessionScope.CUST1.account.address.street}<br/>
City :Street :${sessionScope.CUST1.account.address.city}</font></td>
</tr>

<tr>
<td><font size="5"><b>5) Collection of User defined class Object.</b></font></td>
<td>
<c:forEach var="cust" items="${sessionScope.CS}">
<font size="5">Cid :${cust.cid}<br/>
Cname :${cust.cname}<br/>
Email :${cust.email}<br/>
Phone :${cust.phone}<br/>
Accno :${cust.account.accno}<br/>
Atype :${cust.account.atype}<br/>
Bal :${cust.account.bal}<br/>
Street :${cust.account.address.street}<br/>
City :${cust.account.address.city}
</font><hr/></c:forEach></td></tr>

<tr>
<td><font size="5"><b>6) Map Object.</b></font></td>
<td>
<table border="5" align="center" style="color:blue; border-bottom: thin; border-left: thin; border-right: thin; border-top: thin;">
<tr><td width="100">
<font size="5"  color="red">Map Key
</font></td>
<td><font size="5"  color="red">Map Value
</font>
</td></tr>
<c:forEach var="entry" items="${sessionScope.HM}">
<tr><td width="100">
<font size="5">${entry.key} <br/>
</font></td>
<td><font size="5">${entry.value} <br/>
</font>
</td></tr>
</c:forEach>
</table>
</td>
</tr>

<tr>
<td><font size="5"><b>7) Collection Map Object (*JSTL).</b></font></td>
<td>
<c:forEach var="hm" items="${requestScope.AL2}">
<table border="1" align="center" style="color:blue; border-bottom: thin; border-left: thin; border-right: thin; border-top: thin;">
<tr><td width="100">
<font size="5"  color="red">Map Key
</font></td>
<td><font size="5" color="red">Map Value
</font>
</td></tr>
<c:forEach var="entry" items="${hm}">
<tr><td width="100">
<font size="5">${entry.key} <br/>
</font></td>
<td><font size="5">${entry.value} <br/>
</font>
</td></tr>
</c:forEach>
</table>
<br/>
</c:forEach>
</td>
</tr>
</table>
</body>
</html>