package br.com.model.enums;

public enum StatusPagamento {

	PENDENTE("Pendente"), APROVADO("Aprovado"), REJEITADO("Rejeitado"), CANCELADO("Cancelado");

	private String descricao;

	StatusPagamento(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
