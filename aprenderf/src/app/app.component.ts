import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ProductosService } from './services/productos/productos.service';
import { CategoriasService } from './services/categorias/categorias.service';
import { ProveedoresService } from './services/proveedores/proveedores.service';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {

  productoForm!: FormGroup;
  categorias: any[] = [];
  proveedor: any[] = [];
  productos: any[] = [];
  editarProductoId: number | null = null;

  constructor(
    private fb: FormBuilder,
    private productosService: ProductosService,
    private proveedoresService: ProveedoresService,
    private categoriasService: CategoriasService,
    private dialog: MatDialog
  ) { }

  ngOnInit(): void {
    this.initForm();
    this.loadCategorias();
    this.loadProveedores();
    this.loadProductos();
  }

  initForm(): void {
    this.productoForm = this.fb.group({
      nombre: ['', Validators.required],
      precio: ['', Validators.required],
      categorias: ['', Validators.required],
      proveedor: ['', Validators.required]
    });
  }

  loadCategorias(): void {
    this.categoriasService.getAllCategorias().subscribe({
      next: resp => {
        this.categorias = resp;
      },
      error: error => {
        console.error('Error al cargar categorías:', error);
      }
    });
  }

  loadProveedores(): void {
    this.proveedoresService.getAllProveedores().subscribe({
      next: resp => {
        this.proveedor = resp;
      },
      error: error => {
        console.error('Error al cargar proveedores:', error);
      }
    });
  }

  loadProductos(): void {
    this.productosService.getAllProductos().subscribe({
      next: resp => {
        this.productos = resp;
      },
      error: error => {
        console.error('Error al cargar productos:', error);
      }
    });
  }

  guardar(): void {
    if (this.productoForm.valid) {
      const productoData = {
        nombre: this.productoForm.value.nombre,
        precio: this.productoForm.value.precio,
        id_categorias: this.productoForm.value.categorias,
        id_proveedor: this.productoForm.value.proveedor,
      };

      this.productosService.saveProducto(productoData).subscribe(
        resp => {
          console.log('Producto guardado con éxito:', resp);
          this.productoForm.reset();
          this.productos.push(resp);
        },
        error => {
          console.error('Error al guardar el producto:', error);
        }
      );
    }
  }

  eliminar(producto: any): void {
    this.productosService.deleteProducto(producto.id).subscribe(
      resp => {
        if (resp) {
          console.log('Producto eliminado con éxito:', resp);
          const index = this.productos.indexOf(producto);
          if (index !== -1) {
            this.productos.splice(index, 1);
          }
        } else {
          console.log('Error al eliminar el producto');
        }
      },
      error => {
        console.error('Error al eliminar el producto:', error);
      }
    );
  }

  abrirModalEditar(producto: any): void {
    const dialogRef = this.dialog.open(EditarProductoModalComponent, {
      data: producto
    });

    dialogRef.afterClosed().subscribe(result => {
      if (result) {
        const index = this.productos.findIndex(p => p.id === result.id);
        if (index !== -1) {
          this.productos[index] = result;
        }
      }
    });
  }
}
