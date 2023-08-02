package br.com.model.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codProduto;
	private String nome;
	private String txDescricao;
	private BigDecimal valor;
	private Integer qtsEstoque;

	private Item item;

	public Long getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Long codProduto) {
		this.codProduto = codProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTxDescricao() {
		return txDescricao;
	}

	public void setTxDescricao(String txDescricao) {
		this.txDescricao = txDescricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getQtsEstoque() {
		return qtsEstoque;
	}

	public void setQtsEstoque(Integer qtsEstoque) {
		this.qtsEstoque = qtsEstoque;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}
