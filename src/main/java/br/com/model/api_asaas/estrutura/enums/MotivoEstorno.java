package br.com.model.api_asaas.estrutura.enums;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Generated("jsonschema2pojo")
public enum MotivoEstorno {

	@SerializedName("ABSENCE_OF_PRINT")
	ABSENCE_OF_PRINT ("Ausência de impressão"),
	@SerializedName("ABSENT_CARD_FRAUD")
	ABSENT_CARD_FRAUD ("Fraude em ambiente de cartão não presente"),
	@SerializedName("CARD_ACTIVATED_PHONE_TRANSACTION")
	CARD_ACTIVATED_PHONE_TRANSACTION ("Transação telefônica ativada por cartão"),
	@SerializedName("CARD_FRAUD")
	CARD_FRAUD ("Fraude em ambiente de cartão presente"),
	@SerializedName("CARD_RECOVERY_BULLETIN")
	CARD_RECOVERY_BULLETIN ("Boletim de negativação de cartões"),
	@SerializedName("COMMERCIAL_DISAGREEMENT")
	COMMERCIAL_DISAGREEMENT ("Desacordo comercial"),
	@SerializedName("COPY_NOT_RECEIVED")
	COPY_NOT_RECEIVED ("Cópia não atendida"),
	@SerializedName("CREDIT_OR_DEBIT_PRESENTATION_ERROR")
	CREDIT_OR_DEBIT_PRESENTATION_ERROR ("Erro de apresentação de crédito / débito"),
	@SerializedName("DIFFERENT_PAY_METHOD")
	DIFFERENT_PAY_METHOD ("Pagamento por outros meios"),
	@SerializedName("FRAUD")
	FRAUD ("Sem autorização do portador do cartão"),
	@SerializedName("INCORRECT_TRANSACTION_VALUE")
	INCORRECT_TRANSACTION_VALUE ("Valor da transação é diferente"),
	@SerializedName("INVALID_CURRENCY")
	INVALID_CURRENCY ("Moeda inválida"),
	@SerializedName("INVALID_DATA")
	INVALID_DATA ("Dados inválidos"),
	@SerializedName("LATE_PRESENTATION")
	LATE_PRESENTATION ("Apresentação tardia"),
	@SerializedName("LOCAL_REGULATORY_OR_LEGAL_DISPUTE")
	LOCAL_REGULATORY_OR_LEGAL_DISPUTE ("Contestação regulatória / legal local"),
	@SerializedName("MULTIPLE_ROCS")
	MULTIPLE_ROCS ("ROCs múltiplos"),
	@SerializedName("ORIGINAL_CREDIT_TRANSACTION_NOT_ACCEPTED")
	ORIGINAL_CREDIT_TRANSACTION_NOT_ACCEPTED ("Transação de crédito original não aceita"),
	@SerializedName("OTHER_ABSENT_CARD_FRAUD")
	OTHER_ABSENT_CARD_FRAUD ("Outras fraudes  Cartão ausente"),
	@SerializedName("PROCESS_ERROR")
	PROCESS_ERROR ("Erro de processamento"),
	@SerializedName("RECEIVED_COPY_ILLEGIBLE_OR_INCOMPLETE")
	RECEIVED_COPY_ILLEGIBLE_OR_INCOMPLETE ("Cópia atendida ilegível / incompleta"),
	@SerializedName("RECURRENCE_CANCELED")
	RECURRENCE_CANCELED ("Recorrência cancelada"),
	@SerializedName("REQUIRED_AUTHORIZATION_NOT_GRANTED")
	REQUIRED_AUTHORIZATION_NOT_GRANTED ("Autorização requerida não obtida"),
	@SerializedName("RIGHT_OF_FULL_RECOURSE_FOR_FRAUD")
	RIGHT_OF_FULL_RECOURSE_FOR_FRAUD ("Direito de regresso integral por fraude"),
	@SerializedName("SALE_CANCELED")
	SALE_CANCELED ("Mercadoria / serviços cancelado"),
	@SerializedName("SERVICE_DISAGREEMENT_OR_DEFECTIVE_PRODUCT")
	SERVICE_DISAGREEMENT_OR_DEFECTIVE_PRODUCT ("Mercadoria / serviço com defeito ou em desacordo"),
	@SerializedName("SERVICE_NOT_RECEIVED")
	SERVICE_NOT_RECEIVED ("Mercadoria / serviços não recebidos"),
	@SerializedName("SPLIT_SALE")
	SPLIT_SALE ("Desmembramento de venda"),
	@SerializedName("TRANSFERS_OF_DIVERSE_RESPONSIBILITIES")
	TRANSFERS_OF_DIVERSE_RESPONSIBILITIES ("Transf. de responsabilidades diversas"),
	@SerializedName("UNQUALIFIED_CAR_RENTAL_DEBIT")
	UNQUALIFIED_CAR_RENTAL_DEBIT ("Débito de aluguel de carro não qualificado"),
	@SerializedName("USA_CARDHOLDER_DISPUTE")
	USA_CARDHOLDER_DISPUTE ("Contestação do portador de cartão (EUA)"),
	@SerializedName("VISA_FRAUD_MONITORING_PROGRAM")
	VISA_FRAUD_MONITORING_PROGRAM ("Programa Visa de monitoramento de fraude"),
	@SerializedName("WARNING_BULLETIN_FILE")
	WARNING_BULLETIN_FILE ("Arquivo boletim de advertência");

	private String motivo;
	private final static Map<String, MotivoEstorno> CONSTANTS = new HashMap<String, MotivoEstorno>();

	static {
		for (MotivoEstorno c : values()) {
			CONSTANTS.put(c.getMotivo(), c);
		}
	}

	public static MotivoEstorno fromValue(String motivo) {
		MotivoEstorno constant = CONSTANTS.get(motivo);
		if (constant == null) {
			throw new IllegalArgumentException(motivo);
		} else {
			return constant;
		}
	}
}
