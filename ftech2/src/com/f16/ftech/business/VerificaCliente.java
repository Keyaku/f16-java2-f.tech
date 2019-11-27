package com.f16.ftech.business;

import java.util.Date;

import com.f16.ftech.dto.ClientesFtech;


public class VerificaCliente {

	public static boolean Tudo(ClientesFtech cliente) {
		return (
			CC(cliente) &&
			Genero(cliente) &&
			DataNasc(cliente) && 
			DataInsert(cliente) &&
			Datas(cliente)
		);
	}

	private static boolean CC(ClientesFtech cliente) {
		int num_cc = cliente.getNumeroCc();
		int length = String.valueOf(num_cc).length();
		return length == 8;
	}
	
	private static boolean Genero(ClientesFtech cliente) {
		String genero = cliente.getGenero();
		int length = String.valueOf(genero).length();
		return (length == 1 && (genero.contains("M") || genero.contains("F")));
	}
	
	private static boolean DataNasc(ClientesFtech cliente) {
		Date dataNasc = cliente.getDataNascimento();
		Date date2 = new Date();
		return dataNasc.compareTo(date2) < 0;
	}
	
	private static boolean DataInsert(ClientesFtech cliente) {
		
		Date dataInsert = cliente.getDataInsercao();
		Date date2 = new Date();
		return dataInsert.compareTo(date2) < 0;
	}
	
	private static boolean Datas(ClientesFtech cliente) {
		
		Date dataInsert = cliente.getDataInsercao();
		Date dataNasc = cliente.getDataNascimento();
		return dataInsert.compareTo(dataNasc) > 0;
	}
}
