package br.com.model.api_asaas.estrutura.assinatura;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.Desconto;
import br.com.model.api_asaas.estrutura.auxiliar.Juros;
import br.com.model.api_asaas.estrutura.auxiliar.Multa;
import br.com.model.api_asaas.estrutura.auxiliar.Rateio;
import br.com.model.api_asaas.estrutura.cartao.TokenizacaoCartaoCreditoResponse;
import br.com.model.api_asaas.estrutura.enums.SituacaoAssinatura;
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
public class AssinaturaResponse {

	@SerializedName("object")
	@Expose
	public String object;
	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("dateCreated")
	@Expose
	public String dateCreated;
	@SerializedName("customer")
	@Expose
	public String customer;
	@SerializedName("paymentLink")
	@Expose
	public Object paymentLink;
	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("nextDueDate")
	@Expose
	public String nextDueDate;
	@SerializedName("cycle")
	@Expose
	public String cycle;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("billingType")
	@Expose
	public String billingType;
	@SerializedName("deleted")
	@Expose
	public Boolean deleted;
	@SerializedName("status")
	@Expose
	public SituacaoAssinatura status;
	@SerializedName("externalReference")
	@Expose
	public String externalReference;
	@SerializedName("creditCard")
	@Expose
	@Valid
	public TokenizacaoCartaoCreditoResponse creditCard;
	@SerializedName("endDate")
	@Expose
	public String endDate;
	@SerializedName("maxPayments")
	@Expose
	public Integer maxPayments;
	@SerializedName("sendPaymentByPostalService")
	@Expose
	public Boolean sendPaymentByPostalService;
	@SerializedName("discount")
	@Expose
	@Valid
	public Desconto discount;
	@SerializedName("fine")
	@Expose
	@Valid
	public Multa fine;
	@SerializedName("interest")
	@Expose
	@Valid
	public Juros interest;
	@SerializedName("split")
	@Expose
	@Valid
	private List<Rateio> split;

}
