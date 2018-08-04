package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.BeneficiarioDAO;
import com.example.demo.entity.Beneficiario;
import com.example.demo.repository.BeneficiarioRepository;

/**
 * Controlle para manipulação de dados de entrada de beneficiario
 * @author Diego
 *
 */
@RestController
@RequestMapping("/busca")
public class BeneficiarioController implements BeneficiarioRepository {
	
	@Autowired
	private BeneficiarioDAO BeneficiarioDAO;
	
	@GetMapping("")
	public ResponseEntity<List<Beneficiario>> findAll() {
		List<Beneficiario> beneficiarios = BeneficiarioDAO.findAll(PKG_BENEF, BUSCAR_TODOS_BENEFICIARIO);
		beneficiarios.forEach(System.out::println);
		return ResponseEntity.ok(beneficiarios);
	}
	
	@GetMapping("/{code}")
	public ResponseEntity<Beneficiario> findForCode(@PathVariable int code){
		return ResponseEntity.ok(BeneficiarioDAO.findForCode(code, PKG_BENEF, BUSCAR_BENEFICIARIO_CODIGO));
	}
	
	@GetMapping("/nome/{name}")
	public ResponseEntity<Beneficiario> findForName(@PathVariable String name){
		return ResponseEntity.ok(BeneficiarioDAO.findForName(name, PKG_BENEF, BUSCAR_BENEFICIARIO_NOME));
	}
	
	@GetMapping("/description/{description}")
	public ResponseEntity<String> findForString(@PathVariable String description){
		return ResponseEntity.ok(BeneficiarioDAO.findForString(description, PKG_BENEF, BUSCAR_BENEFICIARIO_STRING));
	}
}
