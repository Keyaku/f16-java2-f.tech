package com.f16.ftech.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.f16.ftech.business.Clientes;
import com.f16.ftech.dto.ClientesFtech;

import java.text.SimpleDateFormat;
import java.util.Date;
 

@WebServlet("InsertServlet")
public class InsertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
        if (request.getParameter("add") != null || request.getParameter("update") != null) {
    		// reading the user input
            String ID = request.getParameter("ID");
            String CCnumber = request.getParameter("CCnumber");

        	String name = request.getParameter("name");
            String morada = request.getParameter("morada");
            String birthdate = request.getParameter("birthdate");
            String dateInsert = request.getParameter("dateInsert");
            String genero = request.getParameter("genero");

        	//criar objeto
            int clienteID = Integer.parseInt(ID);
            ClientesFtech cliente = new ClientesFtech();
            Date dataInsercao = null;
            Date dataNasc = null;
            try {
    			dataInsercao = new SimpleDateFormat("yyyy-MM-dd").parse(dateInsert);
    			dataNasc = new SimpleDateFormat("yyyy-MM-dd").parse(birthdate);
    		} catch (java.text.ParseException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
            cliente.setDataInsercao(dataInsercao);
            cliente.setDataNascimento(dataNasc);
            cliente.setGenero(genero);
            cliente.setIdCliente(clienteID);
            cliente.setMorada(morada);
            cliente.setNumeroCc(Integer.parseInt(CCnumber));
            cliente.setNome(name);
          
            Clientes clienteNG = new Clientes();
            if (request.getParameter("add") != null) {
    			clienteNG.InsertCliente(cliente);
    		} else {
    			clienteNG.UpdateCliente(clienteID, cliente);
    		}

            request.setAttribute("clienteID", ID);
            request.getRequestDispatcher("/ClienteDetails.jsp").forward(request, response);	
            
    	} else if (request.getParameter("delete") != null) {
    		delete(request, response);
    	}

    }
    
    private void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// reading the user input
        String ID = request.getParameter("ID");
        //String CCnumber = request.getParameter("CCnumber");
        
        request.setAttribute("clienteID", ID);
        request.getRequestDispatcher("/apagaCliente.jsp").forward(request, response);	 
    }
}


