package Login.DAO;
import java.sql.*;



import Login.Bean.Login;

import register.DAO.*;


public class LoginDAO {
	public String authenticateUser(Login loginBean)
	 {
	 
	String userName = loginBean.getUserId(); //Keeping user entered values in temporary variables.
	 String password = loginBean.getPassword();
	 
	Connection con = null;
	 Statement statement = null;
	 ResultSet resultSet = null;
	 
	String userNameDB = "";
	 String passwordDB = "";
	 String userNameDB1 = "";
	 String passwordDB1 = "";
	 
	try
	 {
	 con = DBConnection.createConnection(); //establishing connection
	 statement = con.createStatement(); //Statement is used to write queries. Read more about it.
	 resultSet = statement.executeQuery("select userId,Password from patient_reg"); //Here table name is users and userName,password are columns. fetching all the records and storing in a resultSet.
	 resultSet = statement.executeQuery("select userId,Password from register");
	while(resultSet.next()) // Until next row is present otherwise it return false
	 {
	  userNameDB = resultSet.getString("UserId"); //fetch the values present in database
	  passwordDB = resultSet.getString("Password");
	  userNameDB1 = resultSet.getString("UserId"); //fetch the values present in database
	  passwordDB1 = resultSet.getString("Password");
	 
	   if(userName.equals(userNameDB) && password.equals(passwordDB))
	   {
	      return "SUCCESS"; ////If the user entered values are already present in database, which means user has already registered so I will return SUCCESS message.
	   }
	   else if(userName.equals(userNameDB1) && password.equals(passwordDB1))
	   {
		   return "SUCCESS1";
	   }
	 }
	 }
	 catch(SQLException e)
	 {
	 e.printStackTrace();
	 }
	 return "Invalid user credentials"; // Just returning appropriate message otherwise
	 
	 }
}

	                

