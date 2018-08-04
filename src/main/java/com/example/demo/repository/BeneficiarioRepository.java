package com.example.demo.repository;

import org.springframework.stereotype.Repository;

/**
 * 
 * @author Diego
 *
 */
@Repository
public interface BeneficiarioRepository {
	String PKG_BENEF = new StringBuilder().append("PKG_BENEF").toString();
	String BUSCAR_TODOS_BENEFICIARIO = new StringBuilder().append("BUSCAR_TODOS_BENEFICIARIO").toString();
	String BUSCAR_BENEFICIARIO_CODIGO = new StringBuilder().append("BUSCAR_BENEFICIARIO_CODIGO").toString();
	String BUSCAR_BENEFICIARIO_NOME = new StringBuilder().append("BUSCAR_BENEFICIARIO_NOME").toString();
	String BUSCAR_BENEFICIARIO_DESCRICAO = new StringBuilder().append("BUSCAR_BENEFICIARIO_DESCRICAO").toString();
	String BUSCAR_BENEFICIARIO_VALOR = new StringBuilder().append("BUSCAR_BENEFICIARIO_VALOR").toString();
	String BUSCAR_BENEFICIARIO_STRING = new StringBuilder().append("BUSCAR_BENEFICIARIO_STRING").toString();
	String BUSCAR_BENEFICIARIO_BOOLEAN = new StringBuilder().append("BUSCAR_BENEFICIARIO_BOOLEAN").toString();
}
