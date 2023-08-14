package br.com.model.api_asaas.estrutura.pagamento;

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
public class PagamentoBoletoRequest {

	@SerializedName("identificationField")
	@Expose
	public String identificationField;
	@SerializedName("scheduleDate")
	@Expose
	public String scheduleDate;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("discount")
	@Expose
	public Integer discount;
	@SerializedName("interest")
	@Expose
	public Integer interest;
	@SerializedName("fine")
	@Expose
	public Integer fine;
	@SerializedName("dueDate")
	@Expose
	public String dueDate;
	@SerializedName("value")
	@Expose
	public Integer value;

}