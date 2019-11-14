package com.f16.ftech.struts.actions;

import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;
import com.f16.ftech.dao.*;
import com.f16.ftech.dto.*;
import com.f16.ftech.factory.*;
import com.f16.ftech.struts.forms.*;

public class ClientesFtechSaveAction extends Action
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
			// cast the form to the appropriate type
			ClientesFtechForm clientesFtechForm = (ClientesFtechForm) form;
		
			// create the DAO class
			ClientesFtechDao dao = ClientesFtechDaoFactory.create();
		
			ClientesFtech dto = new ClientesFtech();
			dto.setIdCliente( Integer.parseInt( clientesFtechForm.getIdCliente() ));
			dto.setNumeroCc( Integer.parseInt( clientesFtechForm.getNumeroCc() ));
			dto.setNome( clientesFtechForm.getNome());
			dto.setMorada( clientesFtechForm.getMorada());
			dto.setDataNascimento( (clientesFtechForm.getDataNascimento() == null || clientesFtechForm.getDataNascimento().trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( clientesFtechForm.getDataNascimento()));
			dto.setDataInsercao( (clientesFtechForm.getDataInsercao() == null || clientesFtechForm.getDataInsercao().trim().length()==0) ? null : DateFormat.getDateTimeInstance().parse( clientesFtechForm.getDataInsercao()));
			dto.setGenero( clientesFtechForm.getGenero());
		
			if (clientesFtechForm.getCrudMethod().equalsIgnoreCase("insert")) {
				dao.insert( dto );
			} else if (clientesFtechForm.getCrudMethod().equalsIgnoreCase("update")) {
				dao.update( dto.createPk(), dto );
			} else if (clientesFtechForm.getCrudMethod().equalsIgnoreCase("delete")) {
				dao.delete( dto.createPk() );
			}
		
			return mapping.findForward( "success" );
		}
		catch (Exception e) {
			ActionErrors _errors = new ActionErrors();
			_errors.add( ActionErrors.GLOBAL_ERROR, new ActionError("internal.error", e.getClass().getName() + ": " + e.getMessage() ) );
			saveErrors( request, _errors );
			return mapping.findForward( "failure" );
		}
		
	}

}
