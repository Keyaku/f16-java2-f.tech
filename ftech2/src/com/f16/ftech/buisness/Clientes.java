package com.f16.ftech.buisness;


import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.f16.ftech.dao.ClientesFtechDao;
import com.f16.ftech.dto.ClientesFtech;
import com.f16.ftech.dto.ClientesFtechPk;
import com.f16.ftech.exceptions.ClientesFtechDaoException;
import com.f16.ftech.factory.ClientesFtechDaoFactory;

@WebService
public class Clientes {
	@WebMethod
	public int InsertCliente(ClientesFtech cliente) {
		ClientesFtechDao clienteDao = ClientesFtechDaoFactory.create();
		int valor_retorno = -1;
		try {
			if(VerificarCC(cliente) && VerificarGenero(cliente) && VerificarDataNasc(cliente) && VerificarDataInsert(cliente)) {
				clienteDao.insert(cliente);
				valor_retorno = 1;
			}
			
		}catch (ClientesFtechDaoException e) {
			e.printStackTrace();
		}
		return valor_retorno;
	}
	
	@WebMethod
	public ClientesFtech[] ListarTodosClientes() {
		ClientesFtech[] clientes = null;
		ClientesFtechDao clienteDao = ClientesFtechDaoFactory.create();
		try {
			clientes = clienteDao.findAll();
		} catch (ClientesFtechDaoException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			return clientes;
	}

	@WebMethod
	public int DeleteCliente(ClientesFtechPk clientepk) {
		ClientesFtechDao clienteDao = ClientesFtechDaoFactory.create();
		try {
			clienteDao.delete(clientepk);
		}catch (ClientesFtechDaoException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@WebMethod
	public int UpdateCliente(ClientesFtechPk clientepk, ClientesFtech cliente) {
		ClientesFtechDao clienteDao = ClientesFtechDaoFactory.create();
		int valor_retorno = -1;
		try {
			if(VerificarCC(cliente) && VerificarGenero(cliente) && VerificarDataNasc(cliente) && VerificarDataInsert(cliente)) {
			clienteDao.update(clientepk,cliente);
			valor_retorno = 1;
			}
		}catch (ClientesFtechDaoException e) {
			e.printStackTrace();
		}
		return valor_retorno;
	}

	@WebMethod
	public ClientesFtech[] ListarClientesPorID(int id) {
		ClientesFtech[] clientes = null;
		ClientesFtechDao clienteDao = ClientesFtechDaoFactory.create();
		try {
			clientes = clienteDao.findWhereIdClienteEquals(id);
		} catch (ClientesFtechDaoException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return clientes;
	}

	@WebMethod
	public ClientesFtech[] ListarClientesPorCC(int cc) {
		ClientesFtech[] clientes = null;
		ClientesFtechDao clienteDao = ClientesFtechDaoFactory.create();
		try {
			clientes = clienteDao.findWhereNumeroCcEquals(cc);
		} catch (ClientesFtechDaoException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return clientes;
	}

	@WebMethod
	public ClientesFtech[] ListarClientesPorNome(String nome) {
		ClientesFtech[] clientes = null;
		ClientesFtechDao clienteDao = ClientesFtechDaoFactory.create();
		try {
			clientes = clienteDao.findWhereNomeEquals(nome);
		} catch (ClientesFtechDaoException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return clientes;
	}

	@WebMethod
	public ClientesFtech[] ListarClientesPorMorada(String morada) {
		ClientesFtech[] clientes = null;
		ClientesFtechDao clienteDao = ClientesFtechDaoFactory.create();
		try {
			clientes = clienteDao.findWhereMoradaEquals(morada);
		} catch (ClientesFtechDaoException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return clientes;
	}

	@WebMethod
	public ClientesFtech[] ListarClientesPorDataNasc(Date nascimento) {
		ClientesFtech[] clientes = null;
		ClientesFtechDao clienteDao = ClientesFtechDaoFactory.create();
		try {
			clientes = clienteDao.findWhereDataNascimentoEquals(nascimento);
		} catch (ClientesFtechDaoException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return clientes;
	}

	@WebMethod
	public ClientesFtech[] ListarClientesPorDataInsert(Date insert) {
		ClientesFtech[] clientes = null;
		ClientesFtechDao clienteDao = ClientesFtechDaoFactory.create();
		try {
			clientes = clienteDao.findWhereDataInsercaoEquals(insert);
		} catch (ClientesFtechDaoException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return clientes;
	}

	@WebMethod
	public ClientesFtech[] ListarClientesPorGenero(String genero) {
		ClientesFtech[] clientes = null;
		ClientesFtechDao clienteDao = ClientesFtechDaoFactory.create();
		try {
			clientes = clienteDao.findWhereGeneroEquals(genero);
		} catch (ClientesFtechDaoException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return clientes;
	}
	
	public boolean VerificarCC(ClientesFtech cliente) {
		int num_cc = cliente.getNumeroCc();
		int length = String.valueOf(num_cc).length();
		if(length == 8) {
			return true;
		}
		
		return false;
	}
	
	public boolean VerificarGenero(ClientesFtech cliente) {
		String genero = cliente.getGenero();
		int length = String.valueOf(genero).length();
		if(length == 1 && (genero.contains("M") || genero.contains("F"))) {
			return true;
		}
		
		return false;
	}
	// Tenho de pensar neste
//	public boolean VerificarNome(ClientesFtech cliente) {
//		String nome = cliente.getNome();
//		
//		if(true) {
//			return true;
//		}
//		
//		return false;
//	}
	
	public boolean VerificarDataNasc(ClientesFtech cliente) {
		
		Date dataNasc = cliente.getDataNascimento();
		Date date2 = new Date();
		if(dataNasc.compareTo(date2) < 0) {
			return true;
		}		
		return false;
	}
	
	public boolean VerificarDataInsert(ClientesFtech cliente) {
		
		Date dataInsert = cliente.getDataInsercao();
		Date date2 = new Date();
		if(dataInsert.compareTo(date2) < 0) {
			return true;
		}		
		return false;
	}
	
//	public boolean VerificarDatas(ClientesFtech cliente) {
//		
//		Date dataInsert = cliente.getDataInsercao();
//		Date dataNasc = cliente.getDataNascimento();
//		if(dataInsert.compareTo(dataNasc) < 0) {
//			return true;
//		}		
//		return false;
//	}
}
