<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("UserId");
String driver = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost/";
String database = "patient";
String userid = "root";
String password = "root";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from patient_reg where Userd="+UserId;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<!DOCTYPE html>
<html>
<body>
<h1>Update data from database in jsp</h1>
<form method="post" action="update-process.jsp">
<table align="center">

			<tr>
				<th colspan="2"><h2>Update Registration</h2></th>
			</tr>
			<tr>
			<td><input type="hidden" name="UserId" value="<%=resultSet.getString("UserId") %>">
<input type="text" name="UserId" value="<%=resultSet.getString("UserId") %>">
</tr>

			<tr>
				<td>First Name</td>
				<td><input type="text" name="FirstName" pattern="(?=.*[a-z])(?=.*[A-Z]).{1,20}" value="<%=resultSet.getString("FirstName") %>"></td>
			</tr>

			<tr>
				<td>Last Name</td>
				<td><input type="text" name="LastName" pattern="(?=.*[a-z])(?=.*[A-Z]).{1,20}"value="<%=resultSet.getString("LastName") %>"></td>
			</tr>

			<tr>
				<td>Age</td>
				<td><input type="text" name="Age" pattern="[-+]?[0-9]*[.,]?[0-9]+" minlength="1" maxlength="2" value="<%=resultSet.getInt("Age") %>"></td>
			</tr>

			<tr>
				<td>Gender</td>
				<td><select name="Gender">
						 <option value="select">Select</option>
						<option value="Male">Male</option>
						<option value="Female">Female</option>
				</select></td>
			</tr>

			<tr>
				<td>Contact Number</td>
				<td><input type="number"  name="ContactNumber" pattern="[-+]?[0-9]*[.,]?[0-9]+" minlength="10" maxlength="12" value="<%=resultSet.getLong("ContactNumber") %>"></td>
				
			</tr>

			<tr>
				<td>Email Address</td>
				<td><input type="email" name="EmailAddress" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$"value="<%=resultSet.getString("EmailAddress") %>" ></td>
			</tr>

			<tr>
				<td>City</td>
				<td><input type="text" name="city value="<%=resultSet.getString("city value") %>"></td>
			</tr>

			<tr>
				<td>State</td>
				<td><input type="text" name="state" value="<%=resultSet.getString("state") %>"></td>
			</tr>

			
			<tr>
				<td>Password</td>
				<td><input type="password" name="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{5,}"value="<%=resultSet.getString("Password") %>"></td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Submit"></input></td>
			</tr>
		</table>


</form>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>