import { Component, Inject } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatDialogRef, MAT_DIALOG_DATA } from '@angular/material/dialog';
import { ProductosService } from '../services/productos/productos.service';

@Component({
  selector: 'app-editar-producto-modal',
  templateUrl: './editar-producto-modal.component.html',
  styleUrls: ['./editar-producto-modal.component.css']
})
export class EditarProductoModalComponent {
  productoForm!: FormGroup;

  constructor(
    private fb: FormBuilder,
    private dialogRef: MatDialogRef<EditarProductoModalComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    private productosService: ProductosService
  ) {
    this.productoForm = this.fb.group({
      nombre: [data.nombre, Validators.required],
      precio: [data.precio, Validators.required],
      categorias: [data.id_categorias?.id, Validators.required],
      proveedor: [data.id_proveedor?.id, Validators.required]
    });
  }

  guardarEdicion(): void {
    if (this.productoForm.valid) {
      const id = this.data.id;
      const productoData = {
        nombre: this.productoForm.value.nombre,
        precio: this.productoForm.value.precio,
        id_categorias: this.productoForm.value.categorias,
        id_proveedor: this.productoForm.value.proveedor,
      };

      this.productosService.updateProducto(id, productoData).subscribe(
        resp => {
          console.log('Producto actualizado con éxito:', resp);
          this.dialogRef.close(resp);
        },
        error => {
          console.error('Error al actualizar el producto:', error);
        }
      );
    }
  }

  cancelarEdicion(): void {
    this.dialogRef.close();
  }
}
