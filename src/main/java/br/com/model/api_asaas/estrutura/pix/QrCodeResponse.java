package br.com.model.api_asaas.estrutura.pix;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.Beneficiário;
import br.com.model.api_asaas.estrutura.auxiliar.Pagador;
import br.com.model.api_asaas.estrutura.auxiliar.QrCode;
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
public class QrCodeResponse {

	@SerializedName("id")
	@Expose
	public String id;
	@SerializedName("payload")
	@Expose
	public String payload;
	@SerializedName("type")
	@Expose
	public String type;
	@SerializedName("encodedImage")
	@Expose
	public String encodedImage;
	@SerializedName("transactionOriginType")
	@Expose
	public String transactionOriginType;
	@SerializedName("pixKey")
	@Expose
	public String pixKey;
	@SerializedName("conciliationIdentifier")
	@Expose
	public String conciliationIdentifier;
	@SerializedName("endToEndIdentifier")
	@Expose
	public String endToEndIdentifier;
	@SerializedName("dueDate")
	@Expose
	public String dueDate;
	@SerializedName("expirationDate")
	@Expose
	public String expirationDate;
	@SerializedName("finality")
	@Expose
	public String finality;
	@SerializedName("value")
	@Expose
	public Integer value;
	@SerializedName("refundedValue")
	@Expose
	public Integer refundedValue;
	@SerializedName("status")
	@Expose
	public String status;
	@SerializedName("originType")
	@Expose
	public String originType;
	@SerializedName("originalTransaction")
	@Expose
	public String originalTransaction;
	@SerializedName("canBeCanceled")
	@Expose
	public Boolean canBeCanceled;
	@SerializedName("refusalReason")
	@Expose
	public String refusalReason;
	@SerializedName("effectiveDate")
	@Expose
	public String effectiveDate;
	@SerializedName("externalAccount")
	@Expose
	public Beneficiário externalAccount;
	@SerializedName("qrCode")
	@Expose
	@Valid
	public QrCode qrCode;
	@SerializedName("scheduledDate")
	@Expose
	public String scheduledDate;
	@SerializedName("changeValue")
	@Expose
	public Integer changeValue;
	@SerializedName("interest")
	@Expose
	public Integer interest;
	@SerializedName("fine")
	@Expose
	public Integer fine;
	@SerializedName("discount")
	@Expose
	public Integer discount;
	@SerializedName("totalValue")
	@Expose
	public Integer totalValue;
	@SerializedName("canBePaidWithDifferentValue")
	@Expose
	public Boolean canBePaidWithDifferentValue;
	@SerializedName("canBeModifyChangeValue")
	@Expose
	public Boolean canBeModifyChangeValue;
	@SerializedName("receiver")
	@Expose
	@Valid
	public Beneficiário receiver;
	@SerializedName("payer")
	@Expose
	@Valid
	public Pagador payer;
	@SerializedName("description")
	@Expose
	public String description;
	@SerializedName("canBePaid")
	@Expose
	public Boolean canBePaid;
	@SerializedName("cannotBePaidReason")
	@Expose
	public Object cannotBePaidReason;
	@SerializedName("payment")
	@Expose
	public String payment;

}
