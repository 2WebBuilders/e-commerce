package br.com.model.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "administrador")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "codAdministrador")
public class Administrador implements Serializable {

	private static final long serialVersionUID = 1588993797149289893L;

	@Id
	@SequenceGenerator(name = "administrador_seg_administrador", sequenceName = "administrador_id_seg", allocationSize = 1)
	@GeneratedValue(generator = "administrador_seg_administrador", strategy = GenerationType.IDENTITY)
	private Long codAdministrador;

	private String nome;
	private String password;
	private String email;
	private String tokenBancoAssas;
	private String chavePix;
	private String cobrancas;

}
