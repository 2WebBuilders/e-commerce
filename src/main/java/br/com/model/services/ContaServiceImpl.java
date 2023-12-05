package br.com.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.crud.CrudServiceImpl;
import br.com.model.entity.Conta;
import br.com.model.repository.ContaRepository;

public class ContaServiceImpl extends CrudServiceImpl<Conta, Long> {

	@Autowired
	private ContaRepository contaRepository;

	@Override
	protected JpaRepository<Conta, Long> getRepository() {
		return contaRepository;
	}

}
