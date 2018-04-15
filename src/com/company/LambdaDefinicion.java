package com.company;

import com.company.interfaces.Valores;
import com.company.interfaces.ValoresParametros;

public class LambdaDefinicion {

    // Usamos la expresion en un contexto de asignación.
    // Esta expresión es compatible con getValue con su tipo de devolucion.

  Valores myVal = () -> 98.5;
  ValoresParametros myPval;

  public void lambdas(){
      myPval = (n) -> 1.0 / n;
  }

  public void  imprimir(){
      System.out.println(myPval.getValue(40.0));
    myVal.getValue();


  }

}
