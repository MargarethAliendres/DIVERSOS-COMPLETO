import { Component } from '@angular/core';
import { Celular } from '../types/Celular';

@Component({
  selector: 'app-renderizando-listas',
  templateUrl: './renderizando-listas.component.html',
  styleUrls: ['./renderizando-listas.component.css']
})
export class RenderizandoListasComponent {
  celulares: Celular[] = [
    { id: 1, nome: "Celular XL", descricao: "celular grande", esgotado: false},
    { id: 2, nome: "Celular uXL", esgotado: true},
    { id: 3, nome: "Celular oXL", descricao: "celular medio", esgotado: false},

  ]
}
