package br.com.model.api_asaas.estrutura.auxiliar.taxas;

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
public class PixTaxa {

	@SerializedName("fixedFeeValue")
	@Expose
	public Object fixedFeeValue;
	@SerializedName("fixedFeeValueWithDiscount")
	@Expose
	public Object fixedFeeValueWithDiscount;
	@SerializedName("percentageFee")
	@Expose
	public Double percentageFee;
	@SerializedName("minimumFeeValue")
	@Expose
	public Double minimumFeeValue;
	@SerializedName("maximumFeeValue")
	@Expose
	public Double maximumFeeValue;
	@SerializedName("discountExpiration")
	@Expose
	public Object discountExpiration;
	@SerializedName("monthlyCreditsWithoutFee")
	@Expose
	public Integer monthlyCreditsWithoutFee;
	@SerializedName("creditsReceivedOfCurrentMonth")
	@Expose
	public Integer creditsReceivedOfCurrentMonth;

}
