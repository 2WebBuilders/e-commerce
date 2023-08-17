package br.com.model.api_asaas.estrutura.excluido;

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
public class ExcluidoGenericoResponse {

	@SerializedName("deleted")
	@Expose
	private Boolean deleted;
	@SerializedName("id")
	@Expose
	private String id;

}
