package br.com.model.api_asaas.estrutura.cobranca;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.CobrancasGeradas;
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
public class LimiteQtsCobrancaResponse {

	@SerializedName("creation")
	@Expose
	@Valid
	private CobrancasGeradas creation;

}
