package br.com.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.crud.CrudServiceImpl;
import br.com.model.entity.Administrador;
import br.com.model.repository.AdministradorRepository;

public class AdministradorServiceImpl extends CrudServiceImpl<Administrador, Long> {
	
	@Autowired
	private AdministradorRepository administradorRepository;

	@Override
	protected JpaRepository<Administrador, Long> getRepository() {
		return administradorRepository;
	}

}
