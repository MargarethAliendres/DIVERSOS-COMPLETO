import { Component } from '@angular/core';
import { LoggerService } from '../logger.service';

@Component({
  selector: 'app-exemplo-servicos1',
  templateUrl: './exemplo-servicos1.component.html',
  styleUrls: ['./exemplo-servicos1.component.css']
})
export class ExemploServicos1Component {
   nome ="";

   constructor(private logger: LoggerService){    //acrescentei ex service//
   // injetou o loggerService agora consegue usara as classe do service_)

   }

   adicionarNome(){
    this.logger.logar(`o nome ${this.nome} foi adicionado`);
   }
}
