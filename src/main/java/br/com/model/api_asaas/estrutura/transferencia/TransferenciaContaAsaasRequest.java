package br.com.model.api_asaas.estrutura.transferencia;

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
public class TransferenciaContaAsaasRequest {

	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("walletId")
	@Expose
	public String walletId;

}