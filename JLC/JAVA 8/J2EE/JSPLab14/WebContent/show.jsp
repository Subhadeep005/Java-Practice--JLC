<html>
<head>
<title>Show JSP</title>
</head>
<body>
<h1>Java Learning Center
<table border="5">
<tr>
<td>Student Name :</td><td>${param.sname}</td>
</tr>
<tr>
<td>Primary Email :</td><td>${param.email}</td>
</tr>
<tr>
<td>Primary Email :</td><td>${paramValues.email[0]}</td>
</tr>
<tr>
<td>Secondary Email :</td><td>${paramValues.email[1]}</td>
</tr>
<tr>
<td>Host :</td><td>${header.host}</td>
</tr>
<tr>
<td>Referer :</td><td>${header.referer}</td>
</tr>
<tr>
<td>JSessionID Cookie :</td><td>${cookie.JSESSIONID.value}</td>
</tr>
<tr>
<td>Email Cookie :</td><td>${cookie.email.value}</td>
</tr>
<tr>
<td>Phone Cookie :</td><td>${cookie.phone.value}</td>
</tr>
<tr>
<td>CP : State </td><td>${initParam.state}</td>
</tr>
<tr>
<td>CP : City </td><td>${initParam.city}</td>
</tr>
<tr>
<td>Using Page Context :</td>
<td height="50">${pageContext.session.id}<br/>
${pageContext.request.remoteAddr}<br/>
${pageContext.request.method}<br/>
${pageContext.request.requestURI}<br/>
${pageContext.response.contentType}
</td></tr>
</table>
</h1>
</body>
</html>