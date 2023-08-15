package br.com.model.api_asaas.estrutura.extrato;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.enums.TiposLancamentos;
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
public class ExtratoResponse {

	@SerializedName("object")
	@Expose
	public String object;
	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("value")
	@Expose
	public Double value;
	@SerializedName("balance")
	@Expose
	public Double balance;
	@SerializedName("type")
	@Expose
	public TiposLancamentos type;
	@SerializedName("date")
	@Expose
	public String date;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("paymentId")
	@Expose
	public String paymentId;
	@SerializedName("transferId")
	@Expose
	public Object transferId;
	@SerializedName("anticipationId")
	@Expose
	public Object anticipationId;
	@SerializedName("billId")
	@Expose
	public Object billId;
	@SerializedName("invoiceId")
	@Expose
	public Object invoiceId;
	@SerializedName("paymentDunningId")
	@Expose
	public Object paymentDunningId;
	@SerializedName("creditBureauReportId")
	@Expose
	public Object creditBureauReportId;

}
