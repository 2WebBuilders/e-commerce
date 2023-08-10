package br.com.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "carrinho")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "codCarrinho")
public class Carrinho implements Serializable {
	
	private static final long serialVersionUID = 497787247268948306L;
	
	@Id
	@SequenceGenerator(name = "carrinho_seg_generetor", sequenceName = "carrinho_id_seg", allocationSize = 1)
	@GeneratedValue(generator = "carrinho_seg_generetor", strategy = GenerationType.IDENTITY)
	private Long codCarrinho;
	
	@OneToMany(mappedBy = "carrinho", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<Item> listItem;
	
	@OneToOne(mappedBy = "carrinho")
	@JsonIgnore
	private Pedido pedido;
	
	@NotBlank
	@Column(nullable = false)
	private BigDecimal subTotal;
	
	@NotBlank
	@Column(nullable = false)
	private BigDecimal total;

}
