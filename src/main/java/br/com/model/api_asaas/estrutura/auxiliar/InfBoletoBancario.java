package br.com.model.api_asaas.estrutura.auxiliar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class InfBoletoBancario {

	@SerializedName("identificationField")
	@Expose
	public String identificationField;
	@SerializedName("value")
	@Expose
	public Double value;
	@SerializedName("dueDate")
	@Expose
	public String dueDate;
	@SerializedName("companyName")
	@Expose
	public Object companyName;
	@SerializedName("bank")
	@Expose
	public String bank;
	@SerializedName("beneficiaryCpfCnpj")
	@Expose
	public String beneficiaryCpfCnpj;
	@SerializedName("beneficiaryName")
	@Expose
	public String beneficiaryName;
	@SerializedName("allowChangeValue")
	@Expose
	public Boolean allowChangeValue;
	@SerializedName("minValue")
	@Expose
	public Double minValue;
	@SerializedName("maxValue")
	@Expose
	public Double maxValue;
	@SerializedName("discountValue")
	@Expose
	public Integer discountValue;
	@SerializedName("interestValue")
	@Expose
	public Integer interestValue;
	@SerializedName("fineValue")
	@Expose
	public Integer fineValue;
	@SerializedName("originalValue")
	@Expose
	public Double originalValue;
	@SerializedName("totalDiscountValue")
	@Expose
	public Integer totalDiscountValue;
	@SerializedName("totalAdditionalValue")
	@Expose
	public Integer totalAdditionalValue;
	@SerializedName("isOverdue")
	@Expose
	public Boolean isOverdue;

}
