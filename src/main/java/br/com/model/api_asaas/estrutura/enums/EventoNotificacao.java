package br.com.model.api_asaas.estrutura.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum EventoNotificacao {

	PAYMENT_RECEIVED ("Cobrança recebida"),
	PAYMENT_OVERDUE ("Cobrança vencida"),
	PAYMENT_DUEDATE_WARNING ("Cobrança perto da data de vencimento");
	
	private String situacao;

}
