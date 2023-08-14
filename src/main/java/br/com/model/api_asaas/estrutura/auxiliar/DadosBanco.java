package br.com.model.api_asaas.estrutura.auxiliar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Generated("jsonschema2pojo")
public class DadosBanco {

	@SerializedName("bank")
	@Expose
	@Valid
	public CodigoBanco bank;
	@SerializedName("accountName")
	@Expose
	public String accountName;
	@SerializedName("ownerName")
	@Expose
	public String ownerName;
	@SerializedName("ownerBirthDate")
	@Expose
	public String ownerBirthDate;
	@SerializedName("cpfCnpj")
	@Expose
	public String cpfCnpj;
	@SerializedName("agency")
	@Expose
	public String agency;
	@SerializedName("account")
	@Expose
	public String account;
	@SerializedName("accountDigit")
	@Expose
	public String accountDigit;
	@SerializedName("bankAccountType")
	@Expose
	public String bankAccountType;
	@SerializedName("pixAddressKey")
	@Expose
	public Object pixAddressKey;

}
