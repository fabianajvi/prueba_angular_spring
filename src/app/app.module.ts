import { RouterModule, Routes } from '@angular/router';
import { UsuarioService } from './usuarios/usuario.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsuariosComponent } from './usuarios/usuarios.component';
import { HttpClientModule } from '@angular/common/http';
import { FormComponent } from './usuarios/form/form.component';
import { FormsModule } from '@angular/forms';
import { PersonasComponent } from './personas/personas.component';
import { FormPersonasComponent } from './personas/form-personas/form-personas.component';
import { PerfilesComponent } from './perfiles/perfiles.component';
import { PerfilService } from './perfiles/perfil.service';

@NgModule({
  declarations: [
    AppComponent,
    UsuariosComponent,
    FormComponent,
    PersonasComponent,
    FormPersonasComponent,
    PerfilesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule
  ],
  providers: [
    UsuarioService,
    PerfilService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
