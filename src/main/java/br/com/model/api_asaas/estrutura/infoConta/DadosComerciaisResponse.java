package br.com.model.api_asaas.estrutura.infoConta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.Cidade;
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
public class DadosComerciaisResponse {

	@SerializedName("status")
	@Expose
	public String status;
	@SerializedName("personType")
	@Expose
	public String personType;
	@SerializedName("cpfCnpj")
	@Expose
	public String cpfCnpj;
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("birthDate")
	@Expose
	public String birthDate;
	@SerializedName("companyName")
	@Expose
	public String companyName;
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
	@SerializedName("city")
	@Expose
	@Valid
	public Cidade city;
	@SerializedName("denialReason")
	@Expose
	public String denialReason;
	@SerializedName("site")
	@Expose
	public String site;

}