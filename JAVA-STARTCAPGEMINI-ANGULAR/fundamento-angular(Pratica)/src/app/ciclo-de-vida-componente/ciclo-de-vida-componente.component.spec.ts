import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CicloDevidaComponenteComponent } from './ciclo-de-vida-componente.component';

describe('CicloDevidaComponenteComponent', () => {
  let component: CicloDevidaComponenteComponent;
  let fixture: ComponentFixture<CicloDevidaComponenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CicloDevidaComponenteComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CicloDevidaComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
