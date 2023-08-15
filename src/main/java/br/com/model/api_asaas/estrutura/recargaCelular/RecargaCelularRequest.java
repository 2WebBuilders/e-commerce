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
public class RecargaCelularRequest {

	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("phoneNumber")
	@Expose
	public String phoneNumber;

}