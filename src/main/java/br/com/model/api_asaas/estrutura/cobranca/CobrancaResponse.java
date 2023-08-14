package br.com.model.api_asaas.estrutura.cobranca;

import java.util.List;
import java.util.Optional;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.Desconto;
import br.com.model.api_asaas.estrutura.auxiliar.Juros;
import br.com.model.api_asaas.estrutura.auxiliar.Multa;
import br.com.model.api_asaas.estrutura.auxiliar.Rateio;
import br.com.model.api_asaas.estrutura.auxiliar.Reembolsos;
import br.com.model.api_asaas.estrutura.cartao.TokenizacaoCartaoCreditoResponse;
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
public class CobrancaResponse {

	@SerializedName("object")
	@Expose
	private String object;
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("dateCreated")
	@Expose
	private String dateCreated;
	@SerializedName("customer")
	@Expose
	private String customer;
	@SerializedName("paymentLink")
	@Expose
	private Object paymentLink;
	@SerializedName("dueDate")
	@Expose
	private String dueDate;
	@SerializedName("value")
	@Expose
	private Integer value;
	@SerializedName("netValue")
	@Expose
	private Integer netValue;
	@SerializedName("billingType")
	@Expose
	private String billingType;
	@SerializedName("canBePaidAfterDueDate")
	@Expose
	private Boolean canBePaidAfterDueDate;
	@SerializedName("pixTransaction")
	@Expose
	private Object pixTransaction;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("externalReference")
	@Expose
	private String externalReference;
	@SerializedName("originalValue")
	@Expose
	private Object originalValue;
	@SerializedName("interestValue")
	@Expose
	private Object interestValue;
	@SerializedName("originalDueDate")
	@Expose
	private String originalDueDate;
	@SerializedName("paymentDate")
	@Expose
	private Object paymentDate;
	@SerializedName("clientPaymentDate")
	@Expose
	private Object clientPaymentDate;
	@SerializedName("installmentNumber")
	@Expose
	private Object installmentNumber;
	@SerializedName("transactionReceiptUrl")
	@Expose
	private Object transactionReceiptUrl;
	@SerializedName("nossoNumero")
	@Expose
	private String nossoNumero;
	@SerializedName("invoiceUrl")
	@Expose
	private String invoiceUrl;
	@SerializedName("bankSlipUrl")
	@Expose
	private String bankSlipUrl;
	@SerializedName("lastInvoiceViewedDate")
	@Expose
	private Object lastInvoiceViewedDate;
	@SerializedName("lastBankSlipViewedDate")
	@Expose
	private Object lastBankSlipViewedDate;
	@SerializedName("invoiceNumber")
	@Expose
	private String invoiceNumber;
	@SerializedName("discount")
	@Expose
	@Valid
	private Desconto discount;
	@SerializedName("fine")
	@Expose
	@Valid
	private Multa fine;
	@SerializedName("interest")
	@Expose
	@Valid
	private Juros interest;
	@SerializedName("deleted")
	@Expose
	private Boolean deleted;
	@SerializedName("postalService")
	@Expose
	private Boolean postalService;
	@SerializedName("anticipated")
	@Expose
	private Boolean anticipated;
	@SerializedName("anticipable")
	@Expose
	private Boolean anticipable;
	@SerializedName("creditDate")
	@Expose
	private Object creditDate;
	@SerializedName("estimatedCreditDate")
	@Expose
	private Object estimatedCreditDate;
	@SerializedName("custody")
	@Expose
	private Object custody;
	@SerializedName("refunds")
	@Expose
	@Valid
	private List<Reembolsos> refunds;
	@SerializedName("creditCard")
	@Expose
	@Valid
	private Optional<TokenizacaoCartaoCreditoResponse> creditCard;
	@SerializedName("split")
	@Expose
	@Valid
	private Optional<List<Rateio>> split;

}
