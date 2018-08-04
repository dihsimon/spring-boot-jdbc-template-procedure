package com.example.demo.dao;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Beneficiario;
import com.example.demo.service.BenefeciarioService;

/**
 * DAO de persistencia do beneficiario
 * @author Diego
 *
 */
@Service
public class BeneficiarioDAO implements BenefeciarioService<Beneficiario> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public Beneficiario findForCode(int code, String packages, String procedure){
		return populateBeneficiario(new SimpleJdbcCall(jdbcTemplate).withCatalogName(packages).withProcedureName(procedure).execute(new MapSqlParameterSource("P_CODIGO", code)));
	}
	
	public Beneficiario findForName(String name, String packages, String procedure){
		return populateBeneficiario(new SimpleJdbcCall(jdbcTemplate).withCatalogName(packages).withProcedureName(procedure).execute(new MapSqlParameterSource("P_NOME", name)));
	}

	public String findForString(String description, String packages, String procedure){
		return new SimpleJdbcCall(jdbcTemplate).withCatalogName(packages).withProcedureName(procedure).executeObject(String.class,new MapSqlParameterSource("P_STRING", description));
	}
	
	@SuppressWarnings("unchecked")
	public List<Beneficiario> findAll(String packages, String procedure) {
		Map<String, Object> result = new SimpleJdbcCall(jdbcTemplate).withCatalogName(packages).withProcedureName(procedure).returningResultSet("retorno_beneficiario", BeanPropertyRowMapper.newInstance(Beneficiario.class)).execute(new HashMap<String, Object>(0));
		return (List<Beneficiario>) result.get("retorno_beneficiario");
	}

	/**
	 * Metodo para popular o retorno do banco de dados para entidade beneficiario 
	 * @param Map<String, Object> params
	 * @return {@link Beneficiario}
	 */
	public static Beneficiario populateBeneficiario(Map<String, Object> params) {
		Beneficiario beneficiario = new Beneficiario();
		beneficiario.setCodigo(((BigDecimal)params.get("CODIGO")).intValue());
		beneficiario.setNome((String) params.get("NOME"));
		beneficiario.setDescricao((String) params.get("DESCRICAO"));
		beneficiario.setValor(((BigDecimal)params.get("VALOR")).doubleValue());
		return beneficiario;
	}
}
