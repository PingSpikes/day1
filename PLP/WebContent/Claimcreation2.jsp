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

<form name="myform" id="my" action="claimcreate">
	<table>
		<tr>
			<th colspan="3" style="color:black;"> Claim Creation Form </th>
		</tr>
		<tr>
			<td>Claim Reason:<span style="color:red"><sup>*</sup></span></td>
			<td>
				<input type="text" name="claim reason" size="30" required pattern=".{4,}">
			</td>
			<td>
				
			</td>
		</tr>
		<tr>
		<td>Accident Location:<span style="color:red"><sup>*</sup></span></td>
			<td>
				<input type="text" name="accident location" size="40" required pattern=".{4,}">
			</td>
			<td>
				
			</td>
		</tr>
		<tr>
		<td>Accident City:<span style="color:red"><sup>*</sup></span></td>
			<td>
				<input type="text" name="accident city" size="15" required pattern=".{4,}">
			</td>
			<td>
				
			</td>
		</tr>
		<tr>
		<td>Accident State:<span style="color:red"><sup>*</sup></span></td>
			<td>
				<input type="text" name="accident state" size="15" required pattern=".{4,}">
			</td>
			<td>
				
			</td>
		</tr>
		<tr>
		<td>Accident Zip:<span style="color:red"><sup>*</sup></span></td>
			<td>
				<input type="text" name="accident zip" size="5" required pattern=".{4,}">
			</td>
			<td>
				
			</td>
		</tr>
		</tr>
		<tr>
		    <td>Claim Type:<span style="color:red"><sup>*</sup></td> 
			<td>
			<select name="domain" id="domain" required>
			<option value="domain">-Claim Type-
			<option value="hotel">HOTEL
			<option value="shop">SHOP
			<option value="pghostel">PG
			</select>
			</td> 		
		</tr>
		</table>
<center>
 <input type="submit" class="btn" value="Create Claim" >
 </center>
 All <span style="color:red"><sup>*</sup></span> fields are mandatory
 </form>
 
 </center>
</body>
</html>