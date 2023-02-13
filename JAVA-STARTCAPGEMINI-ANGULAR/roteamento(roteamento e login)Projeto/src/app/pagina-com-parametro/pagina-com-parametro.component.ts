import { Component } from '@angular/core';
import { ActivatedRoute, Route } from '@angular/router';

@Component({
  selector: 'app-pagina-com-parametro',
  templateUrl: './pagina-com-parametro.component.html',
  styleUrls: ['./pagina-com-parametro.component.css']
})
export class PaginaComParametroComponent {
   id: number | null = null;

   idade: number | null = null;
   nome: string | null ="";

  constructor(private route: ActivatedRoute){      // extrai o id de dentro da rota, a qual passamos de parametro lá

  }
  ngOnInit():void{
   this.route.paramMap.subscribe(params => {      //faz parte do parametro de roteamento
      this.id = Number(params.get("id"));         //esse coloca paramentro no (app.routing.module.ts)

  this.route.queryParamMap.subscribe(params =>{
      this.idade = Number(params.get("idade"));   //faz parte parametro de consulta
      this.nome = params.get("nome");               //obs: esse de consulta não coloca nada no (app.routing.module.ts)

  })

   })

  }

}
