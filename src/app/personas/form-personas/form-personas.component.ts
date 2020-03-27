import { PersonaService } from './../persona.service';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule, Router } from '@angular/router';
import { Persona } from '../persona';
import swal from 'sweetalert2';
@Component({
  selector: 'app-form-personas',
  templateUrl: './form-personas.component.html'
})
export class FormPersonasComponent implements OnInit {
  public title = 'Crear Persona';
  public persona: Persona = new Persona();

  constructor(private personaService: PersonaService, private router: Router) {}

  ngOnInit(): void {
   // console.log(this.personaService.create());
  }
  public register(): void {
    this.personaService.create(this.persona).subscribe(
      persona => {
        this.router.navigate(['/personas']);
        swal.fire('Persona guardada', `Persona ${persona.nombre} registrada exitosamente!`, 'success');
      }
    );
  }

}
