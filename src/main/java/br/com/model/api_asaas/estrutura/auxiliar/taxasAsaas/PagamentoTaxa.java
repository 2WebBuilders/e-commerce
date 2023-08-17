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
public class PagamentoTaxa {

	@SerializedName("bankSlip")
	@Expose
	@Valid
	public BoletoTaxa bankSlip;
	@SerializedName("creditCard")
	@Expose
	@Valid
	public CartaoCreditoTaxa creditCard;
	@SerializedName("debitCard")
	@Expose
	@Valid
	public CartoaDebitoTaxa debitCard;
	@SerializedName("pix")
	@Expose
	@Valid
	public PixTaxa pix;

}
