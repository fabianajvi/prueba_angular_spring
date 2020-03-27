import { Perfil } from './perfil';
import { Injectable } from '@angular/core';
import { of, Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs/operators';
import { NgForm } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class PerfilService {
  private urlEndPoint = 'http://localhost:8081/api/perfil';
  private httpHeaders = new HttpHeaders({ 'Content-Type': 'application/json' });
  constructor(private http: HttpClient) { }

  getPerfil(): Observable<Perfil[]> {
    return this.http.get(this.urlEndPoint).pipe(
      map(response => {
        const perfil = response as Perfil[];
        return perfil;
      })
    );
  }
}
