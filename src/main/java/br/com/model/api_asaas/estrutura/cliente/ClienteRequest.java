package br.com.model.api_asaas.estrutura.cliente;

import java.util.Optional;

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
public class ClienteRequest {

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
	@SerializedName("cpfCnpj")
	@Expose
	private String cpfCnpj;
	@SerializedName("postalCode")
	@Expose
	private String postalCode;
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
	@SerializedName("externalReference")
	@Expose
	private String externalReference;
	@SerializedName("notificationDisabled")
	@Expose
	private Boolean notificationDisabled;
	@SerializedName("additionalEmails")
	@Expose
	private String additionalEmails;
	@SerializedName("municipalInscription")
	@Expose
	private String municipalInscription;
	@SerializedName("stateInscription")
	@Expose
	private String stateInscription;
	@SerializedName("observations")
	@Expose
	private String observations;
	@SerializedName("groupName")
	@Expose
	private Optional<String> groupName;
	@SerializedName("company")
	@Expose
	private Optional<String> company;

}