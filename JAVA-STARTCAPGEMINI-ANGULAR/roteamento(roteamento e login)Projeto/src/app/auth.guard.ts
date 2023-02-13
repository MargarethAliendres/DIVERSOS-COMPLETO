import { Injectable } from '@angular/core';
import { ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree } from '@angular/router';
import { Observable } from 'rxjs';
import { AuthService } from './auth.service';
import { LoginComponent } from './login/login.component';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {

  constructor(private auth:  AuthService,   //qui tem que injetar o serviço de autenticação,  pois se foi autenticado, o guard liberara o acesso  //na pagina protegida////
              private router: Router){      // aqui injeta o roteamento para usasr abaixo

  }

  canActivate(      //esse canActivate foi colocado no path de login no app.routing.module.ts//
    route: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    if(!this.auth.estaAutenticado()){    //! significa se ele nao estiver autenticado//
       this.router.navigate(["login"]);   //volta para a tela de login
    return false;

    }
    return true;    // se foi autenticado entra na pagina protegida
  }

}
