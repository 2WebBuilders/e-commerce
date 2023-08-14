package br.com.model.api_asaas.estrutura.cartao;

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
public class TokenizacaoResponse {

	@SerializedName("creditCardNumber")
	@Expose
	private String creditCardNumber;
	@SerializedName("creditCardBrand")
	@Expose
	private String creditCardBrand;
	@SerializedName("creditCardToken")
	@Expose
	private String creditCardToken;

}
