package br.com.model.api_asaas.estrutura.infoFinanceiras;

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
public class EstatisticasCobrancasResponse {

	@SerializedName("quantity")
	@Expose
	public Integer quantity;
	@SerializedName("value")
	@Expose
	public Double value;
	@SerializedName("netValue")
	@Expose
	public Double netValue;

}