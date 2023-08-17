package br.com.model.api_asaas.estrutura.auxiliar.taxasAsaas;

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
public class CartaoCreditoTaxa {

	@SerializedName("operationValue")
	@Expose
	public Double operationValue;
	@SerializedName("oneInstallmentPercentage")
	@Expose
	public Double oneInstallmentPercentage;
	@SerializedName("upToSixInstallmentsPercentage")
	@Expose
	public Double upToSixInstallmentsPercentage;
	@SerializedName("upToTwelveInstallmentsPercentage")
	@Expose
	public Double upToTwelveInstallmentsPercentage;
	@SerializedName("discountOneInstallmentPercentage")
	@Expose
	public Double discountOneInstallmentPercentage;
	@SerializedName("discountUpToSixInstallmentsPercentage")
	@Expose
	public Double discountUpToSixInstallmentsPercentage;
	@SerializedName("discountUpToTwelveInstallmentsPercentage")
	@Expose
	public Double discountUpToTwelveInstallmentsPercentage;
	@SerializedName("discountExpiration")
	@Expose
	public String discountExpiration;

}
