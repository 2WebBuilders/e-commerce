package br.com.model.api_asaas.estrutura.enums;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Generated("jsonschema2pojo")
public enum SituacaoCobranca {

	@SerializedName("PENDING")
	PENDING ("Aguardando pagamento"), 
	@SerializedName("RECEIVED")
	RECEIVED ("Recebida (saldo já creditado na conta)"), 
	@SerializedName("CONFIRMED")
	CONFIRMED ("Pagamento confirmado (saldo ainda não creditado)"), 
	@SerializedName("OVERDUE")
	OVERDUE ("Vencida"), 
	@SerializedName("REFUNDED")
	REFUNDED ("Estornada"), 
	@SerializedName("RECEIVED_IN_CASH")
	RECEIVED_IN_CASH ("Recebida em dinheiro (não gera saldo na conta)"), 
	@SerializedName("REFUND_REQUESTED")
	REFUND_REQUESTED ("Estorno Solicitado"), 
	@SerializedName("REFUND_IN_PROGRESS")
	REFUND_IN_PROGRESS ("Estorno em processamento (liquidação já está agendada, cobrança será estornada após executar a liquidação)"), 
	@SerializedName("CHARGEBACK_REQUESTED")
	CHARGEBACK_REQUESTED ("Recebido chargeback"), 
	@SerializedName("CHARGEBACK_DISPUTE")
	CHARGEBACK_DISPUTE ("Em disputa de chargeback (caso sejam apresentados documentos para contestação)"), 
	@SerializedName("AWAITING_CHARGEBACK_REVERSAL")
	AWAITING_CHARGEBACK_REVERSAL("Disputa vencida, aguardando repasse da adquirente"), 
	@SerializedName("DUNNING_REQUESTED")
	DUNNING_REQUESTED ("Em processo de negativação"), 
	@SerializedName("DUNNING_RECEIVED")
	DUNNING_RECEIVED ("Recuperada"), 
	@SerializedName("AWAITING_RISK_ANALYSIS")
	AWAITING_RISK_ANALYSIS ("Pagamento em análise");

	private String situacao;
	private final static Map<String, SituacaoCobranca> CONSTANTS = new HashMap<String, SituacaoCobranca>();

	static {
		for (SituacaoCobranca c : values()) {
			CONSTANTS.put(c.getSituacao(), c);
		}
	}

	public static SituacaoCobranca fromValue(String situacao) {
		SituacaoCobranca constant = CONSTANTS.get(situacao);
		if (constant == null) {
			throw new IllegalArgumentException(situacao);
		} else {
			return constant;
		}
	}

}
