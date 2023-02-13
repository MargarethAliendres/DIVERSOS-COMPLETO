import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaginaComParametroComponent } from './pagina-com-parametro.component';

describe('PaginaComParametroComponent', () => {
  let component: PaginaComParametroComponent;
  let fixture: ComponentFixture<PaginaComParametroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PaginaComParametroComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PaginaComParametroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
