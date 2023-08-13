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
public class Arquivo {

	@SerializedName("publicId")
	@Expose
	private String publicId;
	@SerializedName("originalName")
	@Expose
	private String originalName;
	@SerializedName("size")
	@Expose
	private Integer size;
	@SerializedName("extension")
	@Expose
	private String extension;
	@SerializedName("previewUrl")
	@Expose
	private String previewUrl;
	@SerializedName("downloadUrl")
	@Expose
	private String downloadUrl;

}
