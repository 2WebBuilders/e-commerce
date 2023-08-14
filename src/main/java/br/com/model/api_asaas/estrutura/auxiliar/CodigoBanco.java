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
public class CodigoBanco {

	@SerializedName("ispb")
	@Expose
	public String ispb;
	@SerializedName("code")
	@Expose
	public String code;
	@SerializedName("name")
	@Expose
	public String name;

}
