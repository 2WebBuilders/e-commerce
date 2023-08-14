package br.com.model.api_asaas.estrutura.notificacoes;

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
public class NotificacoesResponse {

	@SerializedName("object")
	@Expose
	public String object;
	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("customer")
	@Expose
	public String customer;
	@SerializedName("enabled")
	@Expose
	public Boolean enabled;
	@SerializedName("emailEnabledForProvider")
	@Expose
	public Boolean emailEnabledForProvider;
	@SerializedName("smsEnabledForProvider")
	@Expose
	public Boolean smsEnabledForProvider;
	@SerializedName("emailEnabledForCustomer")
	@Expose
	public Boolean emailEnabledForCustomer;
	@SerializedName("smsEnabledForCustomer")
	@Expose
	public Boolean smsEnabledForCustomer;
	@SerializedName("phoneCallEnabledForCustomer")
	@Expose
	public Boolean phoneCallEnabledForCustomer;
	@SerializedName("whatsappEnabledForCustomer")
	@Expose
	public Boolean whatsappEnabledForCustomer;
	@SerializedName("event")
	@Expose
	public String event;
	@SerializedName("smsAllowedForProvider")
	@Expose
	public Boolean smsAllowedForProvider;
	@SerializedName("emailAllowedForProvider")
	@Expose
	public Boolean emailAllowedForProvider;
	@SerializedName("schedule")
	@Expose
	public String schedule;
	@SerializedName("updateBlocked")
	@Expose
	public Boolean updateBlocked;
	@SerializedName("scheduleOffset")
	@Expose
	public Integer scheduleOffset;
	@SerializedName("deleted")
	@Expose
	public Boolean deleted;

}
