package br.com.model.api_asaas.estrutura.recargaCelular;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.OpcoesRecargaCelular;
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
public class ProvedorListaOpcoesRecargaCelularResponse {

	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("values")
	@Expose
	@Valid
	public List<OpcoesRecargaCelular> values;

}