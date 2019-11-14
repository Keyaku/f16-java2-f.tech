package com.f16.ftech.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.f16.ftech.dto.*;

public class ClientesFtechFindWhereGeneroEqualsForm extends ActionForm
{
	protected String genero;

	protected String crudMethod;

	/** 
	 * Sets the value of genero
	 */
	public void setGenero(String genero)
	{
		this.genero = genero;
	}

	/** 
	 * Gets the value of genero
	 */
	public String getGenero()
	{
		return genero;
	}

	/** 
	 * Sets the value of crudMethod
	 */
	public void setCrudMethod(String crudMethod)
	{
		this.crudMethod = crudMethod;
	}

	/** 
	 * Gets the value of crudMethod
	 */
	public String getCrudMethod()
	{
		return crudMethod;
	}

}
