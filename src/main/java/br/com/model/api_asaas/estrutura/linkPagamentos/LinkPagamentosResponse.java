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
public class LinkPagamentosResponse {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("name")
	@Expose
	public String name;
	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("active")
	@Expose
	public Boolean active;
	@SerializedName("chargeType")
	@Expose
	public String chargeType;
	@SerializedName("url")
	@Expose
	public String url;
	@SerializedName("billingType")
	@Expose
	public String billingType;
	@SerializedName("subscriptionCycle")
	@Expose
	public Object subscriptionCycle;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("endDate")
	@Expose
	public String endDate;
	@SerializedName("deleted")
	@Expose
	public Boolean deleted;
	@SerializedName("viewCount")
	@Expose
	public Integer viewCount;
	@SerializedName("maxInstallmentCount")
	@Expose
	public Integer maxInstallmentCount;
	@SerializedName("dueDateLimitDays")
	@Expose
	public Integer dueDateLimitDays;
	@SerializedName("notificationEnabled")
	@Expose
	public Boolean notificationEnabled;

}
