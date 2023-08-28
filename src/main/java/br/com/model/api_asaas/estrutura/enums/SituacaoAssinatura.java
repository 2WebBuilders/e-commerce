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
public enum SituacaoAssinatura {

	@SerializedName("ACTIVE")
	ACTIVE ("Ativa"),
	@SerializedName("EXPIRED")
	EXPIRED ("Expirada"),
	@SerializedName("INACTIVE")
	INACTIVE ("Inativa");
	
	private String situacao;
	private final static Map<String, SituacaoAssinatura> CONSTANTS = new HashMap<String, SituacaoAssinatura>();

	static {
		for (SituacaoAssinatura c : values()) {
			CONSTANTS.put(c.getSituacao(), c);
		}
	}

	public static SituacaoAssinatura fromValue(String situacao) {
		SituacaoAssinatura constant = CONSTANTS.get(situacao);
		if (constant == null) {
			throw new IllegalArgumentException(situacao);
		} else {
			return constant;
		}
	}

}
