package br.com.model.api_asaas.estrutura.auxiliar.taxasAsaas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
public class AntecipacaoTaxa {

	@SerializedName("creditCard")
	@Expose
	@Valid
	private CartaoCredito__1Taxa creditCard;
	@SerializedName("bankSlip")
	@Expose
	@Valid
	private BoletoTaxa__1 bankSlip;

}