package br.com.model.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "item")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "codItem")
public class Item implements Serializable {

	private static final long serialVersionUID = -8160501135961114322L;
	
	@Id
	@SequenceGenerator(name = "item_seg_generetor", sequenceName = "item_id_seg", allocationSize = 1)
	@GeneratedValue(generator = "item_seg_generetor", strategy = GenerationType.IDENTITY)
	private Long codItem;
	
	@NotBlank
	@Column(nullable = false)
	private Integer qtsProdutos;

	@OneToOne
	@JoinColumn(name = "codProduto", foreignKey = @ForeignKey(name = "FK_Produto_id"))
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name = "codCarrinho", foreignKey = @ForeignKey(name = "FK_carrinho_id"))
	@JsonBackReference
	private Carrinho carrinho;
}
