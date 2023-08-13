package br.com.model.api_asaas.estrutura.cobranca;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class AnexoCobrancaRequest {

	@SerializedName("availableAfterPayment")
	@Expose
	private Boolean availableAfterPayment;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("file")
	@Expose
	private String file;

}
