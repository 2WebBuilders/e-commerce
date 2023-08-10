package br.com.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.model.enums.StatusPagamento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "pedido")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "codPedido")
public class Pedido implements Serializable {

	private static final long serialVersionUID = -8896248707262313429L;
	
	@Id
	@SequenceGenerator(name = "pedido_seg_generetor", sequenceName = "pedido_id_seg", allocationSize = 1)
	@GeneratedValue(generator = "pedido_seg_generetor", strategy = GenerationType.IDENTITY)
	private Long codPedido;
	
	@OneToOne
	@JoinColumn(name = "codCarrinho", foreignKey = @ForeignKey(name = "FK_carrinho_id"))
	private Carrinho carrinho;
	
	@OneToOne
	@JoinColumn(name = "codConta", foreignKey = @ForeignKey(name = "FK_conta_id"))
	private Conta conta;
	
	@NotBlank
	@Column(nullable = false)
	private LocalDateTime dataPedido;
	
	@NotBlank
	@Column(nullable = false)
	private BigDecimal taxa;

	@Enumerated(EnumType.STRING)
	private StatusPagamento status;

	@NotBlank
	@Column(nullable = false)
	private BigDecimal total;

}
