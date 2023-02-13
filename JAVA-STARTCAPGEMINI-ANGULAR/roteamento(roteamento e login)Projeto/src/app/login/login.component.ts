import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

email ="";
senha ="";

constructor(
  private auth: AuthService,   //buscao serviço de login injetando esse serviço aqui//
  private router: Router      // para fazer direcionamento faz injeção do Router//

  ){}

 ngOnInit(): void{

 }

login(){                                             //se foi logado//
  if (this.auth.login(this.email,this.senha)) {   //se essa autenticaçao for verdadeira, me leve para a pagina protegida//
    this.router.navigate (["pagina-protegida"]);

    return;   // nao mostra o alerta que vai ser colocado abaixo//
   }

   alert ("O Login está invalido");   //se nao foi logado//
  this.senha="";    //limpa a senha e login//
  this.email="";

  }
}
