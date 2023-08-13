package br.com.model.api_asaas.estrutura.webhook;

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
public class WebHookResponse {

@SerializedName("event")
@Expose
private String event;
@SerializedName("payment")
@Expose
@Valid
private PagamentoResponse payment;

}
