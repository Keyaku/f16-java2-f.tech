package com.f16.ftech.struts.actions;

import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;
import com.f16.ftech.dao.*;
import com.f16.ftech.dto.*;
import com.f16.ftech.factory.*;
import com.f16.ftech.struts.forms.*;

public class ClientesFtechFindByPrimaryKeyAction extends Action
{
	/**
	 * Method 'execute'
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @throws Exception
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
	{
		try {
			// parse parameters
			int _idCliente = Integer.parseInt( request.getParameter("idCliente") );
		
			// create the DAO class
			ClientesFtechDao dao = ClientesFtechDaoFactory.create();
		
			// execute the finder
			ClientesFtech dto = dao.findByPrimaryKey(_idCliente);
		
			// check that we have found a row
			if (dto == null) {
				throw new RuntimeException( "Finder did not return any data" );
			}
		
			String crudMethod = request.getParameter("crudMethod");
			if (crudMethod == null) {
				crudMethod = "view";
			}
		
			// populate a struts form
			ClientesFtechForm clientesFtechForm = new ClientesFtechForm();
			clientesFtechForm.setCrudMethod( request.getParameter("crudMethod") );
			clientesFtechForm.setIdCliente(String.valueOf( dto.getIdCliente() ));
			clientesFtechForm.setNumeroCc(String.valueOf( dto.getNumeroCc() ));
			clientesFtechForm.setNome(dto.getNome());
			clientesFtechForm.setMorada(dto.getMorada());
			clientesFtechForm.setDataNascimento(dto.getDataNascimento() == null ? null : DateFormat.getDateTimeInstance().format( dto.getDataNascimento()));
			clientesFtechForm.setDataInsercao(dto.getDataInsercao() == null ? null : DateFormat.getDateTimeInstance().format( dto.getDataInsercao()));
			clientesFtechForm.setGenero(dto.getGenero());
			// store the results
			request.getSession().setAttribute( "ClientesFtech", clientesFtechForm );
		
			return mapping.findForward( crudMethod );
		}
		catch (Exception e) {
			ActionErrors _errors = new ActionErrors();
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getClass().getName() + ": " + e.getMessage() ) );
			saveErrors( request, _errors );
			return mapping.findForward( "failure" );
		}
		
	}

}
