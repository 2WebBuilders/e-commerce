package br.com.model.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codConta;
	private Extrato extrato;
	private BigDecimal saldo;

	@OneToOne
	@JoinColumn(name = "usuario_id")
	private Usuario codigoUsuario;

	public Long getCodConta() {
		return codConta;
	}

	public void setCodConta(Long codConta) {
		this.codConta = codConta;
	}

	public Extrato getExtrato() {
		return extrato;
	}

	public void setExtrato(Extrato extrato) {
		this.extrato = extrato;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public Usuario getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Usuario codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

}
