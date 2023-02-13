import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { SegundoComponenteComponent } from './segundo-componente/segundo-componente.component';
import { PipeCustomizadoComponent } from './pipe-customizado/pipe-customizado.component';
import { MultiplicaPorPipe } from './multiplica-por.pipe';
import { FormsModule } from '@angular/forms';
import { RenderizandoListasComponent } from './renderizando-listas/renderizando-listas.component';
import { ComponentePersonalizadoComponent } from './componente-personalizado/componente-personalizado.component';
import { ComponentePaiComponent } from './componente-pai/componente-pai.component';
import { ComponenteFilhoComponent } from './componente-filho/componente-filho.component';
import { ExemploServicos1Component } from './exemplo-servicos1/exemplo-servicos1.component';
import { ExemploServicos2Component } from './exemplo-servicos2/exemplo-servicos2.component';

import { CicloDeVidaPaiComponent } from './ciclo-de-vida-pai/ciclo-de-vida-pai.component';
import { CicloDevidaComponenteComponent } from './ciclo-de-vida-componente/ciclo-de-vida-componente.component';
import { MultipicaporPorPipe } from './multipicapor-por.pipe';
import { TwoWayComponent } from './two-way/two-way.component';
import { CardComponent } from './card/card.component';

@NgModule({
  declarations: [
    AppComponent,
    SegundoComponenteComponent,
    PipeCustomizadoComponent,
    MultiplicaPorPipe,
    RenderizandoListasComponent,
    ComponentePersonalizadoComponent,
    ComponentePaiComponent,
    ComponenteFilhoComponent,
    ExemploServicos1Component,
    ExemploServicos2Component,
    CicloDeVidaPaiComponent,
    CicloDevidaComponenteComponent,
    MultipicaporPorPipe,
    TwoWayComponent,
    CardComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
