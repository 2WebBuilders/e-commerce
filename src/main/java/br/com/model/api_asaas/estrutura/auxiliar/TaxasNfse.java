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
public class TaxasNfse {

	@SerializedName("retainIss")
	@Expose
	public Boolean retainIss;
	@SerializedName("iss")
	@Expose
	public Integer iss;
	@SerializedName("cofins")
	@Expose
	public Integer cofins;
	@SerializedName("csll")
	@Expose
	public Integer csll;
	@SerializedName("inss")
	@Expose
	public Integer inss;
	@SerializedName("ir")
	@Expose
	public Double ir;
	@SerializedName("pis")
	@Expose
	public Double pis;

}
