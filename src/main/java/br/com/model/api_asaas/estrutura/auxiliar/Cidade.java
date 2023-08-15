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
public class Cidade {

	@SerializedName("object")
	@Expose
	public String object;
	@SerializedName("id")
	@Expose
	public Integer id;
	@SerializedName("ibgeCode")
	@Expose
	public String ibgeCode;
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("districtCode")
	@Expose
	public String districtCode;
	@SerializedName("district")
	@Expose
	public String district;
	@SerializedName("state")
	@Expose
	public String state;

}
