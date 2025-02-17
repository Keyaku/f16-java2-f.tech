/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.f16.ftech.factory;

import java.sql.Connection;
import com.f16.ftech.dao.*;
import com.f16.ftech.jdbc.*;

public class ClientesFtechDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return ClientesFtechDao
	 */
	public static ClientesFtechDao create()
	{
		return new ClientesFtechDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return ClientesFtechDao
	 */
	public static ClientesFtechDao create(Connection conn)
	{
		return new ClientesFtechDaoImpl( conn );
	}

}
