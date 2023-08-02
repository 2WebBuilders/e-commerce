package br.com.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.model.enums.StatusPagamento;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codPedido;
	private Carrinho carrinho_codCarrinho;
	private Conta pedido_codConta;
	private LocalDateTime dataPedido;
	private BigDecimal taxa;

	@Enumerated(EnumType.STRING)
	private StatusPagamento status;

	private BigDecimal total;

	public Long getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(Long codPedido) {
		this.codPedido = codPedido;
	}

	public Carrinho getCarrinho_codCarrinho() {
		return carrinho_codCarrinho;
	}

	public void setCarrinho_codCarrinho(Carrinho carrinho_codCarrinho) {
		this.carrinho_codCarrinho = carrinho_codCarrinho;
	}

	public Conta getPedido_codConta() {
		return pedido_codConta;
	}

	public void setPedido_codConta(Conta pedido_codConta) {
		this.pedido_codConta = pedido_codConta;
	}

	public LocalDateTime getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(LocalDateTime dataPedido) {
		this.dataPedido = dataPedido;
	}

	public BigDecimal getTaxa() {
		return taxa;
	}

	public void setTaxa(BigDecimal taxa) {
		this.taxa = taxa;
	}

	public StatusPagamento getStatus() {
		return status;
	}

	public void setStatus(StatusPagamento status) {
		this.status = status;
	}

	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

}
