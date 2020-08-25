package com.PostalCode.PromadBD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.PostalCode.PromadBD.BO.IConsultaBo;
import com.PostalCode.PromadBD.Entitys.ResultadoDto;

@RestController
@RequestMapping("/zip-codes")
public class Controller {

	@Autowired
	IConsultaBo consulta;
	
	@RequestMapping(value="/{valor}", method = {RequestMethod.GET, RequestMethod.POST})
	public ResponseEntity<List> getDatos(@PathVariable(value="valor") String code) {
		
		List<ResultadoDto> result = consulta.geDatos(code);
		if(result.isEmpty()) {
			return new ResponseEntity(HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity(result, HttpStatus.OK);
		}
		
	}
	
}
