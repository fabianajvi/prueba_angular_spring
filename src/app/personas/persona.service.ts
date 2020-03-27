import { Persona } from './persona';
import { map } from 'rxjs/operators';
import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PersonaService {
  private urlEndPoint = 'http://localhost:8081/api/personas';
  private httpHeaders = new HttpHeaders({ 'Content-Type': 'application/json' });
  constructor(private http: HttpClient) { }

  getPersonas(): Observable<Persona[]> {
    return this.http.get(this.urlEndPoint).pipe(
      map(response => {
        const persona = response as Persona[];
        return persona;
      })
    );
  }
  create(persona: Persona): Observable <Persona> {
    return this.http.post<Persona>(this.urlEndPoint, persona,
    {headers: this.httpHeaders}
    );
  }
  getPersona(numDoc): Observable<Persona>{
    return this.http.get<Persona>(`${this.urlEndPoint}/${numDoc}`);
  }
}
