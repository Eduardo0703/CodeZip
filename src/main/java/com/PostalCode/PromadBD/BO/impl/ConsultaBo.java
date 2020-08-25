package com.PostalCode.PromadBD.BO.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PostalCode.PromadBD.BO.IConsultaBo;
import com.PostalCode.PromadBD.DAO.IConsultaDao;
import com.PostalCode.PromadBD.Entitys.PostalCode;
import com.PostalCode.PromadBD.Entitys.ResultadoDto;

@Service
public class ConsultaBo  implements IConsultaBo{

	
	@Autowired
	IConsultaDao consulta;
	
	@Override
	public List<ResultadoDto> geDatos(String code) {
		adapterBo adapter = new adapterBo();
		
		
		
		return adapter.convertion(consulta.getDatos(code));
	}

}
