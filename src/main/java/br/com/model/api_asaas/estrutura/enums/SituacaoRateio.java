package br.com.model.api_asaas.estrutura.enums;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@Generated("jsonschema2pojo")
public enum SituacaoRateio {

	@SerializedName("PENDING")
	PENDING ("Aguardando pagamento"), 
	@SerializedName("AWAITING_CREDIT")
	AWAITING_CREDIT ("Aguardando crédito"),
	@SerializedName("CANCELLED")
	CANCELLED ("Cancelado"),
	@SerializedName("DONE")
	DONE ("Concluído"),
	@SerializedName("REFUSED")
	REFUSED ("Recusado"),
	@SerializedName("RECEIVABLE_UNIT_AFFECTED_BY_EXTERNAL_CONTRACTUAL_EFFECT")
	RECEIVABLE_UNIT_AFFECTED_BY_EXTERNAL_CONTRACTUAL_EFFECT ("Rateio não executado devido a existência de efeitos de contrato");

	private final String situacao;
	private final static Map<String, SituacaoRateio> CONSTANTS = new HashMap<String, SituacaoRateio>();

	static {
		for (SituacaoRateio c : values()) {
			CONSTANTS.put(c.getSituacao(), c);
		}
	}

	public static SituacaoRateio fromValue(String situacao) {
		SituacaoRateio constant = CONSTANTS.get(situacao);
		if (constant == null) {
			throw new IllegalArgumentException(situacao);
		} else {
			return constant;
		}
	}

}
