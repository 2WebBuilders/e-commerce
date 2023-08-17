package br.com.model.api_asaas.estrutura.notaFiscal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.TaxasNfse;
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
public class NotaFiscalResponse {

	@SerializedName("object")
	@Expose
	public String object;
	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("status")
	@Expose
	public String status;
	@SerializedName("customer")
	@Expose
	public String customer;
	@SerializedName("type")
	@Expose
	public String type;
	@SerializedName("statusDescription")
	@Expose
	public Object statusDescription;
	@SerializedName("serviceDescription")
	@Expose
	public String serviceDescription;
	@SerializedName("pdfUrl")
	@Expose
	public Object pdfUrl;
	@SerializedName("xmlUrl")
	@Expose
	public Object xmlUrl;
	@SerializedName("rpsSerie")
	@Expose
	public Object rpsSerie;
	@SerializedName("rpsNumber")
	@Expose
	public Object rpsNumber;
	@SerializedName("number")
	@Expose
	public Object number;
	@SerializedName("validationCode")
	@Expose
	public Object validationCode;
	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("deductions")
	@Expose
	public Integer deductions;
	@SerializedName("effectiveDate")
	@Expose
	public String effectiveDate;
	@SerializedName("observations")
	@Expose
	public String observations;
	@SerializedName("estimatedTaxesDescription")
	@Expose
	public String estimatedTaxesDescription;
	@SerializedName("payment")
	@Expose
	public String payment;
	@SerializedName("installment")
	@Expose
	public Object installment;
	@SerializedName("externalReference")
	@Expose
	public Object externalReference;
	@SerializedName("taxes")
	@Expose
	@Valid
	public TaxasNfse taxes;
	@SerializedName("municipalServiceId")
	@Expose
	public Object municipalServiceId;
	@SerializedName("municipalServiceCode")
	@Expose
	public String municipalServiceCode;
	@SerializedName("municipalServiceName")
	@Expose
	public String municipalServiceName;
	@SerializedName("invoiceCreationPeriod")
	@Expose
	public String invoiceCreationPeriod;
	@SerializedName("daysBeforeDueDate")
	@Expose
	public String daysBeforeDueDate;
	@SerializedName("receivedOnly")
	@Expose
	public String receivedOnly;

}