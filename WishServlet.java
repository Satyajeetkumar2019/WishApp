package com.bce.Servlet;
import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;
@WebServlet("/WishServlet")
public class WishServlet extends HttpServlet {
	public void service(HttpServletRequest req,
			HttpServletResponse res) throws ServletException, IOException {
		//intilize the value
		PrintWriter pw=null;
		Calendar clendar=null;
		 int hour=0;
		 //General seting 
		 pw=res.getWriter();
		 //set contentType 
		 res.setContentType("text/html");
		 //Gate date 
		 Date d=new Date();
		 clendar=Calendar.getInstance();
		 hour=clendar.get(Calendar.HOUR_OF_DAY);
		 //Genarate the wishMessage
		 if(hour<=12)
			 pw.println("<h1 style ='color:red'><center>Good Morning</center> </h1>");
		 else if(hour<=17)
			 pw.println("<h1 style ='color:red'><center>GOOD afterNoon</center> </h1>");	 
		 else if (hour<=20)
			 pw.println("<h1 style ='color:red'><center>Good Evening </center> </h1>");
		 else 
			 pw.println("<h1 style ='color:red'><center>Good Night</center> </h1>");
		
		//generate hyperlink 
		 pw.println("<br><a href='http://localhost:3030/WishApp/page.html'>Home</a></br>");
		//close strime
		 pw.close();
	}//end service(--)
}//end of the class
