import { Usuario } from './usuario';
import { Injectable } from '@angular/core';
import { of, Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { NgForm } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {
  private urlEndPoint = 'http://localhost:8081/api/usuarios';
  private httpHeaders = new HttpHeaders({ 'Content-Type': 'application/json' });
  constructor(private http: HttpClient) { }

  getUsuarios(): Observable<Usuario[]> {
    return this.http.get(this.urlEndPoint).pipe(
      map(response => {
        const usuario = response as Usuario[];
        return usuario;
      })
    );
  }
  create(usuario: Usuario): Observable <Usuario> {
    return this.http.post<Usuario>(this.urlEndPoint, usuario,
    {headers: this.httpHeaders}
    );
  }
  getUsuario(usu): Observable<Usuario> {
    return this.http.get<Usuario>(`${this.urlEndPoint}/${usu}`);
  }
  update(usuario: Usuario): Observable <Usuario>{
    return this.http.put<Usuario>(`${this.urlEndPoint}/${usuario.usu}`, usuario,
    {headers: this.httpHeaders}
    );
  }
}
