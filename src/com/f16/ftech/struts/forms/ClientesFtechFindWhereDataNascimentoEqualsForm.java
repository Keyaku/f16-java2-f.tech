package com.f16.ftech.struts.forms;

import java.math.*;
import java.text.*;
import org.apache.struts.action.*;
import javax.servlet.http.HttpServletRequest;
import com.f16.ftech.dto.*;

public class ClientesFtechFindWhereDataNascimentoEqualsForm extends ActionForm
{
	protected String dataNascimento;

	protected String crudMethod;

	/** 
	 * Sets the value of dataNascimento
	 */
	public void setDataNascimento(String dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}

	/** 
	 * Gets the value of dataNascimento
	 */
	public String getDataNascimento()
	{
		return dataNascimento;
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
