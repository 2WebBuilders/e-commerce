package br.com.model.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.model.entity.Usuario;
import br.com.model.exception.ResourceNotFoundException;
import br.com.model.services.UsuarioService;

@RequestMapping(name = "user")
public class UsuarioController {

	@Autowired
	private UsuarioService serviceUsuario;

	@GetMapping
	public List<Usuario> getUser() {
		return serviceUsuario.buscaUsuarios();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Usuario> getEmployeeById(@PathVariable(value = "id") Long userId)
			throws ResourceNotFoundException {
		Usuario user = serviceUsuario.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this id :: " + userId));
		return ResponseEntity.ok().body(user);
	}

	@PostMapping("/user")
	public Usuario createUser(@Valid @RequestBody Usuario user) {
		return serviceUsuario.save(user);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Usuario> updateUsuario(@PathVariable(value = "id") Long userId,
			@Valid @RequestBody Usuario userDetails) throws ResourceNotFoundException {
		return serviceUsuario.updateUser(userId, userDetails);
	}
	
	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteUsuario(@PathVariable(value = "id") Long userId)
	  throws ResourceNotFoundException {
	    Usuario employee = serviceUsuario.findById(userId)
	      .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + userId));

	    serviceUsuario.delete(employee);
	    Map<String, Boolean> response = new HashMap<>();
	    response.put("deleted", Boolean.TRUE);
	    return response;
	}

}
