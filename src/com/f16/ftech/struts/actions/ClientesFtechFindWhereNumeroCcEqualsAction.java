package com.f16.ftech.struts.actions;

import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.f16.ftech.dao.*;
import com.f16.ftech.dto.*;
import com.f16.ftech.factory.*;

public class ClientesFtechFindWhereNumeroCcEqualsAction extends Action
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
			int _numeroCc = Integer.parseInt( request.getParameter("numeroCc") );
		
			// create the DAO class
			ClientesFtechDao dao = ClientesFtechDaoFactory.create();
		
			// execute the finder
			ClientesFtech dto[] = dao.findWhereNumeroCcEquals(_numeroCc);
		
			// store the results
			request.setAttribute( "result", dto );
		
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
