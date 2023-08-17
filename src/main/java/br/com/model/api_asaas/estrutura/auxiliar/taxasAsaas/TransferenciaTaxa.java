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
public class TransferenciaTaxa {

	@SerializedName("monthlyTransfersWithoutFee")
	@Expose
	public Integer monthlyTransfersWithoutFee;
	@SerializedName("ted")
	@Expose
	@Valid
	public TedTaxa ted;
	@SerializedName("pix")
	@Expose
	@Valid
	public Pix__1Taxa pix;

}
