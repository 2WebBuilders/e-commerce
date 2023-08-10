package br.com.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "conta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "codConta")
public class Conta implements Serializable {

	private static final long serialVersionUID = 491671084027579853L;
	
	@Id
	@SequenceGenerator(name = "conta_seg_generetor", sequenceName = "conta_id_seg", allocationSize = 1)
	@GeneratedValue(generator = "conta_seg_generetor", strategy = GenerationType.IDENTITY)
	private Long codConta;
	
	@OneToOne(mappedBy = "conta")
	@JsonIgnore
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name = "codExtrato", foreignKey = @ForeignKey(name = "FK_extrato_id"))
	private Extrato extrato;
	
	@OneToOne(mappedBy = "conta")
	@JsonIgnore
	private Pedido pedido;
	
	@NotBlank
	@Column(nullable = false)
	private BigDecimal saldo;


}
