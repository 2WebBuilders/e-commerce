package br.com.model.api_asaas.estrutura.transferencia;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.DadosBanco;
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
public class TransferenciaContaDiferenteRequest {

	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("bankAccount")
	@Expose
	@Valid
	public DadosBanco bankAccount;
	@SerializedName("operationType")
	@Expose
	public String operationType;
	@SerializedName("pixAddressKey")
	@Expose
	public String pixAddressKey;
	@SerializedName("pixAddressKeyType")
	@Expose
	public String pixAddressKeyType;
	@SerializedName("scheduleDate")
	@Expose
	public String scheduleDate;
	@SerializedName("description")
	@Expose
	public String description;

}