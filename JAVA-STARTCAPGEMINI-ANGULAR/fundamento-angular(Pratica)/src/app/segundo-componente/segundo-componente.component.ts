import { Component } from '@angular/core';

@Component({
  selector: 'app-segundo-componente',
  templateUrl: './segundo-componente.component.html',
  styleUrls: ['./segundo-componente.component.css']
})
export class SegundoComponenteComponent {
nome = "Margareth Clarinda Carvalho Aliendres";
datadenascimento ="1983-02-23";
urlImagem = "/assets/laptop-1.jpg";
nomear = "";

mostrarDataNascimento(): void{
  alert(`A data de nascimento de Margareth é: ${this.datadenascimento}`);

}



}
