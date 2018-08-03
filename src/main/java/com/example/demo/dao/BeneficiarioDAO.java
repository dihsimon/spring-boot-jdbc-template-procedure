package com.example.demo.dao;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Beneficiario;

/**
 * 
 * @author Diego
 *
 */
@Service
public class BeneficiarioDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private SimpleJdbcCall simpleJdbcCall;
	
	@SuppressWarnings("unchecked")
	public void teste(Long codigo) {
		simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate);
		simpleJdbcCall.withCatalogName("PKG_BENEF").withProcedureName("BUSCAR_BENEFICIARIO").returningResultSet("retorno_beneficiario", BeanPropertyRowMapper.newInstance(Beneficiario.class));
		Map<String, Object> result = simpleJdbcCall.execute(new HashMap<String, Object>(0));
		List<Beneficiario> lista = (List<Beneficiario>) result.get("retorno_beneficiario");
		for(Beneficiario b : lista) {
			System.out.println("Código beneficiario = " + b.getCodigo());
			System.out.println("Nome beneficiario = " + b.getNome());
			System.out.println("Descrição beneficiario = " + b.getDescricao());
			System.out.println("Valor beneficiario = " + b.getValor());
			System.out.println();
		}
	}
}
