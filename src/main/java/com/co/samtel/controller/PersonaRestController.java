package com.co.samtel.controller;

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

import com.co.samtel.model.entity.Persona;
import com.co.samtel.service.IPersonaService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/api")
public class PersonaRestController {

	@Autowired
	IPersonaService personaService;

	@GetMapping("/personas")
	public List<Persona> index() {
		return personaService.findAll();
	}

	@GetMapping("/personas/{numdoc}")
	public Persona show(@PathVariable String numdoc) {
		return personaService.findById(numdoc);
	}

	@PostMapping("/personas")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona create(@RequestBody Persona persona) {
		return personaService.save(persona);
	}
	@PutMapping("/personas/{numdoc}")
	@ResponseStatus(HttpStatus.CREATED)
	public Persona update (@RequestBody Persona persona, @PathVariable String numdoc) {
		Persona personaActual = personaService.findById(numdoc);
		personaActual.setNumdoc(persona.getNumdoc());
		personaActual.setFechaNacimiento(persona.getFechaNacimiento());
		personaActual.setEdad(persona.getEdad());
		personaActual.setDescripcion(persona.getDescripcion());
		personaActual.setEmail(persona.getEmail());
		personaActual.setNombre(persona.getNombre());
		personaActual.setSalario(persona.getSalario());
		personaActual.setTipoDoc(persona.getTipoDoc());
		return personaService.save(personaActual);
	}
	@DeleteMapping("/personas/{numdoc}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete (@PathVariable String numdoc) {
		personaService.delete(numdoc);
	}

}
