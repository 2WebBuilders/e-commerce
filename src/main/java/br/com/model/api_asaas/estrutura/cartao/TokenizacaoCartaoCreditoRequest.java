package br.com.model.api_asaas.estrutura.cartao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.CartaoCredito;
import br.com.model.api_asaas.estrutura.auxiliar.TitularCartaoCredito;
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
public class TokenizacaoRequest {

	@SerializedName("customer")
	@Expose
	private String customer;
	@SerializedName("creditCard")
	@Expose
	@Valid
	private CartaoCredito creditCard;
	@SerializedName("creditCardHolderInfo")
	@Expose
	@Valid
	private TitularCartaoCredito creditCardHolderInfo;
	@SerializedName("remoteIp")
	@Expose
	private String remoteIp;

}
