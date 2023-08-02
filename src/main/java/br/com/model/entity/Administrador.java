package br.com.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "administrador")
public class Administrador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codAdministrador;

	private String nome;
	private String password;
	private String email;
	private String tokenBancoAssas;
	private String chavePix;
	private String cobrancas;

	public Long getCodAdministrador() {
		return codAdministrador;
	}

	public void setCodAdministrador(Long codAdministrador) {
		this.codAdministrador = codAdministrador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTokenBancoAssas() {
		return tokenBancoAssas;
	}

	public void setTokenBancoAssas(String tokenBancoAssas) {
		this.tokenBancoAssas = tokenBancoAssas;
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

	public String getCobrancas() {
		return cobrancas;
	}

	public void setCobrancas(String cobrancas) {
		this.cobrancas = cobrancas;
	}

}
