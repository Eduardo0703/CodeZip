package com.PostalCode.PromadBD.DAO.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.PostalCode.PromadBD.DAO.IConsultaDao;
import com.PostalCode.PromadBD.Entitys.PostalCode;
import com.PostalCode.PromadBD.Entitys.ResultadoDto;
import com.PostalCode.PromadBD.util.JPAUtil;


@Repository
public class ConsultaDao implements IConsultaDao {

	@Override
	public List<PostalCode> getDatos(String code) {
		
		
		EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();
			
		List<PostalCode> listaPotalCode= new ArrayList<>();
			
		Query query=entity.createQuery("select g from PostalCode g where d_codigo = '"+code+"' ");
		
		return query.getResultList();
	}

}
