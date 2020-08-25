package com.PostalCode.PromadBD.DAO;

import java.util.List;

import com.PostalCode.PromadBD.Entitys.PostalCode;
import com.PostalCode.PromadBD.Entitys.ResultadoDto;

public interface IConsultaDao {
	
	public List<PostalCode> getDatos(String code);

	
}
