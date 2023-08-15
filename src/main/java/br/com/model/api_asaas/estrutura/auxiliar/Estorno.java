package br.com.model.api_asaas.estrutura.auxiliar;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.enums.MotivoEstorno;
import br.com.model.api_asaas.estrutura.enums.SituacaoEstorno;
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
public class Estorno {

	@SerializedName("status")
	@Expose
	private SituacaoEstorno status;
	@SerializedName("reason")
	@Expose
	private MotivoEstorno reason;

}
