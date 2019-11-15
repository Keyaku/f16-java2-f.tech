package com.f16.ftech.buisness;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.f16.ftech.dao.ClientesFtechDao;
import com.f16.ftech.dto.ClientesFtech;
import com.f16.ftech.exceptions.ClientesFtechDaoException;
import com.f16.ftech.factory.ClientesFtechDaoFactory;

@WebService
public class Clientes {
@WebMethod
		public int InsertCliente(ClientesFtech cliente) {
			ClientesFtechDao clienteDao = ClientesFtechDaoFactory.create();
			try {
				clienteDao.insert(cliente);
			}catch (ClientesFtechDaoException e) {
				e.printStackTrace();
			}
			return 0;
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
}
