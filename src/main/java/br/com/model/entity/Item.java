package br.com.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codItem;
	private Produto codigoProduto;
	private Integer qtsProdutos;

	public Long getCodItem() {
		return codItem;
	}

	public void setCodItem(Long codItem) {
		this.codItem = codItem;
	}

	public Produto getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(Produto codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	public Integer getQtsProdutos() {
		return qtsProdutos;
	}

	public void setQtsProdutos(Integer qtsProdutos) {
		this.qtsProdutos = qtsProdutos;
	}

}
