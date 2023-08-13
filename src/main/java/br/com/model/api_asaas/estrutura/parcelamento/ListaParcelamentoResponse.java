package br.com.model.api_asaas.estrutura.parcelamento;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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
public class ListaParcelamentoResponse {

	@SerializedName("object")
	@Expose
	private String object;
	@SerializedName("hasMore")
	@Expose
	private Boolean hasMore;
	@SerializedName("totalCount")
	@Expose
	private Integer totalCount;
	@SerializedName("limit")
	@Expose
	private Integer limit;
	@SerializedName("offset")
	@Expose
	private Integer offset;
	@SerializedName("data")
	@Expose
	@Valid
	private List<ParcelamentoResponse> data;

}
