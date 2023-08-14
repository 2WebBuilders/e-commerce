package br.com.model.api_asaas.estrutura.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum SituacaoAssinatura {

	ACTIVE ("Ativa"),
	EXPIRED ("Expirada"),
	INACTIVE ("Inativa");
	
	private String situacao;

}
