<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
 
<div style=" border-radius: 15px;      padding: 20px;    width: 400px;     box-shadow:5px 5px 5px 5px black;">
<div >
<h1 align="center"style="color:black"> Insurance Claim Registration System </h1>
<hr>
 
<form name="myform" id="my" action="login">
	<table>
		<tr>
			<th colspan="3" style="color:black;">Login Form </th>
		</tr>
		<tr>
			<td>UserName:<span style="color:red"><sup>*</sup></span></td>
			<td>
				<input type="text" name="userName" size="20" required pattern=".{3,}">
			</td>
			<td>
				
			</td>
		</tr>
		<tr>
			<td>Password:<span style="color:red"><sup>*</sup></span></td>
			<td>
				<input type="password" name="userPwd" size="12" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}">
			</td>
 
		</tr>
	</table>
 <center>
 <input type="submit" class="btn" value="Login" >
 </center>
 All <span style="color:red"><sup>*</sup></span> fields are mandatory
 

</form>
 
 </center>
</body>
</html>