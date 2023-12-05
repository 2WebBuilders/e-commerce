package br.com.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import br.com.model.entity.Carrinho;

public interface CarrinhoRepository extends JpaRepository<Carrinho, Long>, JpaSpecificationExecutor<Carrinho> {

}
