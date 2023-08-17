package br.com.model.api_asaas.estrutura.webhook;

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
public class ConfigWebHookRequest {

	@SerializedName("url")
	@Expose
	public String url;
	@SerializedName("email")
	@Expose
	public String email;
	@SerializedName("interrupted")
	@Expose
	public Boolean interrupted;
	@SerializedName("enabled")
	@Expose
	public Boolean enabled;
	@SerializedName("apiVersion")
	@Expose
	public Integer apiVersion;
	@SerializedName("authToken")
	@Expose
	public String authToken;

}