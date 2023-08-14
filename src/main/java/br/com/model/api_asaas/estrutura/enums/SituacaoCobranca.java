package br.com.model.api_asaas.estrutura.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum SituacaoCobranca {

	PENDING ("Aguardando pagamento"), 
	RECEIVED ("Recebida (saldo já creditado na conta)"), 
	CONFIRMED ("Pagamento confirmado (saldo ainda não creditado)"), 
	OVERDUE ("Vencida"), 
	REFUNDED ("Estornada"), 
	RECEIVED_IN_CASH ("Recebida em dinheiro (não gera saldo na conta)"), 
	REFUND_REQUESTED ("Estorno Solicitado"), 
	REFUND_IN_PROGRESS ("Estorno em processamento (liquidação já está agendada, cobrança será estornada após executar a liquidação)"), 
	CHARGEBACK_REQUESTED ("Recebido chargeback"), 
	CHARGEBACK_DISPUTE ("Em disputa de chargeback (caso sejam apresentados documentos para contestação)"), 
	AWAITING_CHARGEBACK_REVERSAL("Disputa vencida, aguardando repasse da adquirente"), 
	DUNNING_REQUESTED ("Em processo de negativação"), 
	DUNNING_RECEIVED ("Recuperada"), 
	AWAITING_RISK_ANALYSIS ("Pagamento em análise");

	private String situacao;

}
