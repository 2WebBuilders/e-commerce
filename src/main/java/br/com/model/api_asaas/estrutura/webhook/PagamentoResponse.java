package br.com.model.api_asaas.estrutura.webhook;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.Desconto;
import br.com.model.api_asaas.estrutura.auxiliar.Estorno;
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
public class PagamentoResponse {

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
	@SerializedName("subscription")
	@Expose
	private String subscription;
	@SerializedName("installment")
	@Expose
	private String installment;
	@SerializedName("paymentLink")
	@Expose
	private String paymentLink;
	@SerializedName("dueDate")
	@Expose
	private String dueDate;
	@SerializedName("originalDueDate")
	@Expose
	private String originalDueDate;
	@SerializedName("value")
	@Expose
	private Integer value;
	@SerializedName("netValue")
	@Expose
	private Double netValue;
	@SerializedName("originalValue")
	@Expose
	private Object originalValue;
	@SerializedName("interestValue")
	@Expose
	private Object interestValue;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("externalReference")
	@Expose
	private String externalReference;
	@SerializedName("billingType")
	@Expose
	private String billingType;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("pixTransaction")
	@Expose
	private Object pixTransaction;
	@SerializedName("confirmedDate")
	@Expose
	private String confirmedDate;
	@SerializedName("paymentDate")
	@Expose
	private String paymentDate;
	@SerializedName("clientPaymentDate")
	@Expose
	private String clientPaymentDate;
	@SerializedName("installmentNumber")
	@Expose
	private Object installmentNumber;
	@SerializedName("creditDate")
	@Expose
	private String creditDate;
	@SerializedName("estimatedCreditDate")
	@Expose
	private String estimatedCreditDate;
	@SerializedName("invoiceUrl")
	@Expose
	private String invoiceUrl;
	@SerializedName("bankSlipUrl")
	@Expose
	private Object bankSlipUrl;
	@SerializedName("transactionReceiptUrl")
	@Expose
	private String transactionReceiptUrl;
	@SerializedName("invoiceNumber")
	@Expose
	private String invoiceNumber;
	@SerializedName("deleted")
	@Expose
	private Boolean deleted;
	@SerializedName("anticipated")
	@Expose
	private Boolean anticipated;
	@SerializedName("anticipable")
	@Expose
	private Boolean anticipable;
	@SerializedName("lastInvoiceViewedDate")
	@Expose
	private String lastInvoiceViewedDate;
	@SerializedName("lastBankSlipViewedDate")
	@Expose
	private Object lastBankSlipViewedDate;
	@SerializedName("postalService")
	@Expose
	private Boolean postalService;
	@SerializedName("creditCard")
	@Expose
	@Valid
	private TokenizacaoCartaoCreditoResponse creditCard;
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
	@SerializedName("split")
	@Expose
	@Valid
	private List<Rateio> split;
	@SerializedName("chargeback")
	@Expose
	@Valid
	private Estorno chargeback;
	@SerializedName("refunds")
	@Expose
	@Valid
	private List<Reembolsos> refunds;

}
