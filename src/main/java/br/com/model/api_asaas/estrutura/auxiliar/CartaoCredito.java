package br.com.model.api_asaas.estrutura.auxiliar;

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
public class CartaoCredito {

	@SerializedName("holderName")
	@Expose
	private String holderName;
	@SerializedName("number")
	@Expose
	private String number;
	@SerializedName("expiryMonth")
	@Expose
	private String expiryMonth;
	@SerializedName("expiryYear")
	@Expose
	private String expiryYear;
	@SerializedName("ccv")
	@Expose
	private String ccv;

}