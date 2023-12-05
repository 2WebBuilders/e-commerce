package br.com.model.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.crud.CrudServiceImpl;
import br.com.model.entity.Carrinho;
import br.com.model.repository.CarrinhoRepository;

public class CarrinhoServiceImpl extends CrudServiceImpl<Carrinho, Long> {
	
	@Autowired
	private CarrinhoRepository carrinhoRepository;

	@Override
	protected JpaRepository<Carrinho, Long> getRepository() {
		return carrinhoRepository;
	}

}
