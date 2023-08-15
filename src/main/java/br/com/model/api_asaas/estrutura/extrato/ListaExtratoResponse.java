package br.com.model.api_asaas.estrutura.extrato;

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
public class ListaExtratoResponse {

	@SerializedName("object")
	@Expose
	public String object;
	@SerializedName("hasMore")
	@Expose
	public Boolean hasMore;
	@SerializedName("totalCount")
	@Expose
	public Integer totalCount;
	@SerializedName("limit")
	@Expose
	public Integer limit;
	@SerializedName("offset")
	@Expose
	public Integer offset;
	@SerializedName("data")
	@Expose
	@Valid
	public List<ExtratoResponse> data;

}