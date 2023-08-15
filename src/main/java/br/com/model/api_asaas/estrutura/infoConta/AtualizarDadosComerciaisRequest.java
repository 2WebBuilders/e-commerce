package br.com.model.api_asaas.estrutura.infoConta;

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
public class AtualizarDadosComerciaisRequest {

	@SerializedName("personType")
	@Expose
	public String personType;
	@SerializedName("cpfCnpj")
	@Expose
	public String cpfCnpj;
	@SerializedName("birthDate")
	@Expose
	public String birthDate;
	@SerializedName("companyType")
	@Expose
	public String companyType;
	@SerializedName("email")
	@Expose
	public String email;
	@SerializedName("phone")
	@Expose
	public String phone;
	@SerializedName("mobilePhone")
	@Expose
	public String mobilePhone;
	@SerializedName("site")
	@Expose
	public String site;
	@SerializedName("postalCode")
	@Expose
	public String postalCode;
	@SerializedName("address")
	@Expose
	public String address;
	@SerializedName("addressNumber")
	@Expose
	public String addressNumber;
	@SerializedName("complement")
	@Expose
	public String complement;
	@SerializedName("province")
	@Expose
	public String province;

}