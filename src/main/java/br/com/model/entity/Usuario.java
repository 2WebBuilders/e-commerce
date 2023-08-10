package br.com.model.entity;

import java.io.Serializable;

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
@Table(name = "usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "codUsuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = -6790812289435529138L;
	
	@Id
	@SequenceGenerator(name = "usuario_seg_generetor", sequenceName = "usuario_id_seg", allocationSize = 1)
	@GeneratedValue(generator = "usuario_seg_generetor", strategy = GenerationType.IDENTITY)
	private Long codUsuario;
	
	@NotBlank
	@Column(nullable = false)
	private String nome;
	
	@NotBlank
	@Column(nullable = false)
	private String email;
	
	@NotBlank
	@Column(nullable = false)
	private String password;

	@OneToOne
	@JoinColumn(name = "codConta", foreignKey = @ForeignKey(name = "FK_conta_id"))
	private Conta conta;

}
