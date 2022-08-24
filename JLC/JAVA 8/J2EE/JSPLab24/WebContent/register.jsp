<html>
<head>
<title>Register JSP</title>
</head>
<body>
<div align="center">
<h1>JLC TechSupport</h1>
<h2>Registration From</h2>
<font color=red size=5> ${MSG} </font>
<form action="reg.jlc" method="post">
<table>
<tr>
<td>Full Name :</td><td><input type="text" name="fname"/></td>
</tr>
<tr>
<td>Email :</td><td><input type="text" name="email"/></td>
</tr>
<tr>
<td>Phone :</td><td><input type="text" name="phone"/></td>
</tr>
<tr>
<td>Username :</td><td><input type="text" name="username"/></td>
</tr>
<tr>
<td>Password :</td><td><input type="password" name="password"/></td>
</tr>
<tr>
<td colspan="2" align="middle"><input type="submit" value="Register"/></td>
</tr>
</table>
</form>
</div>
</body>
</html>