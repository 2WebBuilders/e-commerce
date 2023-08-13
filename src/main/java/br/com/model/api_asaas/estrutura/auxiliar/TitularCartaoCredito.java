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
public class TitularCartaoCredito {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("email")
	@Expose
	private String email;
	@SerializedName("cpfCnpj")
	@Expose
	private String cpfCnpj;
	@SerializedName("postalCode")
	@Expose
	private String postalCode;
	@SerializedName("addressNumber")
	@Expose
	private String addressNumber;
	@SerializedName("addressComplement")
	@Expose
	private String addressComplement;
	@SerializedName("phone")
	@Expose
	private String phone;
	@SerializedName("mobilePhone")
	@Expose
	private String mobilePhone;
}