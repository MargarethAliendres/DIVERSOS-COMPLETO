import { Component, Input, OnChanges, OnDestroy, OnInit, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-ciclo-de-vida-componente',
  templateUrl: './ciclo-de-vida-componente.component.html',
  styleUrls: ['./ciclo-de-vida-componente.component.css']
})
export class CicloDevidaComponenteComponent implements OnInit, OnChanges, OnDestroy {

     horario = new Date();
     timer: any = null!;

     @Input() texto = "";    //trazendo do pai//

  ngOnInit(): void {
      console.log("o evento OnInit disparou");
      this.timer = setInterval(() => this.horario = new Date(), 1000);
  }
              //ESTE EVENTO OnChange dispara primeiro que o OnInit
  ngOnChanges(changes: SimpleChanges): void {  //depois que criou o ciclo-de vida pai colocamos esse metodo que traz as mudanças dos evetos//
      console.log(changes);
  }
  ngOnDestroy(): void {                 //cancela evento//
      clearInterval(this.timer);    // todo evento colocado de tempos em tem´pos deve ser cancelados/limpos//
  }
}
