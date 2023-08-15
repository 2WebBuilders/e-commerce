package br.com.model.api_asaas.estrutura.auxiliar;

import java.util.Optional;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.enums.SituacaoRateio;
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
public class Rateio {

	@SerializedName("walletId")
	@Expose
	private String walletId;
	@SerializedName("fixedValue")
	@Expose
	private Optional<Integer> fixedValue;
	@SerializedName("totalFixedValue")
	@Expose
	private Optional<Integer> totalFixedValue;
	@SerializedName("status")
	@Expose
	private SituacaoRateio status;
	@SerializedName("refusalReason")
	@Expose
	private Optional<Object> refusalReason;
	@SerializedName("percentualValue")
	@Expose
	private Optional<Integer> percentualValue;

}
