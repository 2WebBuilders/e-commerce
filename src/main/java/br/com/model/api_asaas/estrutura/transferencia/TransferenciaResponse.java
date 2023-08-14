package br.com.model.api_asaas.estrutura.transferencia;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.DadosBanco;
import br.com.model.api_asaas.estrutura.auxiliar.DadosBancoAsaas;
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
public class TransferenciaResponse {

	@SerializedName("object")
	@Expose
	public String object;
	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("type")
	@Expose
	public String type;
	@SerializedName("dateCreated")
	@Expose
	public String dateCreated;
	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("netValue")
	@Expose
	public Integer netValue;
	@SerializedName("status")
	@Expose
	public String status;
	@SerializedName("transferFee")
	@Expose
	public Integer transferFee;
	@SerializedName("effectiveDate")
	@Expose
	public Object effectiveDate;
	@SerializedName("endToEndIdentifier")
	@Expose
	public Object endToEndIdentifier;
	@SerializedName("scheduleDate")
	@Expose
	public String scheduleDate;
	@SerializedName("authorized")
	@Expose
	public Boolean authorized;
	@SerializedName("failReason")
	@Expose
	public Object failReason;
	@SerializedName("bankAccount")
	@Expose
	@Valid
	public DadosBanco bankAccount;
	@SerializedName("walletId")
	@Expose
	public String walletId;
	@SerializedName("account")
	@Expose
	@Valid
	public DadosBancoAsaas account;
	@SerializedName("transactionReceiptUrl")
	@Expose
	public Object transactionReceiptUrl;
	@SerializedName("operationType")
	@Expose
	public String operationType;
	@SerializedName("description")
	@Expose
	public String description;

}
