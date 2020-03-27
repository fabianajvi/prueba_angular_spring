import { Router } from '@angular/router';
import { PerfilService } from './perfil.service';
import { Component, OnInit } from '@angular/core';
import { Perfil } from './perfil';

@Component({
  selector: 'app-perfiles',
  templateUrl: './perfiles.component.html'
})
export class PerfilesComponent implements OnInit {

  perfiles: Perfil[];
  constructor(private perfilService: PerfilService, private router: Router) { }

  ngOnInit(): void {
    this.perfilService.getPerfil().subscribe(
      perfil => this.perfiles = perfil
    );
  }

}
