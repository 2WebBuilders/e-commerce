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
public class CartaoCredito__1Taxa {

	@SerializedName("detachedMonthlyFeeValue")
	@Expose
	public Integer detachedMonthlyFeeValue;
	@SerializedName("installmentMonthlyFeeValue")
	@Expose
	public Double installmentMonthlyFeeValue;

}
