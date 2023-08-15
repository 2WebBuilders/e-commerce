package br.com.model.api_asaas.estrutura.infoConta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import jakarta.annotation.Generated;

@Generated("jsonschema2pojo")
public class SituacaoCadastralContaResponse {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("commercialInfo")
	@Expose
	public String commercialInfo;
	@SerializedName("documentation")
	@Expose
	public String documentation;
	@SerializedName("general")
	@Expose
	public String general;

}