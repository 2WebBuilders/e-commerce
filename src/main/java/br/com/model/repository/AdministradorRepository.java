package br.com.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import br.com.model.entity.Administrador;

public interface AdministradorRepository extends JpaRepository<Administrador, Long>, JpaSpecificationExecutor<Administrador> {

}
