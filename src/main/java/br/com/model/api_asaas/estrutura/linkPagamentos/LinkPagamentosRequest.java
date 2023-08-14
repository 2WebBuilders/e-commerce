package br.com.model.api_asaas.estrutura.linkPagamentos;

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
public class LinkPagamentosRequest {

	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("endDate")
	@Expose
	public String endDate;
	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("active")
	@Expose
	public Boolean active;
	@SerializedName("billingType")
	@Expose
	public String billingType;
	@SerializedName("chargeType")
	@Expose
	public String chargeType;
	@SerializedName("dueDateLimitDays")
	@Expose
	public Integer dueDateLimitDays;
	@SerializedName("subscriptionCycle")
	@Expose
	public Object subscriptionCycle;
	@SerializedName("maxInstallmentCount")
	@Expose
	public Integer maxInstallmentCount;
	@SerializedName("notificationEnabled")
	@Expose
	public Boolean notificationEnabled;

}