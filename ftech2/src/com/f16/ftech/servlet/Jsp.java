package com.f16.ftech.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
 

	public class Jsp extends HttpServlet {
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // reading the user input
	        String ID = request.getParameter("ID");
	        String CC_number = request.getParameter("CC_number");
	        String name = request.getParameter("name");
	        String morada = request.getParameter("morada");
	        String birthdate = request.getParameter("birthdate");
	        String dateInsert = request.getParameter("dateInsert");
	        String genero = request.getParameter("genero");
	        PrintWriter out = response.getWriter();
	        out.println (
	                  "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +" +
	                      "http://www.w3.org/TR/html4/loose.dtd\">\n" +
	                  "<html> \n" +
	                    "<head> \n" +
	                      "<meta http-equiv=\"Content-Type\" content=\"text/html; " +
	                        "charset=ISO-8859-1\"> \n" +
	                      "<title> Java Avancado JSP Servlet Example  </title> \n" +
	                    "</head> \n" +
	                    "<body> <div align='center'> \n" +
	                      "<style= \"font-size=\"12px\" color='black'\"" + "\">" +
	                        "Id: " + ID + " <br> " + 
	                        "CC_number: " + CC_number + " <br> " +
	                        "name: " + name + " <br> " +
	                        "morada: " + morada + " <br> " +
	                        "birthdate: " + birthdate + " <br> " +
	                        "dateInsert: " + dateInsert + " <br> " +
	                        "genero: " + genero + 
	                    "</font></body> \n" +
	                  "</html>" 
	                );      
	        }
	}


