import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';        // importa  tambem a array list Routes//
import { PrimeiraPaginaComponent } from './primeira-pagina/primeira-pagina.component';   //importa a pagina//
import { SegundaPaginaComponent } from './segunda-pagina/segunda-pagina.component';   //importa a pagina//
import { PaginaNaoEncontradaComponent } from './pagina-nao-encontrada/pagina-nao-encontrada.component';//importa a pagina//
import { PaginaComParametroComponent } from './pagina-com-parametro/pagina-com-parametro.component';//importa a pagina//
import { PaginaProtegidaComponent } from './pagina-protegida/pagina-protegida.component';
import { AuthGuard } from './auth.guard';
import { LoginComponent } from './login/login.component';

//array list de rotas//
const routes: Routes = [
   {path:"primeira-pagina", component: PrimeiraPaginaComponent},
   {path: "segunda-pagina", component: SegundaPaginaComponent},
       //no navegador vai aparecer esse caminho//
   {path: "", redirectTo: "primeira-pagina", pathMatch:"full"},         //quando na url principal nao colocar nenhum caminho esse  /primeira-pagina, ele vai redirecionar automaticamente para a primeira pagina//
     //no navegador vai aparecer esse caminho//                      // somente quando o caminha estiver vazio, quando tiver especificado dai abre a pagina especificada//

  {path: "pagina-protegida", component: PaginaProtegidaComponent, canActivate: [AuthGuard] },   //roteamento da pagina protegida//

  {path: "login", component: LoginComponent}, // do componente logine

  {path:"pagina-com-parametro/:id", component: PaginaComParametroComponent},  //ESSE AQUI COM //
   //AQUI ESTAMOS PASSANDO O PARAMETRO /:id , podia ser /:nome  e etc..//

  { path: 'lazy-loading', loadChildren: () => import('./lazy-loading/lazy-loading.module').then(m => m.LazyLoadingModule) },   //ESSE É LASY //


  {path: "**", component:PaginaNaoEncontradaComponent }
           //esse asteristico define que qualquer endereço que for digitado que nao está definido a pagina nao existe. dai carrega essa pagina de nao encontrado.   ex /primeira-pagina1
]
@NgModule({
  declarations: [],       //usaremos esse metodo passando as rotas da lista acima//
  imports: [ RouterModule.forRoot(routes)],
  exports: [ RouterModule]    // só assim fica disponivel para o app.module.ts usar//
})


export class AppRoutingModule { }
