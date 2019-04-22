package register.DAO;

	import java.sql.*;
	import java.util.*;
	import register.bean.*;
	import register.DAO.DBConnection;
	public class RegisterDAO {

		
		public String registerUser(RegisterBean registerBean)
		 {
		 String FirstName = registerBean.getFirstName();
		 String LastName = registerBean.getLastName();
		 int Age = registerBean.getAge();
		 String Gender = registerBean.getGender();
		 long ContactNumber = registerBean.getContactNumber();
		 String city = registerBean.getCity();
		 String state = registerBean.getState();
		 String EmailAddress = registerBean.getEmailAddress();
		 String UserId = registerBean.getUserId();
		 String Password = registerBean.getPassword();
		 
		 Connection con = null;
		 PreparedStatement preparedStatement = null;
		 
		 try
		 {
		 con = DBConnection.createConnection();
		 String query = "insert into patient_reg(FirstName,LastName,Age,Gender,ContactNumber,EmailAddress,city,state,userId,Password) values (?,?,?,?,?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
		 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
		 preparedStatement.setString(1, FirstName);
		 preparedStatement.setString(2, LastName);
		 preparedStatement.setInt(3, Age);
		 preparedStatement.setString(4, Gender);
		 preparedStatement.setLong(5, ContactNumber);
		 preparedStatement.setString(6, EmailAddress);
		 preparedStatement.setString(7, city);
		 preparedStatement.setString(8, state);
		 preparedStatement.setString(9, UserId);
		 preparedStatement.setString(10, Password);
       
      
		 
		 int i= preparedStatement.executeUpdate();
		 
		 if (i!=0) 
		 return "SUCCESS";
		 }
		 catch(SQLException e)
		 {
			 
			 e.printStackTrace();
		
		 }
		 
		  return "Oops.. Something went wrong there..!"; // On failure, send a message from here.
		 }
		
		
		
		public String Doctor(DoctorBean DoctorBean)
		 {
		 String FirstName = DoctorBean.getFirstName();
		 String LastName = DoctorBean.getLastName();
		 int Age = DoctorBean.getAge();
		 String Gender = DoctorBean.getGender();
		 long ContactNumber = DoctorBean.getContactNumber();
		 String city = DoctorBean.getCity();
		 String state = DoctorBean.getState();
		 String EmailAddress = DoctorBean.getEmailAddress();
		 String UserId = DoctorBean.getUserId();
		 String Password = DoctorBean.getPassword();
		 
		 Connection con = null;
		 PreparedStatement preparedStatement = null;
		 
		 try
		 {
		 con = DBConnection.createConnection();
		 String query = "insert into register(FirstName,LastName,Age,Gender,ContactNumber,EmailAddress,city,state,userId,Password) values (?,?,?,?,?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
		 preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
		 preparedStatement.setString(1, FirstName);
		 preparedStatement.setString(2, LastName);
		 preparedStatement.setInt(3, Age);
		 preparedStatement.setString(4, Gender);
		 preparedStatement.setLong(5, ContactNumber);
		 preparedStatement.setString(6, EmailAddress);
		 preparedStatement.setString(7, city);
		 preparedStatement.setString(8, state);
		 preparedStatement.setString(9, UserId);
		 preparedStatement.setString(10, Password);
      
     
		 
		 int i= preparedStatement.executeUpdate();
		 
		 if (i!=0) 
		 return "SUCCESS";
		 }
		 catch(SQLException e)
		 {
			 
			 e.printStackTrace();
		
		 }
		 
		  return "Oops.. Something went wrong there..!"; // On failure, send a message from here.
		 }
		
		
	}



