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
public class LinhaDigitavelBoletoResponse {

	@SerializedName("identificationField")
	@Expose
	private String identificationField;
	@SerializedName("nossoNumero")
	@Expose
	private String nossoNumero;
	@SerializedName("barCode")
	@Expose
	private String barCode;

}
