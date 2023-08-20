import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductosService } from './services/productos/productos.service';
import { CategoriasService } from './services/categorias/categorias.service';
import { ProveedoresService } from './services/proveedores/proveedores.service';
import { BehaviorSubject } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  productoForm!: FormGroup;
  categorias: any[] = [];
  proveedor: any[] = [];
  productos: BehaviorSubject<any[]> = new BehaviorSubject<any[]>([]);

  constructor(
    private fb: FormBuilder,
    private productosService: ProductosService,
    private proveedoresService: ProveedoresService,
    private categoriasService: CategoriasService
  ) { }

  ngOnInit(): void {
    this.productoForm = this.fb.group({
      nombre: ['', Validators.required],
      precio: ['', Validators.required],
      categorias: ['', Validators.required],
      proveedor: ['', Validators.required]
    });

    this.categoriasService.getAllCategorias().subscribe({
      next: resp => {
        this.categorias = resp;
      },
      error: error => {
        console.error('Error al cargar categorías:', error);
      }
    });

    this.proveedoresService.getAllProveedores().subscribe({
      next: resp => {
        this.proveedor = resp;
      },
      error: error => {
        console.error('Error al cargar proveedores:', error);
      }
    });

    this.cargarTablaProductos(); 
  }

  guardar(): void {
    if (this.productoForm.valid) {
      const productoData = {
        nombre: this.productoForm.value.nombre,
        precio: this.productoForm.value.precio,
        id_categorias: this.productoForm.value.categorias,
        id_proveedor: this.productoForm.value.proveedor,
      };
      console.log('Datos del producto a guardar:', productoData);
      this.productosService.saveProducto(productoData).subscribe(
        resp => {
          console.log('Producto guardado con éxito:', resp);
          this.productoForm.reset();
          this.cargarTablaProductos(); 
        },
        error => {
          console.error('Error al guardar el producto:', error);
        }
      );
    }
  }

  private cargarTablaProductos(): void {
    this.productosService.getAllProductos().subscribe({
      next: resp => {
        this.productos.next(resp);
      },
      error: error => {
        console.error('Error al cargar productos:', error);
      }
    });
  }
}
