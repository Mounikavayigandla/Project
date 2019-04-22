<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="form"  action="CountController" method="post">

<table align="center">

<tr>
<td>RBC Count</td>
<td><input type="number"  name="RBC" pattern="[-+]?[0-9]*[.,]?[0-9]+"></td>
</tr>

<tr>
<td>WBC Count</td>
<td><input type="number"  name="WBC" pattern="[-+]?[0-9]*[.,]?[0-9]+"></td>
</tr>

<tr>
<td>Platelet Count</td>
<td><input type="number"  name="Platelet" pattern="[-+]?[0-9]*[.,]?[0-9]+"></td>
</tr>
<tr>
<td></td>
<td><input type="submit" name="BCount" value="Submit"></td>
</table>
</form>

</body>
</html>