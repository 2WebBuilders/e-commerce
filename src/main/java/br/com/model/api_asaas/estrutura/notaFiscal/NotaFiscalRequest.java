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
public class NotaFiscalRequest {

	@SerializedName("payment")
	@Expose
	public String payment;
	@SerializedName("installment")
	@Expose
	public Object installment;
	@SerializedName("serviceDescription")
	@Expose
	public String serviceDescription;
	@SerializedName("observations")
	@Expose
	public String observations;
	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("deductions")
	@Expose
	public Integer deductions;
	@SerializedName("effectiveDate")
	@Expose
	public String effectiveDate;
	@SerializedName("externalReference")
	@Expose
	public String externalReference;
	@SerializedName("taxes")
	@Expose
	@Valid
	public TaxasNfse taxes;
	@SerializedName("municipalServiceId")
	@Expose
	public String municipalServiceId;
	@SerializedName("municipalServiceCode")
	@Expose
	public String municipalServiceCode;
	@SerializedName("municipalServiceName")
	@Expose
	public String municipalServiceName;
	@SerializedName("updatePayment")
	@Expose
	public Boolean updatePayment;
	@SerializedName("effectiveDatePeriod")
	@Expose
	public String effectiveDatePeriod;
	@SerializedName("receivedOnly")
	@Expose
	public Boolean receivedOnly;
	@SerializedName("daysBeforeDueDate")
	@Expose
	public String daysBeforeDueDate;

}