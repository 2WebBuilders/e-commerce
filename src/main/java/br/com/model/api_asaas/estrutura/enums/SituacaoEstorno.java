package br.com.model.api_asaas.estrutura.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum SituacaoEstorno {

	REQUESTED ("Estorno solicitado"),
	PENDING ("Estorno pendente"),
	CANCELLED ("Cancelado"),
	IN_DISPUTE ("Em Disputa"), 
	DISPUTE_LOST ("Disputa Perdida"), 
	REVERSED ("Estornado"), 
	DONE ("Concluído");

	private String situacao;

}
