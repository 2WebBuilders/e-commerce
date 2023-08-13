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
public class Reembolsos {

	@SerializedName("dateCreated")
	@Expose
	private String dateCreated;
	@SerializedName("status")
	@Expose
	private String status;
	@SerializedName("value")
	@Expose
	private Integer value;
	@SerializedName("description")
	@Expose
	private String description;
	@SerializedName("transactionReceiptUrl")
	@Expose
	private String transactionReceiptUrl;

}
