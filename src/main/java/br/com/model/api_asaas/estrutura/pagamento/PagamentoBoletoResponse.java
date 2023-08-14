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
public class PagamentoBoletoResponse {

	@SerializedName("object")
	@Expose
	public String object;
	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("status")
	@Expose
	public String status;
	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("discount")
	@Expose
	public Integer discount;
	@SerializedName("interest")
	@Expose
	public Integer interest;
	@SerializedName("fine")
	@Expose
	public Integer fine;
	@SerializedName("identificationField")
	@Expose
	public String identificationField;
	@SerializedName("dueDate")
	@Expose
	public String dueDate;
	@SerializedName("scheduleDate")
	@Expose
	public String scheduleDate;
	@SerializedName("paymentDate")
	@Expose
	public Object paymentDate;
	@SerializedName("fee")
	@Expose
	public Integer fee;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("companyName")
	@Expose
	public Object companyName;
	@SerializedName("transactionReceiptUrl")
	@Expose
	public String transactionReceiptUrl;
	@SerializedName("canBeCancelled")
	@Expose
	public Boolean canBeCancelled;
	@SerializedName("failReasons")
	@Expose
	public Object failReasons;

}