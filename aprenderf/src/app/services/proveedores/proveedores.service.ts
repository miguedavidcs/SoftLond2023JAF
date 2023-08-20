import { Injectable } from '@angular/core';
import { Observable } from 'rxjs'
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProveedoresService {
  private API_SERVER ="http://localhost:8081/Proveedor/"

  constructor(
    private httpClient:HttpClient
  ) { }
  public getAllProveedores():Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }
}
