package br.com.model.api_asaas.estrutura.assinatura;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.CartaoCredito;
import br.com.model.api_asaas.estrutura.auxiliar.Desconto;
import br.com.model.api_asaas.estrutura.auxiliar.Juros;
import br.com.model.api_asaas.estrutura.auxiliar.Multa;
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
public class AssinaturaRequest {

	@SerializedName("customer")
	@Expose
	public String customer;
	@SerializedName("billingType")
	@Expose
	public String billingType;
	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("nextDueDate")
	@Expose
	public String nextDueDate;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("endDate")
	@Expose
	public String endDate;
	@SerializedName("maxPayments")
	@Expose
	public Integer maxPayments;
	@SerializedName("updatePendingPayments")
	@Expose
	public Boolean updatePendingPayments;
	@SerializedName("externalReference")
	@Expose
	public String externalReference;
	@SerializedName("cycle")
	@Expose
	public String cycle;
	@SerializedName("discount")
	@Expose
	@Valid
	public Desconto discount;
	@SerializedName("interest")
	@Expose
	@Valid
	public Juros interest;
	@SerializedName("fine")
	@Expose
	@Valid
	public Multa fine;
	@SerializedName("split")
	@Expose
	@Valid
	private List<Rateio> split;
	@SerializedName("creditCard")
	@Expose
	@Valid
	public CartaoCredito creditCard;
	@SerializedName("creditCardHolderInfo")
	@Expose
	@Valid
	public TitularCartaoCredito creditCardHolderInfo;
	@SerializedName("remoteIp")
	@Expose
	public String remoteIp;
	@SerializedName("creditCardToken")
	@Expose
	public String creditCardToken;

}