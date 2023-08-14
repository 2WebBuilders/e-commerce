
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
public class NotificacoesRequest {

	@SerializedName("id")
	@Expose
	public String id;
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

}