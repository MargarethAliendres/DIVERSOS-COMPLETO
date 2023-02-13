import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
      //cria essa propriedade e copie o token gerado na pagina https://jwt.io/
acessToken = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";
               //obs: numa aaplicação real, é o backend que retoran esse token
  constructor() { }

  estaAutenticado(): boolean {       //nesse caso vamos salvar o token no sessionStorage

    return !!sessionStorage.getItem("acess-token");    //o token foi salvo com esse nome //chave padrao que identifica o  usuario
      //!! converte em booleano       //quando tiver esse token salvo no sessionStaorage - esta autenticado, se nao tiver salvo nao esta autenticado
  }

  //salva no browser (dá f12 aplicação(lá tem varios lugares de armazenasr - mesmo desligndo o computador, ou fechando a aba manter usuario logado quando voltar nao precisa logar - localStorage
  login(email: string, senha: string):boolean{                                   //- matem logado somente naquela sessao, quando voltar tem que logar -  SessionStorage
     if(email === "admin@admin.com.br" && senha === "123456"){    /*na hora de logar estiver exatamente esses dados salve no session storage esse token*/
         sessionStorage.setItem("acess-token", this.acessToken);     //seta o acess token no   sessionStorage
       return true;
     }

     return false;
  }                                         //a forma que identifica o usuario é atravez de um token - JWT site https://jwt.io/  o token QUE
                                             //É ARMAZENADO NO localStorage   ou sessionStorage

  logout(){
    sessionStorage.clear();

  }
}
