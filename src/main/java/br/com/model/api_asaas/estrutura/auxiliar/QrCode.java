package br.com.model.api_asaas.estrutura.auxiliar;

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
public class QrCode {

	@SerializedName("payload")
	@Expose
	public String payload;
	@SerializedName("payer")
	@Expose
	@Valid
	public Pagador payer;
	@SerializedName("conciliationIdentifier")
	@Expose
	public String conciliationIdentifier;
	@SerializedName("originalValue")
	@Expose
	public Integer originalValue;
	@SerializedName("dueDate")
	@Expose
	public String dueDate;
	@SerializedName("interest")
	@Expose
	public Integer interest;
	@SerializedName("fine")
	@Expose
	public Integer fine;
	@SerializedName("discount")
	@Expose
	public Integer discount;
	@SerializedName("expirationDate")
	@Expose
	public String expirationDate;

}
