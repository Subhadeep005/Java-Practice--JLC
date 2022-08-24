<html>
<head>
<title>Index JSP</title>
</head>
<body>
<div align="center">
<h1>JLC TechSupport</h1>
<h2>Login From</h2>
<font color=red size=5> ${MSG} </font>
<form action="login.jlc" method="post">
<table>
<tr>
<td>Username :</td><td><input type="text" name="username"/></td>
</tr>
<tr>
<td>Password :</td><td><input type="password" name="password"/></td>
</tr>
<tr>
<td colspan="2" align="middle"><input type="submit" value="Login"/></td>
</tr>
</table>
</form>
<a href="register.jsp">New User Signup</a> | 
<a href="forgotpw.jsp">Forgot My Password</a>
</div>
</body>
</html>