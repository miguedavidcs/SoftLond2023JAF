import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditarProductoModalComponent } from './editar-producto-modal.component';

describe('EditarProductoModalComponent', () => {
  let component: EditarProductoModalComponent;
  let fixture: ComponentFixture<EditarProductoModalComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EditarProductoModalComponent]
    });
    fixture = TestBed.createComponent(EditarProductoModalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
