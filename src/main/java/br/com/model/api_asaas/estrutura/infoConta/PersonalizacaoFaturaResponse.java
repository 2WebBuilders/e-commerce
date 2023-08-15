
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
public class PersonalizacaoFaturaResponse {

	@SerializedName("object")
	@Expose
	public String object;
	@SerializedName("logoBackgroundColor")
	@Expose
	public String logoBackgroundColor;
	@SerializedName("infoBackgroundColor")
	@Expose
	public String infoBackgroundColor;
	@SerializedName("fontColor")
	@Expose
	public String fontColor;
	@SerializedName("enabled")
	@Expose
	public Boolean enabled;
	@SerializedName("logoUrl")
	@Expose
	public String logoUrl;
	@SerializedName("observations")
	@Expose
	public String observations;
	@SerializedName("status")
	@Expose
	public String status;

}