package com.company;

import com.company.interfaces.Valores;
import com.company.interfaces.ValoresParametros;

public class Main {

    public static void main(String[] args) {
        // Usamos la expresion en un contexto de asignación.
        // Esta expresión es compatible con getValue con su tipo de devolucion.
        ValoresParametros myPval;
        Valores myVal = () -> 98.5;
        myPval = (n) -> 100.0 / n;

        // Imprimir valores.
        System.out.println( myVal.getValue());
        System.out.println(myPval.getValue(50.0));

    }
}
