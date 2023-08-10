package br.com.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "extrato")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "codExtrato")
public class Extrato implements Serializable {

	private static final long serialVersionUID = 6819286773034260346L;
	
	@Id
	@SequenceGenerator(name = "extrato_seg_generetor", sequenceName = "extrato_id_seg", allocationSize = 1)
	@GeneratedValue(generator = "extrato_seg_generetor", strategy = GenerationType.IDENTITY)
	private Long codExtrato;
	
	@OneToMany(mappedBy = "extrato", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Lancamento> lancamentos;
	
	@NotBlank
	@Column(nullable = false)
	private BigDecimal saldoAtual;

}
