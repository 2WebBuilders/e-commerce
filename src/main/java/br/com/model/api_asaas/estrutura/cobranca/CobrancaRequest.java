package br.com.model.api_asaas.estrutura.cobranca;

import java.util.List;
import java.util.Optional;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.CartaoCredito;
import br.com.model.api_asaas.estrutura.auxiliar.Desconto;
import br.com.model.api_asaas.estrutura.auxiliar.Juros;
import br.com.model.api_asaas.estrutura.auxiliar.Multa;
import br.com.model.api_asaas.estrutura.auxiliar.Redirecionamento;
import br.com.model.api_asaas.estrutura.auxiliar.Rateio;
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
public class CobrancaRequest {

	@SerializedName("customer")
	@Expose
	private String customer;
	@SerializedName("billingType")
	@Expose
	private String billingType;
	@SerializedName("value")
	@Expose
	private Integer value;
	@SerializedName("dueDate")
	@Expose
	private String dueDate;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("externalReference")
	@Expose
	private String externalReference;
	@SerializedName("installmentCount")
	@Expose
	private Integer installmentCount;
	@SerializedName("installmentValue")
	@Expose
	private Integer installmentValue;
	@SerializedName("postalService")
	@Expose
	private Boolean postalService;
	@SerializedName("discount")
	@Expose
	@Valid
	private Desconto discount;
	@SerializedName("interest")
	@Expose
	@Valid
	private Juros interest;
	@SerializedName("fine")
	@Expose
	@Valid
	private Multa fine;
	@SerializedName("split")
	@Expose
	@Valid
	private List<Rateio> split;
	@SerializedName("creditCard")
	@Expose
	@Valid
	private Optional<CartaoCredito> creditCard;
	@SerializedName("creditCardHolderInfo")
	@Expose
	@Valid
	private Optional<TitularCartaoCredito> creditCardHolderInfo;
	@SerializedName("creditCardToken")
	@Expose
	private Optional<String> creditCardToken;
	@SerializedName("authorizeOnly")
	@Expose
	private Optional<Boolean> authorizeOnly;
	@SerializedName("remoteIp")
	@Expose
	private Optional<String> remoteIp;
	@SerializedName("callback")
	@Expose
	@Valid
	private Optional<Redirecionamento> callback;

}
