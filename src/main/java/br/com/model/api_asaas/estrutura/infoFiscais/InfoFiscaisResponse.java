package br.com.model.api_asaas.estrutura.infoFiscais;

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
public class InfoFiscaisResponse {

	@SerializedName("object")
	@Expose
	public String object;
	@SerializedName("simplesNacional")
	@Expose
	public Boolean simplesNacional;
	@SerializedName("rpsSerie")
	@Expose
	public String rpsSerie;
	@SerializedName("rpsNumber")
	@Expose
	public Integer rpsNumber;
	@SerializedName("loteNumber")
	@Expose
	public Integer loteNumber;
	@SerializedName("username")
	@Expose
	public String username;
	@SerializedName("passwordSent")
	@Expose
	public Boolean passwordSent;
	@SerializedName("accessTokenSent")
	@Expose
	public Boolean accessTokenSent;
	@SerializedName("certificateSent")
	@Expose
	public Boolean certificateSent;
	@SerializedName("specialTaxRegime")
	@Expose
	public String specialTaxRegime;
	@SerializedName("email")
	@Expose
	public String email;
	@SerializedName("serviceListItem")
	@Expose
	public Object serviceListItem;
	@SerializedName("cnae")
	@Expose
	public String cnae;
	@SerializedName("culturalProjectsPromoter")
	@Expose
	public Boolean culturalProjectsPromoter;
	@SerializedName("municipalInscription")
	@Expose
	public String municipalInscription;

}