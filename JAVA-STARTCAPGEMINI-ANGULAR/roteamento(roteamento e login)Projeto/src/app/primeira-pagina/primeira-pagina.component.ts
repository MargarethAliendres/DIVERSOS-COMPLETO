import { Component } from '@angular/core';
import { Router} from '@angular/router'
                         //para a constante router funcionar deve importar desse jeito//

@ Component({
  selector: 'app-primeira-pagina',
  templateUrl: './primeira-pagina.component.html',
  styleUrls: ['./primeira-pagina.component.css']
})
export class PrimeiraPaginaComponent {

  constructor(                           //com esse construtor pronto, podemos inserir o metodo abaixo.///
   private router: Router                 //do botao que esta na primeira pagina redirecionar para a segunda pagina//
  ){ }

  moverParaSegudaPagina(){
   this.router.navigate(["segunda-pagina"]);
  }

}
