<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost/patient";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
String UserId = request.getParameter("UserId");
String FirstName = request.getParameter("FirstName");
String LastName =request.getParameter("LastName");
int Age = Integer.parseInt(request.getParameter("Age"));
String Gender = request.getParameter("Gender");
long ContactNumber = Long.parseLong(request.getParameter("ContactNumber"));
String Password = request.getParameter("Password");
String city = request.getParameter("city");
String state = request.getParameter("state");
String EmailAddress = request.getParameter("EmailAddress");




Connection con = null;

if(UserId != null)
{
Connection con1 = null;
PreparedStatement ps = null;

try
{
Class.forName(driverName);
con1 = DriverManager.getConnection(url,user,psw);
String sql="Update patient_reg set UserId=?,FirstName=?,LastName=?,Age=?,Gender=?ContactNumber=?,EmailAddress=?,city=?,state=?,Password=?, where UserId="+UserId;
ps = con1.prepareStatement(sql);
 //Making use of prepared statements here to insert bunch of data
 ps.setString(1, UserId);
ps.setString(2, FirstName);
ps.setString(3, LastName);
ps.setInt(4, Age);
ps.setString(5, Gender);
ps.setLong(6, ContactNumber);
ps.setString(7, EmailAddress);
ps.setString(8, city);
ps.setString(9, state);
ps.setString(10, Password);

int i = ps.executeUpdate();
if(i > 0)
{
out.print("Record Updated Successfully");
}
else
{
out.print("There is a problem in updating Record.");
} 
}
catch(SQLException sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}
%>