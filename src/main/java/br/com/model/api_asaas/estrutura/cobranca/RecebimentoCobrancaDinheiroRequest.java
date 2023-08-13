package br.com.model.api_asaas.estrutura.cobranca;

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
public class RecebimentoCobrancaDinheiroRequest {

	@SerializedName("paymentDate")
	@Expose
	private String paymentDate;
	@SerializedName("value")
	@Expose
	private Integer value;
	@SerializedName("notifyCustomer")
	@Expose
	private Boolean notifyCustomer;

}
