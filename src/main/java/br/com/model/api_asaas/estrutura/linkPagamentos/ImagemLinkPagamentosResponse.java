package br.com.model.api_asaas.estrutura.linkPagamentos;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.Imagem;
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
public class ImagemLinkPagamentosResponse {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("main")
	@Expose
	public Boolean main;
	@SerializedName("image")
	@Expose
	@Valid
	public Imagem image;

}
