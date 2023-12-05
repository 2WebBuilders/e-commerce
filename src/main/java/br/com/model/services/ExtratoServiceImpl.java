package br.com.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.crud.CrudServiceImpl;
import br.com.model.entity.Extrato;
import br.com.model.repository.ExtratoRepository;

public class ExtratoServiceImpl extends CrudServiceImpl<Extrato, Long> {
	
	@Autowired
	private ExtratoRepository extratoRepository;

	@Override
	protected JpaRepository<Extrato, Long> getRepository() {
		return extratoRepository;
	}

}
