package com.f16.ftech.struts.actions;

import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.f16.ftech.struts.forms.*;

public class ClientesFtechDeleteAction extends Action
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
		// cast the form to the appropriate type
		ClientesFtechForm clientesFtechForm = (ClientesFtechForm) form;
		
		clientesFtechForm.reset();
		clientesFtechForm.setCrudMethod( "delete" );
		return mapping.findForward( "success" );
	}

}
