import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-componente-filho',
  templateUrl: './componente-filho.component.html',
  styleUrls: ['./componente-filho.component.css']
})
export class ComponenteFilhoComponent {
  @Input() sobrenome = "";                //faz parte do comando pai para filho input//
  @Output() mostrarNome = new EventEmitter();     //faz parte do comando output//

  nome = "";  //faz parte do comando pai para filho input//

}
