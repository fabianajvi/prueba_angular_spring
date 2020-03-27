package com.co.samtel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.co.samtel.model.entity.Perfil;
import com.co.samtel.service.IPerfilService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class PerfilRestController {

	@Autowired
	IPerfilService perfilService;
	
	@GetMapping("/perfil")
	public List<Perfil> index(){
		return perfilService.findAll();
	}
	@GetMapping("/perfil/{codperfil}")
	public Perfil show(@PathVariable String codperfil) {
		return perfilService.findById(codperfil);
	}
	@PostMapping("/perfil")
	@ResponseStatus(HttpStatus.CREATED)
	public Perfil create(@RequestBody Perfil perfil) {
		return perfilService.save(perfil);
	}
}
