package com.PostalCode.PromadBD.BO;

import java.util.List;

import com.PostalCode.PromadBD.Entitys.PostalCode;
import com.PostalCode.PromadBD.Entitys.ResultadoDto;

public interface IConsultaBo {
	
	public List<ResultadoDto> geDatos(String code) ;

	
}
