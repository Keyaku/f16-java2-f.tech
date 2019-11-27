package com.f16.ftech.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.f16.ftech.business.Clientes;
import com.f16.ftech.dto.ClientesFtech;



import java.text.SimpleDateFormat;
import java.util.Date;
 

	public class InsertServlet extends HttpServlet {
	    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        // reading the user input
	        String ID = request.getParameter("ID");
	        String CC_number = request.getParameter("CC_number");
	        String name = request.getParameter("name");
	        String morada = request.getParameter("morada");
	        String birthdate = request.getParameter("birthdate");
	        String dateInsert = request.getParameter("dateInsert");
	        String genero = request.getParameter("genero");
	        
	        
	        //criar objeto
	        ClientesFtech cliente = new ClientesFtech();
	        Date dataInsercao = null;
	        Date dataNasc = null;
	        try {
				dataInsercao=new SimpleDateFormat("yyyy-MM-dd").parse(dateInsert);
				dataNasc = new SimpleDateFormat("yyyy-MM-dd").parse(birthdate);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        cliente.setDataInsercao(dataInsercao);
	        cliente.setDataNascimento(dataNasc);
	        cliente.setGenero(genero);
	        cliente.setIdCliente(Integer.parseInt(ID));
	        cliente.setMorada(morada);
	        cliente.setNumeroCc(Integer.parseInt(CC_number));
	        cliente.setNome(name);
	        response.getWriter();
	        Clientes novoCliente = new Clientes();
	        novoCliente.InsertCliente(cliente);
	        }
	}


