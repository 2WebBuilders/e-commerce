package br.com.model.api_asaas.estrutura.pix;

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
public class QrCodeRequest {

	@SerializedName("addressKey")
	@Expose
	public String addressKey;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("format")
	@Expose
	public String format;
	@SerializedName("expirationDate")
	@Expose
	public String expirationDate;
	@SerializedName("expirationSeconds")
	@Expose
	public Object expirationSeconds;

}