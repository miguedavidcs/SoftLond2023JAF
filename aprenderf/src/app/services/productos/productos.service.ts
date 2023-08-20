import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductosService {
  private API_SERVER = "http://localhost:8081/Productos/"

  constructor(
    private httpClient: HttpClient
  ) { }

  public getAllProductos(): Observable<any> {
    return this.httpClient.get(this.API_SERVER);
  }

  public saveProducto(productos: any): Observable<any> {
    return this.httpClient.post(this.API_SERVER, productos)
      .pipe(
        catchError(this.handleError)
      );
  }

  private handleError(error: HttpErrorResponse) {
    console.error('Error:', error);
    return throwError(() => new Error('Error al obtener los productos: ' + error));

  }
}
