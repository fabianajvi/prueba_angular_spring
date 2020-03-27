import { PersonaService } from './persona.service';
import { Component, OnInit } from '@angular/core';
import { Persona } from './persona';

@Component({
  selector: 'app-personas',
  templateUrl: './personas.component.html'
})
export class PersonasComponent implements OnInit {

  personas: Persona[];
  constructor(private personaService: PersonaService) { }

  ngOnInit(): void {
    this.personaService.getPersonas().subscribe(
      persona => this.personas = persona
    );
  }

}
