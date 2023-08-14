package br.com.model.api_asaas.estrutura.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum SituacaoRateio {

	PENDING ("Aguardando pagamento"), 
	AWAITING_CREDIT ("Aguardando crédito"),
	CANCELLED ("Cancelado"),
	DONE ("Concluído"),
	REFUSED ("Recusado"),
	RECEIVABLE_UNIT_AFFECTED_BY_EXTERNAL_CONTRACTUAL_EFFECT ("Rateio não executado devido a existência de efeitos de contrato");

	private String situacao;

}
