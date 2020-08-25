package com.PostalCode.PromadBD.BO.impl;

import java.util.ArrayList;
import java.util.List;

import com.PostalCode.PromadBD.Entitys.PostalCode;
import com.PostalCode.PromadBD.Entitys.ResultadoDto;
import com.PostalCode.PromadBD.Entitys.Settlements;

public class adapterBo {
	
	
	public List<ResultadoDto> convertion(List<PostalCode> postal) {
		
		
		List<ResultadoDto> list = new ArrayList<ResultadoDto>();
		Settlements   settlements;
		ResultadoDto result;
		
		for(int i=0 ; i < postal.size() ; i++ ) {
						
			settlements = new Settlements(postal.get(i).getD_asenta()	, postal.get(i).getD_zona()		, postal.get(i).getC_tipo_asenta());
			
			result = new ResultadoDto(postal.get(i).getD_codigo(), postal.get(i).getD_ciudad()  ,postal.get(i).getC_estado(), settlements, postal.get(i).getC_mnpio()) ;
			
			list.add(result);
		}
		
		
		return list;
	}
}
