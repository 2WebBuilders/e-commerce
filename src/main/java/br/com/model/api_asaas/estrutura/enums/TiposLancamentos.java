package br.com.model.api_asaas.estrutura.enums;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@Generated("jsonschema2pojo")
public enum TiposLancamentos {

	@SerializedName("ASAAS_CARD_BALANCE_REFUND")
	ASAAS_CARD_BALANCE_REFUND ("Estorno de saldo do cartão prépago"),
	@SerializedName("ASAAS_CARD_RECHARGEASAAS_CARD_RECHARGE")
	ASAAS_CARD_RECHARGE ("Recarga do cartão"),
	@SerializedName("ASAAS_CARD_RECHARGE_REVERSAL")
	ASAAS_CARD_RECHARGE_REVERSAL ("Estorno da recarga do cartão"),
	@SerializedName("ASAAS_CARD_TRANSACTION")
	ASAAS_CARD_TRANSACTION ("Transação efetuada com o cartão"),
	@SerializedName("ASAAS_CARD_TRANSACTION_FEE")
	ASAAS_CARD_TRANSACTION_FEE  ("Taxa para transação efetuada com o cartão"),
	@SerializedName("ASAAS_CARD_TRANSACTION_FEE_REFUND")
	ASAAS_CARD_TRANSACTION_FEE_REFUND ("Estorno de taxa para transação efetuada com o cartão"),
	@SerializedName("ASAAS_CARD_TRANSACTION_PARTIAL_REFUND")
	ASAAS_CARD_TRANSACTION_PARTIAL_REFUND ("Estorno parcial de transação efetuada com o cartão"),
	@SerializedName("ASAAS_CARD_TRANSACTION_REFUND")
	ASAAS_CARD_TRANSACTION_REFUND ("Estorno de transação efetuada com o cartão"),
	@SerializedName("BILL_PAYMENT")
	BILL_PAYMENT ("Pagamento de conta"),
	@SerializedName("BILL_PAYMENT_CANCELLED")
	BILL_PAYMENT_CANCELLED ("Cancelamento do pagamento de conta"),
	@SerializedName("BILL_PAYMENT_FEE")
	BILL_PAYMENT_FEE ("Taxa de pagamento de conta"),
	@SerializedName("BILL_PAYMENT_FEE_CANCELLED")
	BILL_PAYMENT_FEE_CANCELLED ("Cancelamento da taxa de pagamento de conta"),
	@SerializedName("BILL_PAYMENT_REFUNDED")
	BILL_PAYMENT_REFUNDED ("Estorno de pagamento de conta"),
	@SerializedName("CANCEL_MOBILE_PHONE_RECHARGE")
	CANCEL_MOBILE_PHONE_RECHARGE ("Cancelamento de recarga de celular"),
	@SerializedName("CHARGEBACK")
	CHARGEBACK ("Bloqueio de saldo devido ao chargeback da cobrança"),
	@SerializedName("CHARGEBACK_REVERSAL")
	CHARGEBACK_REVERSAL ("Cancelamento do bloqueio de saldo devido ao chargeback cobrança"),
	@SerializedName("CHARGED_FEE_REFUND")
	CHARGED_FEE_REFUND ("Estorno da taxa para negativação da cobrança ou Pix"),
	@SerializedName("CONTRACTUAL_EFFECT_SETTLEMENT")
	CONTRACTUAL_EFFECT_SETTLEMENT ("Valor em recebíveis reservado"),
	@SerializedName("CONTRACTUAL_EFFECT_SETTLEMENT_REVERSAL")
	CONTRACTUAL_EFFECT_SETTLEMENT_REVERSAL ("Estorno do valor em recebíveis reservado"),
	@SerializedName("CREDIT")
	CREDIT ("Crédito manual"),
	@SerializedName("CREDIT_BUREAU_REPORT")
	CREDIT_BUREAU_REPORT ("Taxa de consulta Serasa"),
	@SerializedName("CUSTOMER_COMMISSION_CHECKOUT")
	CUSTOMER_COMMISSION_CHECKOUT ("Saque de comissão"),
	@SerializedName("DEBIT")
	DEBIT ("Bloqueio de saldo"),
	@SerializedName("DEBIT_REVERSAL")
	DEBIT_REVERSAL ("Desbloqueio de saldo"),
	@SerializedName("DEBT_RECOVERY_NEGOTIATION_FINANCIAL_CHARGES")
	DEBT_RECOVERY_NEGOTIATION_FINANCIAL_CHARGES ("Encargos sobre renegociação referente a fatura"),
	@SerializedName("FREE_PAYMENT_USE")
	FREE_PAYMENT_USE ("Estorno por campanha promocional na tarifa da fatura"),
	@SerializedName("INSTANT_TEXT_MESSAGE_FEE")
	INSTANT_TEXT_MESSAGE_FEE ("Taxa de notificação por WhatsApp da cobrança"),
	@SerializedName("INTERNAL_TRANSFER_CREDIT")
	INTERNAL_TRANSFER_CREDIT ("Transferência da conta Asaas"),
	@SerializedName("INTERNAL_TRANSFER_DEBIT")
	INTERNAL_TRANSFER_DEBIT ("Transferência para a conta Asaas"),
	@SerializedName("INTERNAL_TRANSFER_REVERSAL")
	INTERNAL_TRANSFER_REVERSAL ("Estorno de transferência interna"),
	@SerializedName("INVOICE_FEE")
	INVOICE_FEE ("Taxa de emissão de nota fiscal"),
	@SerializedName("MOBILE_PHONE_RECHARGE")
	MOBILE_PHONE_RECHARGE ("Recarga de celular"),
	@SerializedName("PARTIAL_PAYMENT")
	PARTIAL_PAYMENT ("Cobrança parcialmente recebida"),
	@SerializedName("PAYMENT_DUNNING_CANCELLATION_FEE")
	PAYMENT_DUNNING_CANCELLATION_FEE ("Taxa para cancelamento de negativação da cobrança"),
	@SerializedName("PAYMENT_DUNNING_RECEIVED_FEE")
	PAYMENT_DUNNING_RECEIVED_FEE ("Taxa para negativação da cobrança"),
	@SerializedName("PAYMENT_DUNNING_RECEIVED_IN_CASH_FEE")
	PAYMENT_DUNNING_RECEIVED_IN_CASH_FEE ("Taxa para negativação em dinheiro da cobrança"),
	@SerializedName("PAYMENT_DUNNING_REQUEST_FEE")
	PAYMENT_DUNNING_REQUEST_FEE ("Taxa para negativação da cobrança"),
	@SerializedName("PAYMENT_FEE")
	PAYMENT_FEE ("Taxa da cobrança"),
	@SerializedName("PAYMENT_FEE_REVERSAL")
	PAYMENT_FEE_REVERSAL ("Estorno da taxa da cobrança"),
	@SerializedName("PAYMENT_MESSAGING_NOTIFICATION_FEE")
	PAYMENT_MESSAGING_NOTIFICATION_FEE ("Taxa de mensageria da cobrança"),
	@SerializedName("PAYMENT_RECEIVED")
	PAYMENT_RECEIVED ("Cobrança recebida"),
	@SerializedName("PAYMENT_REFUND_CANCELLED")
	PAYMENT_REFUND_CANCELLED ("Cancelamento do estorno da cobrança"),
	@SerializedName("PAYMENT_REVERSAL")
	PAYMENT_REVERSAL ("Estorno da cobrança"),
	@SerializedName("PAYMENT_SMS_NOTIFICATION_FEE")
	PAYMENT_SMS_NOTIFICATION_FEE ("Taxa de notificação por SMS da cobrança"),
	@SerializedName("PHONE_CALL_NOTIFICATION_FEE")
	PHONE_CALL_NOTIFICATION_FEE ("Taxa de notificação por voz da fatura"),
	@SerializedName("PIX_TRANSACTION_DEBIT_REFUND")
	PIX_TRANSACTION_DEBIT_REFUND ("Estorno de transação via Pix"),
	@SerializedName("POSTAL_SERVICE_FEE")
	POSTAL_SERVICE_FEE ("Taxa de envio de boleto via Correios"),
	@SerializedName("PRODUCT_INVOICE_FEE")
	PRODUCT_INVOICE_FEE ("Taxa de emissão de nota fiscal de produto"),
	@SerializedName("PROMOTIONAL_CODE_CREDIT")
	PROMOTIONAL_CODE_CREDIT ("Desconto na tarifa da fatura"),
	@SerializedName("PROMOTIONAL_CODE_DEBIT")
	PROMOTIONAL_CODE_DEBIT ("Estorno do desconto na tarifa da fatura"),
	@SerializedName("RECEIVABLE_ANTICIPATION_CREDIT")
	RECEIVABLE_ANTICIPATION_CREDIT ("Antecipação da cobrança/parcelamento"),
	@SerializedName("RECEIVABLE_ANTICIPATION_DEBIT")
	RECEIVABLE_ANTICIPATION_DEBIT ("Baixa da antecipação da cobrança/parcelamento"),
	@SerializedName("RECEIVABLE_ANTICIPATION_FEE")
	RECEIVABLE_ANTICIPATION_FEE ("Taxa de antecipação da cobrança/parcelamento"),
	@SerializedName("REFUND_MOBILE_PHONE_RECHARGE")
	REFUND_MOBILE_PHONE_RECHARGE ("Estorno de recarga de celular"),
	@SerializedName("REFUND_REQUEST_CANCELLED")
	REFUND_REQUEST_CANCELLED ("Cancelamento do estorno da cobrança"),
	@SerializedName("REFUND_REQUEST_FEE")
	REFUND_REQUEST_FEE ("Taxa de realização de estorno da fatura"),
	@SerializedName("REFUND_REQUEST_FEE_REVERSAL")
	REFUND_REQUEST_FEE_REVERSAL ("Cancelamento da taxa de realização de estorno da fatura"),
	@SerializedName("TRANSFER")
	TRANSFER ("Transferência via TED ou Pix"),
	@SerializedName("TRANSFER_FEE")
	TRANSFER_FEE ("Taxa de transferência via TED ou Pix");
	
	private final String tipo;
	private final static Map<String, TiposLancamentos> CONSTANTS = new HashMap<String, TiposLancamentos>();

	static {
		for (TiposLancamentos c : values()) {
			CONSTANTS.put(c.getTipo(), c);
		}
	}

	public static TiposLancamentos fromValue(String tipo) {
		TiposLancamentos constant = CONSTANTS.get(tipo);
		if (constant == null) {
			throw new IllegalArgumentException(tipo);
		} else {
			return constant;
		}
	}

}
