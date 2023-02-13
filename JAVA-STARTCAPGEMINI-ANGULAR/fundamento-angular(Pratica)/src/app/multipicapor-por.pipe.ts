import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'multipicaporPor'
})
export class MultipicaporPorPipe implements PipeTransform {

  transform(valor: number, dividepor: number): unknown {
    return valor/dividepor;
  }

}
