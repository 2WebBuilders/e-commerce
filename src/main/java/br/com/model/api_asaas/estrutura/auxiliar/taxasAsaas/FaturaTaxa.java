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
public class FaturaTaxa {

	@SerializedName("feeValue")
	@Expose
	public Double feeValue;

}
