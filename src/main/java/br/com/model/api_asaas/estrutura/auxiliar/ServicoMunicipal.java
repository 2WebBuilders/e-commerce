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
public class ServicoMunicipal {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("issTax")
	@Expose
	public Integer issTax;

}
