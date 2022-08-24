<html>
<head>
<title>Show JSP</title>
</head>
<body>
<h1>Java Learning Center</h1>
<table border="5">
<tr>
<td><font size="5">1) String,wrappers and Date.</font></td>
<td><font size="5">${requestScope.EM}<br/>
${sessionScope.PH}<br/>
${applicationScope.DOB}</font></td>
</tr>

<tr>
<td><font size="5">2) Collection of String,wrappers and Date.</font></td>
<td><font size="5">${AL[0]}<br/>
${requestScope.AL[1]}<br/>
${requestScope.AL[2]}<br/>
${requestScope.AL[3]}<br/>
${requestScope.AL[4]}<br/>
${STR[0]}<br/>
${sessionScope.STR[1]}<br/>
${sessionScope.STR[2]}<br/>
${sessionScope.STR[3]}</font></td>
</tr>

<tr>
<td><font size="5">3) Collection of Collection (*JSTL).</font></td>
<td><font size="5">Coming soon</font></td>
</tr>

<tr>
<td><font size="5">4A) Custom or User defined class Object.</font></td>
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
<td><font size="5">4B) Custom or User defined class Object.</font></td>
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
<td><font size="5">5A) Collection of User defined class Object.</font></td>
<td><font size="5">Cid :${CS[0].cid}<br/>
Cname :${sessionScope.CS[0].cname}<br/>
Email :${sessionScope.CS[0].email}<br/>
Phone :${sessionScope.CS[0].phone}<br/>
Accno :${sessionScope.CS[0].account.accno}<br/>
Atype :${sessionScope.CS[0].account.atype}<br/>
Bal :${sessionScope.CS[0].account.bal}<br/>
Street :${sessionScope.CS[0].account.address.street}<br/>
City :${sessionScope.CS[0].account.address.city}</font></td>
</tr>

<tr>
<td><font size="5">5B) Collection of User defined class Object.</font></td>
<td><font size="5">Cid :${CS[1].cid}<br/>
Cname :${sessionScope.CS[1].cname}<br/>
Email :${sessionScope.CS[1].email}<br/>
Phone :${sessionScope.CS[1].phone}<br/>
Accno :${sessionScope.CS[1].account.accno}<br/>
Atype :${sessionScope.CS[1].account.atype}<br/>
Bal :${sessionScope.CS[1].account.bal}<br/>
Street :${sessionScope.CS[1].account.address.street}<br/>
City :${sessionScope.CS[1].account.address.city}</font></td>
</tr>

<tr>
<td><font size="5">6) Map Object.</font></td>
<td><font size="5">Sid :${sessionScope.HM["sid"]}<br/>
Sname :${sessionScope.HM["sname"]}<br/>
Email :${sessionScope.HM["email"]}</font></td>
</tr>

<tr>
<td><font size="5">7) Collection Map Object (*JSTL).</font></td>
<td><font size="5">Coming soon</font></td>
</tr>
</table>
</body>
</html>