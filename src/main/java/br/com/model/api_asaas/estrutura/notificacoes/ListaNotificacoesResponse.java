package br.com.model.api_asaas.estrutura.notificacoes;

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
public class ListaNotificacoesResponse {

	@SerializedName("notifications")
	@Expose
	@Valid
	public List<NotificacoesResponse> notifications;

}