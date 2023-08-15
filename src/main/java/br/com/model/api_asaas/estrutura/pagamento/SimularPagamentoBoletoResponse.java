package br.com.model.api_asaas.estrutura.pagamento;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.InfBoletoBancario;
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
public class SimularPagamentoBoletoResponse {

	@SerializedName("minimumScheduleDate")
	@Expose
	public String minimumScheduleDate;
	@SerializedName("fee")
	@Expose
	public Integer fee;
	@SerializedName("bankSlipInfo")
	@Expose
	@Valid
	public InfBoletoBancario bankSlipInfo;

}