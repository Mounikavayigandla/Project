<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<script> 
function validate()
{ 
 var UserId = document.form.UserId.value; 
 var Password = document.form.Password.value;
 
 if (UserId==null || UserId=="")
 { 
 alert("User Id cannot be blank"); 
 return false; 
 }
 else if(Password==null || Password=="")
 { 
 alert("Password cannot be blank"); 
 return false; 
 } 
}
</script> 
</head>
<body>
<div style="text-align:center"><h1>Login application in Java using MVC and MySQL </h1> </div>
<br>
<form name="form" action="LoginController" method="post" onsubmit="return validate()">
<!-- Do not use table to format fields. As a good practice use CSS -->
<table align="center">
 <tr>
 <td>User Id</td>
 <td><input type="text" name="UserId" /></td>
 </tr>
 <tr>
 <td>Password</td>
 <td><input type="password" name="Password" /></td>
 </tr>
 <tr> <!-- refer to the video to understand request.getAttribute() -->
 <td><span style="color:red"><%=(request.getAttribute("errMessage") == null) ? ""
 : request.getAttribute("errMessage")%></span></td>
 </tr>
 <tr>
 <td></td>
 <td><input type="submit" value="Login"></input><input
 type="reset" value="Reset"></input></td>
 </tr>
 <tr>
                                                                             <td><a href="NewUser.html">new user</a></td>
                                                                        </tr>
</table>
</form>
 
</body>
</html>