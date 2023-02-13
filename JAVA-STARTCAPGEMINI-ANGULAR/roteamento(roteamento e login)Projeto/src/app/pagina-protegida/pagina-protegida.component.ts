import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-pagina-protegida',
  templateUrl: './pagina-protegida.component.html',
  styleUrls: ['./pagina-protegida.component.css']
})
export class PaginaProtegidaComponent {

   constructor(private auth: AuthService,       // vai injetar o serviço de autenticação, para fazer a limnpeza//
               private router: Router ){         //injetar para fazer rotemento abaixo//
   }

  logout(){
    this.auth.logout();  //isso vai limpar o sessionStorage//
    this.router.navigate([""]); //será redirecionado para a pagina principal//


  }

}
