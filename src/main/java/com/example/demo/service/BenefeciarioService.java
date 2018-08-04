package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BenefeciarioService<T> {
	
	/**
	 * Metodo para buscar beneficiario por código
	 * @param Long code
	 * @return beneficiario
	 */
	public T findForCode(int code, String packages, String procedure);
	
	/**
	 * Metodo para buscar beneficiario por nome
	 * @param String name
	 * @return beneficiario
	 */
	public T findForName(String name, String packages, String procedure);
	
	/**
	 * Metodo para buscar beneficiario por código
	 * @param Long code
	 * @return beneficiario
	 */
	public String findForString(String string, String packages, String procedure);

	/**
	 * Metodo para buscar todos os beneficiarios
	 * @return List<Beneficiario> lista com todos os beneficiarios
	 */
	public List<T> findAll(String packages, String procedure);
}
