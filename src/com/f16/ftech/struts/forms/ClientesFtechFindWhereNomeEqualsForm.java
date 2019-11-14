package com.f16.ftech.struts.forms;

import org.apache.struts.action.*;

public class ClientesFtechFindWhereNomeEqualsForm extends ActionForm
{
	protected String nome;

	protected String crudMethod;

	/** 
	 * Sets the value of nome
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	/** 
	 * Gets the value of nome
	 */
	public String getNome()
	{
		return nome;
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
