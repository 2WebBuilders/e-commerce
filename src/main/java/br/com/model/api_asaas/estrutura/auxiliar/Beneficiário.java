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
public class Beneficiário {

	@SerializedName("ispb")
	@Expose
	public Integer ispb;
	@SerializedName("ispbName")
	@Expose
	public String ispbName;
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("tradingName")
	@Expose
	public Object tradingName;
	@SerializedName("cpfCnpj")
	@Expose
	public Object cpfCnpj;
	@SerializedName("personType")
	@Expose
	public String personType;
	@SerializedName("agency")
	@Expose
	public String agency;
	@SerializedName("account")
	@Expose
	public String account;
	@SerializedName("accountType")
	@Expose
	public String accountType;
	@SerializedName("addressKey")
	@Expose
	public String addressKey;
	@SerializedName("addressKeyType")
	@Expose
	public String addressKeyType;

}