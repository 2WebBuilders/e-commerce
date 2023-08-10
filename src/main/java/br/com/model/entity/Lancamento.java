package br.com.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "lancamento")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "codLancamento")
public class Lancamento implements Serializable {
	
	private static final long serialVersionUID = 5833415756820424663L;

	@Id
	@SequenceGenerator(name = "lancamento_seg_generetor", sequenceName = "lancamento_id_seg", allocationSize = 1)
	@GeneratedValue(generator = "lancamento_seg_generetor", strategy = GenerationType.IDENTITY)
	private Long codLancamento;
	
	@NotBlank
	@Column(nullable = false)
	private LocalDateTime dataTransacao;
	
	@NotBlank
	@Column(nullable = false)
	private String tipoOperacao;
	
	@NotBlank
	@Column(nullable = false)
	private String descricao;
	
	@NotBlank
	@Column(nullable = false)
	private BigDecimal valor;
	
	@ManyToOne
	@JoinColumn(name = "codExtrato", foreignKey = @ForeignKey(name = "FK_extrato_id"))
	@JsonBackReference
	private Extrato extrato;

}
