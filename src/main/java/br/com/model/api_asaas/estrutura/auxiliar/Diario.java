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
public class Diario {

	@SerializedName("limit")
	@Expose
	private Integer limit;
	@SerializedName("used")
	@Expose
	private Integer used;
	@SerializedName("wasReached")
	@Expose
	private Boolean wasReached;

}
