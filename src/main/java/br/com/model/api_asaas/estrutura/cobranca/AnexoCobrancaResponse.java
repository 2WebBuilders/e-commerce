package br.com.model.api_asaas.estrutura.cobranca;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.Arquivo;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class AnexoCobrancaResponse {

	@SerializedName("object")
	@Expose
	private String object;
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("type")
	@Expose
	private String type;
	@SerializedName("availableAfterPayment")
	@Expose
	private Boolean availableAfterPayment;
	@SerializedName("file")
	@Expose
	@Valid
	private Arquivo file;
	@SerializedName("deleted")
	@Expose
	private Boolean deleted;

}
