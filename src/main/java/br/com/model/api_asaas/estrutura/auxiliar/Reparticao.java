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
public class Reparticao {

	@SerializedName("walletId")
	@Expose
	private String walletId;
	@SerializedName("fixedValue")
	@Expose
	private Integer fixedValue;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("refusalReason")
	@Expose
	private Object refusalReason;
	@SerializedName("percentualValue")
	@Expose
	private Integer percentualValue;

}
