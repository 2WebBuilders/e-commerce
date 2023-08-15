package br.com.model.api_asaas.estrutura.recargaCelular;

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
public class RecargaCelularResponse {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("phoneNumber")
	@Expose
	public String phoneNumber;
	@SerializedName("status")
	@Expose
	public String status;
	@SerializedName("canBeCancelled")
	@Expose
	public Boolean canBeCancelled;
	@SerializedName("operatorName")
	@Expose
	public String operatorName;

}