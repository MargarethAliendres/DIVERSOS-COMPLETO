import { Component } from '@angular/core';

@Component({
  selector: 'app-componente-pai',
  templateUrl: './componente-pai.component.html',
  styleUrls: ['./componente-pai.component.css']
})
export class ComponentePaiComponent {

  sobrenome = "da silva"

  mostrarNomeCompleto(nomeCompleto:any){           //comdando do output que sera vinculado ao filho//
    alert(`o nome completo é: ${nomeCompleto}`);

}
}
