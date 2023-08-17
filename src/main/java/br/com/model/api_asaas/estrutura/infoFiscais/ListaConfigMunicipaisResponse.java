package br.com.model.api_asaas.estrutura.infoFiscais;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.RegimeEspecialTributacao;
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
public class ListaConfigMunicipaisResponse {

	@SerializedName("authenticationType")
	@Expose
	public String authenticationType;
	@SerializedName("supportsCancellation")
	@Expose
	public Boolean supportsCancellation;
	@SerializedName("usesSpecialTaxRegimes")
	@Expose
	public Boolean usesSpecialTaxRegimes;
	@SerializedName("usesServiceListItem")
	@Expose
	public Boolean usesServiceListItem;
	@SerializedName("specialTaxRegimesList")
	@Expose
	@Valid
	public List<RegimeEspecialTributacao> specialTaxRegimesList;
	@SerializedName("municipalInscriptionHelp")
	@Expose
	public String municipalInscriptionHelp;
	@SerializedName("specialTaxRegimeHelp")
	@Expose
	public String specialTaxRegimeHelp;
	@SerializedName("serviceListItemHelp")
	@Expose
	public String serviceListItemHelp;
	@SerializedName("digitalCertificatedHelp")
	@Expose
	public String digitalCertificatedHelp;
	@SerializedName("accessTokenHelp")
	@Expose
	public Object accessTokenHelp;
	@SerializedName("municipalServiceCodeHelp")
	@Expose
	public String municipalServiceCodeHelp;

}