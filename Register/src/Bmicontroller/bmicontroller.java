package Bmicontroller;

/*import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import bmi.DAO.bmiDAO;
import bmiBean.bmi;

public class bmicontroller {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //Copying all the input parameters in to local variables
	Integer Height = Integer.parseInt(request.getParameter("Height"));
		 Double Weight = Double.parseDouble(request.getParameter("Weight"));
		 
		 bmi bmiBean = new bmi();
		 //Using Java Beans - An easiest way to play with group of related data
		 bmiBean.setHeight(Height);
		bmiBean.setWeight(Weight);
		
		 
		 bmiDAO bmiDao = new bmiDAO();
		 
		 //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
		 String userRegistered = bmiDao.registerUser(bmiBean);
		 
		 if(userRegistered.equals("SUCCESS")) //On success, you can display a message to user on Home page
		 {
		 request.getRequestDispatcher("/home.jsp").forward(request, response);
		 }
		 else //On Failure, display a meaningful message to the User.
		 {
		 request.setAttribute("errMessage", userRegistered);
		 request.getRequestDispatcher("/bmi.jsp").forward(request, response);
		 }
		 }
}*/
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bmiBean.bmi;
import register.DAO.RegisterDAO;
import register.bean.RegisterBean;
import bmi.DAO.bmiDAO;
public class bmicontroller extends HttpServlet {

	 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 //Copying all the input parameters in to local variables
		 bmi registerBean = new bmi();
	 Integer Height =Integer.parseInt((String)request.getParameter("Height"));
	 Double Weight =Double.parseDouble((String)request.getParameter("Weight"));
	 List<RegisterBean> list=new ArrayList<RegisterBean>();
	 //String FirstName=l.getFirstName();
	 RegisterDAO reg=new RegisterDAO();
		/* list=reg.getUser();
		 HttpSession session=request.getSession(false);
		 for(RegisterBean R:list)
		 {
			if(R.getUserId().equals(session.getAttribute("key1").toString()) && R.getPassword().equals(session.getAttribute("key2").toString()))
			{
				registerBean.setPatient_Id(R.getPatient_id());
				registerBean.setFirstName(R.getFirstName());
			}
		 }*/
	 
	 String p=(String) request.getSession(false).getAttribute("UserId");
	
	 //Using Java Beans - An easiest way to play with group of related data
	 registerBean.setHeight(Height);
	 registerBean.setWeight(Weight);
	 registerBean.setUserId(p);;
	 
	 bmiDAO registerDao = new bmiDAO();
	 
	 //The core Logic of the Registration application is present here. We are going to insert user data in to the database.
	 String userRegistered = registerDao.registerUser(registerBean);
	 
	 if(userRegistered.equals("SUCCESS")) //On success, you can display a message to user on Home page
	 {
	 request.getRequestDispatcher("/New.html").forward(request, response);
	 }
	 else //On Failure, display a meaningful message to the User.
	 {
	 request.setAttribute("errMessage", userRegistered);
	 request.getRequestDispatcher("/home.jsp").forward(request, response);
	 }
	 }
}


