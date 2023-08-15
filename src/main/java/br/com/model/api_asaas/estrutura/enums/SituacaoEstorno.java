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
public enum SituacaoEstorno {

	@SerializedName("REQUESTED")
	REQUESTED ("Estorno solicitado"),
	@SerializedName("PENDING")
	PENDING ("Estorno pendente"),
	@SerializedName("CANCELLED")
	CANCELLED ("Cancelado"),
	@SerializedName("IN_DISPUTE")
	IN_DISPUTE ("Em Disputa"), 
	@SerializedName("DISPUTE_LOST")
	DISPUTE_LOST ("Disputa Perdida"), 
	@SerializedName("REVERSED")
	REVERSED ("Estornado"), 
	@SerializedName("DONE")
	DONE ("Concluído");

	private String situacao;
	private final static Map<String, SituacaoEstorno> CONSTANTS = new HashMap<String, SituacaoEstorno>();

	static {
		for (SituacaoEstorno c : values()) {
			CONSTANTS.put(c.getSituacao(), c);
		}
	}

	public static SituacaoEstorno fromValue(String situacao) {
		SituacaoEstorno constant = CONSTANTS.get(situacao);
		if (constant == null) {
			throw new IllegalArgumentException(situacao);
		} else {
			return constant;
		}
	}
}
