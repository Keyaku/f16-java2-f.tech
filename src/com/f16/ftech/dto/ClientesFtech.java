/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.f16.ftech.dto;

import java.io.Serializable;
import java.util.Date;

public class ClientesFtech implements Serializable
{
	/** 
	 * This attribute maps to the column ID_CLIENTE in the CLIENTES_FTECH table.
	 */
	protected int idCliente;

	/** 
	 * This attribute maps to the column NUMERO_CC in the CLIENTES_FTECH table.
	 */
	protected int numeroCc;

	/** 
	 * This attribute maps to the column NOME in the CLIENTES_FTECH table.
	 */
	protected String nome;

	/** 
	 * This attribute maps to the column MORADA in the CLIENTES_FTECH table.
	 */
	protected String morada;

	/** 
	 * This attribute maps to the column DATA_NASCIMENTO in the CLIENTES_FTECH table.
	 */
	protected Date dataNascimento;

	/** 
	 * This attribute maps to the column DATA_INSERCAO in the CLIENTES_FTECH table.
	 */
	protected Date dataInsercao;

	/** 
	 * This attribute maps to the column GENERO in the CLIENTES_FTECH table.
	 */
	protected String genero;

	/**
	 * Method 'ClientesFtech'
	 * 
	 */
	public ClientesFtech()
	{
	}

	/**
	 * Method 'getIdCliente'
	 * 
	 * @return int
	 */
	public int getIdCliente()
	{
		return idCliente;
	}

	/**
	 * Method 'setIdCliente'
	 * 
	 * @param idCliente
	 */
	public void setIdCliente(int idCliente)
	{
		this.idCliente = idCliente;
	}

	/**
	 * Method 'getNumeroCc'
	 * 
	 * @return int
	 */
	public int getNumeroCc()
	{
		return numeroCc;
	}

	/**
	 * Method 'setNumeroCc'
	 * 
	 * @param numeroCc
	 */
	public void setNumeroCc(int numeroCc)
	{
		this.numeroCc = numeroCc;
	}

	/**
	 * Method 'getNome'
	 * 
	 * @return String
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * Method 'setNome'
	 * 
	 * @param nome
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	/**
	 * Method 'getMorada'
	 * 
	 * @return String
	 */
	public String getMorada()
	{
		return morada;
	}

	/**
	 * Method 'setMorada'
	 * 
	 * @param morada
	 */
	public void setMorada(String morada)
	{
		this.morada = morada;
	}

	/**
	 * Method 'getDataNascimento'
	 * 
	 * @return Date
	 */
	public Date getDataNascimento()
	{
		return dataNascimento;
	}

	/**
	 * Method 'setDataNascimento'
	 * 
	 * @param dataNascimento
	 */
	public void setDataNascimento(Date dataNascimento)
	{
		this.dataNascimento = dataNascimento;
	}

	/**
	 * Method 'getDataInsercao'
	 * 
	 * @return Date
	 */
	public Date getDataInsercao()
	{
		return dataInsercao;
	}

	/**
	 * Method 'setDataInsercao'
	 * 
	 * @param dataInsercao
	 */
	public void setDataInsercao(Date dataInsercao)
	{
		this.dataInsercao = dataInsercao;
	}

	/**
	 * Method 'getGenero'
	 * 
	 * @return String
	 */
	public String getGenero()
	{
		return genero;
	}

	/**
	 * Method 'setGenero'
	 * 
	 * @param genero
	 */
	public void setGenero(String genero)
	{
		this.genero = genero;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof ClientesFtech)) {
			return false;
		}
		
		final ClientesFtech _cast = (ClientesFtech) _other;
		if (idCliente != _cast.idCliente) {
			return false;
		}
		
		if (numeroCc != _cast.numeroCc) {
			return false;
		}
		
		if (nome == null ? _cast.nome != nome : !nome.equals( _cast.nome )) {
			return false;
		}
		
		if (morada == null ? _cast.morada != morada : !morada.equals( _cast.morada )) {
			return false;
		}
		
		if (dataNascimento == null ? _cast.dataNascimento != dataNascimento : !dataNascimento.equals( _cast.dataNascimento )) {
			return false;
		}
		
		if (dataInsercao == null ? _cast.dataInsercao != dataInsercao : !dataInsercao.equals( _cast.dataInsercao )) {
			return false;
		}
		
		if (genero == null ? _cast.genero != genero : !genero.equals( _cast.genero )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idCliente;
		_hashCode = 29 * _hashCode + numeroCc;
		if (nome != null) {
			_hashCode = 29 * _hashCode + nome.hashCode();
		}
		
		if (morada != null) {
			_hashCode = 29 * _hashCode + morada.hashCode();
		}
		
		if (dataNascimento != null) {
			_hashCode = 29 * _hashCode + dataNascimento.hashCode();
		}
		
		if (dataInsercao != null) {
			_hashCode = 29 * _hashCode + dataInsercao.hashCode();
		}
		
		if (genero != null) {
			_hashCode = 29 * _hashCode + genero.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return ClientesFtechPk
	 */
	public ClientesFtechPk createPk()
	{
		return new ClientesFtechPk(idCliente);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.f16.ftech.dto.ClientesFtech: " );
		ret.append( "idCliente=" + idCliente );
		ret.append( ", numeroCc=" + numeroCc );
		ret.append( ", nome=" + nome );
		ret.append( ", morada=" + morada );
		ret.append( ", dataNascimento=" + dataNascimento );
		ret.append( ", dataInsercao=" + dataInsercao );
		ret.append( ", genero=" + genero );
		return ret.toString();
	}

}
