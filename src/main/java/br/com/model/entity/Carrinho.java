package br.com.model.entity;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "carrinho")
public class Carrinho {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codCarrinho;
	private List<Item> listItem;
	private BigDecimal subTotal;
	private BigDecimal total;

	public Long getCodCarrinho() {
		return codCarrinho;
	}

	public void setCodCarrinho(Long codCarrinho) {
		this.codCarrinho = codCarrinho;
	}

	public List<Item> getListItem() {
		return listItem;
	}

	public void setListItem(List<Item> listItem) {
		this.listItem = listItem;
	}

	public BigDecimal getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
