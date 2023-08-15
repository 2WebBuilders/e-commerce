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
public class QrCodeResponse {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("encodedImage")
	@Expose
	public String encodedImage;
	@SerializedName("payload")
	@Expose
	public String payload;
	@SerializedName("expirationDate")
	@Expose
	public String expirationDate;

}
