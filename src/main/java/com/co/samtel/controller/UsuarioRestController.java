package com.co.samtel.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.co.samtel.model.entity.Usuario;
import com.co.samtel.service.IUsuarioService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class UsuarioRestController {

	@Autowired
	IUsuarioService usuarioService;

	@GetMapping("/usuarios")
	public List<Usuario> index() {
		return usuarioService.findAll();
	}

	@GetMapping("/usuarios/{usuario}")
	public Usuario show(@PathVariable String usuario) {
		return usuarioService.findById(usuario);
	}

	@PostMapping("/usuarios")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@PutMapping("/usuarios/{usuario}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usu, @PathVariable String usuario) {
		Usuario usuarioActual = usuarioService.findById(usuario);
		usuarioActual.setUsuario(usu.getUsuario());
		usuarioActual.setNumdoc(usu.getNumdoc());
		usuarioActual.setPerfil(usu.getPerfil());
		usuarioActual.setFechaCreacion(usu.getFechaCreacion());
		usuarioActual.setFechaModificacion(new Date());
		usuarioActual.setHabilitado(usu.isHabilitado());
		return usuarioService.save(usuarioActual);
	}
	@DeleteMapping ("usuarios/{usuario}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable String usuario) {
		usuarioService.delete(usuario);
	}
}
