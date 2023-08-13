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
public class NotificacaoCliente {

	@SerializedName("object")
	@Expose
	private String object;
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("customer")
	@Expose
	private String customer;
	@SerializedName("enabled")
	@Expose
	private Boolean enabled;
	@SerializedName("emailEnabledForProvider")
	@Expose
	private Boolean emailEnabledForProvider;
	@SerializedName("smsEnabledForProvider")
	@Expose
	private Boolean smsEnabledForProvider;
	@SerializedName("emailEnabledForCustomer")
	@Expose
	private Boolean emailEnabledForCustomer;
	@SerializedName("smsEnabledForCustomer")
	@Expose
	private Boolean smsEnabledForCustomer;
	@SerializedName("phoneCallEnabledForCustomer")
	@Expose
	private Boolean phoneCallEnabledForCustomer;
	@SerializedName("whatsappEnabledForCustomer")
	@Expose
	private Boolean whatsappEnabledForCustomer;
	@SerializedName("event")
	@Expose
	private String event;
	@SerializedName("scheduleOffset")
	@Expose
	private Integer scheduleOffset;
	@SerializedName("deleted")
	@Expose
	private Boolean deleted;
	
}