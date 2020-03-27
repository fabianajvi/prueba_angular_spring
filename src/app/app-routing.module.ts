import { PerfilesComponent } from './perfiles/perfiles.component';
import { FormPersonasComponent } from './personas/form-personas/form-personas.component';
import { PersonasComponent } from './personas/personas.component';
import { UsuarioService } from './usuarios/usuario.service';
import { FormComponent } from './usuarios/form/form.component';
import { UsuariosComponent } from './usuarios/usuarios.component';
import { NgModule, ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
const routes: Routes = [
  {path: '', component: UsuariosComponent},
  {path: '', redirectTo: 'usuarios',  pathMatch: 'full'},
  {path: 'usuarios', component: UsuariosComponent},
  {path: 'personas', component: PersonasComponent},
  {path: 'cargarUsuario/:usu', component: FormComponent},
  {path: 'registroPersona', component: FormPersonasComponent},
  {path: 'perfil', component: PerfilesComponent},
  {path: '**', component: UsuariosComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const appRoutingProviders: any[] = [];
export const routing: ModuleWithProviders = RouterModule.forRoot(routes);
