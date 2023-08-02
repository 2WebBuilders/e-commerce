package br.com.model.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.model.entity.Usuario;
import br.com.model.exception.ResourceNotFoundException;
import br.com.model.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	public List<Usuario> buscaUsuarios() {
		return usuarioRepository.findAll();
	}

	public Usuario save(Usuario user) {
		return usuarioRepository.save(user);
	}

	public Optional<Usuario> findById(Long idUser) {
		return usuarioRepository.findById(idUser);
	}

	public ResponseEntity<Usuario> updateUser(Long userId, Usuario userDetails) throws ResourceNotFoundException {
		Usuario user = usuarioRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));
		user.setEmail(userDetails.getEmail());
		user.setNome(userDetails.getNome());

		user.setPassword(new UsuarioService().verificaSenha(userId, user.getPassword(), userDetails.getPassword()));

		final Usuario updatedUsuario = usuarioRepository.save(user);
		return ResponseEntity.ok(updatedUsuario);
	}

	//VALIDA A TROCAR DE SENHA
	public String verificaSenha(Long userId, String lastPassword, String newPassword) {
		try {
			if (!lastPassword.isBlank()) {
				Usuario user = usuarioRepository.findById(userId)
						.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));

				if (user.getPassword().equals(lastPassword))
					return newPassword;
				else
					new ResourceNotFoundException("Nao foi possivel alterar sua senha, tente novamente");

			}
		} catch (ResourceNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	public Boolean delete(Usuario employee) {
		return null;
	}

}
