package br.com.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "extrato")
public class Extrato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idExtrato;
	private LocalDateTime dataTransacao;
	private String descricao;
	private BigDecimal valor;
	private BigDecimal saldoAtual;

	public Long getIdExtrato() {
		return idExtrato;
	}

	public void setIdExtrato(Long idExtrato) {
		this.idExtrato = idExtrato;
	}

	public LocalDateTime getDataTransacao() {
		return dataTransacao;
	}

	public void setDataTransacao(LocalDateTime dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public BigDecimal getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(BigDecimal saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

}
