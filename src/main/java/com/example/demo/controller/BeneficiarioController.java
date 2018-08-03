package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dao.BeneficiarioDAO;

/**
 * 
 * @author Diego
 *
 */
@RestController
@RequestMapping("/busca")
public class BeneficiarioController {
	
	@Autowired
	private BeneficiarioDAO BeneficiarioDAO;
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Object> buscarPeloCodigo(@PathVariable Long codigo) {
		BeneficiarioDAO.teste(codigo);
		System.out.println(codigo);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
