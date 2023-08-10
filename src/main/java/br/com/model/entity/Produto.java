package br.com.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name = "produto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "codProduto")
public class Produto implements Serializable {

	private static final long serialVersionUID = -2445516265379603870L;
	
	@Id
	@SequenceGenerator(name = "produto_seg_generetor", sequenceName = "produto_id_seg", allocationSize = 1)
	@GeneratedValue(generator = "produto_seg_generetor", strategy = GenerationType.IDENTITY)
	private Long codProduto;
	
	@NotBlank
	@Column(nullable = false)
	private String nome;
	
	@NotBlank
	@Column(nullable = false)
	private String descricao;
	
	@NotBlank
	@Column(nullable = false)
	private BigDecimal valor;
	
	@NotBlank
	@Column(nullable = false)
	private Integer qtsEstoque;
	
	@OneToOne(mappedBy = "produto")
	@JsonIgnore
	private Item item;

}
