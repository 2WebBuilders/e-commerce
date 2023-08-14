package br.com.model.api_asaas.estrutura.auxiliar;

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
public class Imagem {

	@SerializedName("originalName")
	@Expose
	public String originalName;
	@SerializedName("size")
	@Expose
	public Integer size;
	@SerializedName("extension")
	@Expose
	public String extension;
	@SerializedName("previewUrl")
	@Expose
	public String previewUrl;
	@SerializedName("downloadUrl")
	@Expose
	public String downloadUrl;

}