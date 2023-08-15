package br.com.model.api_asaas.estrutura.infoConta;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.com.model.api_asaas.estrutura.auxiliar.taxas.AntecipacaoTaxa;
import br.com.model.api_asaas.estrutura.auxiliar.taxas.FaturaTaxa;
import br.com.model.api_asaas.estrutura.auxiliar.taxas.NotificacaoTaxa;
import br.com.model.api_asaas.estrutura.auxiliar.taxas.PagamentoTaxa;
import br.com.model.api_asaas.estrutura.auxiliar.taxas.RelatorioBureauCreditoTaxa;
import br.com.model.api_asaas.estrutura.auxiliar.taxas.TransferenciaTaxa;
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
public class TaxasContaResponse {

	@SerializedName("payment")
	@Expose
	@Valid
	private PagamentoTaxa payment;
	@SerializedName("transfer")
	@Expose
	@Valid
	private TransferenciaTaxa transfer;
	@SerializedName("notification")
	@Expose
	@Valid
	private NotificacaoTaxa notification;
	@SerializedName("creditBureauReport")
	@Expose
	@Valid
	private RelatorioBureauCreditoTaxa creditBureauReport;
	@SerializedName("invoice")
	@Expose
	@Valid
	private FaturaTaxa invoice;
	@SerializedName("anticipation")
	@Expose
	@Valid
	private AntecipacaoTaxa anticipation;

}