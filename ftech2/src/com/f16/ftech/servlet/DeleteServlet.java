package com.f16.ftech.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("DeleteServlet")
	public class DeleteServlet extends HttpServlet {
	    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    	String ID = request.getParameter("ID");
	    	
	    	request.setAttribute("clienteID", ID);
	        request.getRequestDispatcher("/apagaCliente.jsp").forward(request, response);	        
	    }
	}
