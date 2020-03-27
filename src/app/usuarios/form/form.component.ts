import { FormsModule } from '@angular/forms';
import { RouterModule, Router, ActivatedRoute } from '@angular/router';
import { UsuarioService } from './../usuario.service';
import { Usuario } from './../usuario';
import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import swal from 'sweetalert2';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html'
})
export class FormComponent implements OnInit {
  public title = 'Crear Usuario';
  public usuario: Usuario = new Usuario();

  constructor(private usuarioService: UsuarioService, private router: Router, private activatedRoute: ActivatedRoute ) { }

  ngOnInit(): void {
  }
  public register(): void {
    this.usuarioService.create(this.usuario).subscribe(
      usuario => {
        this.router.navigate(['/usuarios']);
        swal.fire('Usuario guardado', `Usuario ${usuario.numDoc} creado con exito`, 'success');
      }
    );
  }
  cargarUsuario(): void {
    this.activatedRoute.params.subscribe(params => {
      const usu = params['usu'];
      if (usu) {
        this.usuarioService.getUsuario(usu).subscribe ( (usuario) => this.usuario = usuario);
      }
    });
  }
  update(): void {
    this.usuarioService.update(this.usuario).subscribe(
      usuario => {
        this.router.navigate(['/usuarios']);
        swal.fire('Usuario actualizado', `Usuario ${usuario.numDoc} actualizado con exito`, 'success');
      }
    )
  }
}
