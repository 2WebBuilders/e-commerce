package br.com.model.api_asaas.estrutura.parcelamento;

import java.util.Optional;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.Estorno;
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
public class ParcelamentoResponse {

@SerializedName("object")
@Expose
private String object;
@SerializedName("id")
@Expose
private String id;
@SerializedName("value")
@Expose
private Integer value;
@SerializedName("netValue")
@Expose
private Double netValue;
@SerializedName("paymentValue")
@Expose
private Integer paymentValue;
@SerializedName("installmentCount")
@Expose
private Integer installmentCount;
@SerializedName("billingType")
@Expose
private String billingType;
@SerializedName("paymentDate")
@Expose
private Object paymentDate;
@SerializedName("description")
@Expose
private String description;
@SerializedName("expirationDay")
@Expose
private Integer expirationDay;
@SerializedName("deleted")
@Expose
private Boolean deleted;
@SerializedName("dateCreated")
@Expose
private String dateCreated;
@SerializedName("customer")
@Expose
private String customer;
@SerializedName("paymentLink")
@Expose
private String paymentLink;
@SerializedName("transactionReceiptUrl")
@Expose
private Object transactionReceiptUrl;
@SerializedName("chargeback")
@Expose
@Valid
private Optional<Estorno> chargeback;

}
