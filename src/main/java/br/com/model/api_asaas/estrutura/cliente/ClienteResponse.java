package br.com.model.api_asaas.estrutura.cliente;

import java.util.List;
import java.util.Optional;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.Grupo;
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
public class ClienteResponse {

	@SerializedName("object")
	@Expose
	private String object;
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("dateCreated")
	@Expose
	private String dateCreated;
	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("email")
	@Expose
	private String email;
	@SerializedName("phone")
	@Expose
	private String phone;
	@SerializedName("mobilePhone")
	@Expose
	private String mobilePhone;
	@SerializedName("address")
	@Expose
	private String address;
	@SerializedName("addressNumber")
	@Expose
	private String addressNumber;
	@SerializedName("complement")
	@Expose
	private String complement;
	@SerializedName("province")
	@Expose
	private String province;
	@SerializedName("postalCode")
	@Expose
	private String postalCode;
	@SerializedName("cpfCnpj")
	@Expose
	private String cpfCnpj;
	@SerializedName("personType")
	@Expose
	private String personType;
	@SerializedName("deleted")
	@Expose
	private Boolean deleted;
	@SerializedName("additionalEmails")
	@Expose
	private String additionalEmails;
	@SerializedName("externalReference")
	@Expose
	private String externalReference;
	@SerializedName("notificationDisabled")
	@Expose
	private Boolean notificationDisabled;
	@SerializedName("city")
	@Expose
	private Integer city;
	@SerializedName("state")
	@Expose
	private String state;
	@SerializedName("country")
	@Expose
	private String country;
	@SerializedName("observations")
	@Expose
	private String observations;
	@SerializedName("groups")
	@Expose
	@Valid
	private Optional<List<Grupo>> groups;
}