package com.cesar;

import java.util.Scanner;

public class Ganancia_Inversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Una persona desea invertir su capital en un banco y desea saber cuánto dinero
		2.
		* ganará después de un mes si el banco le pagará intereses del 2% mensual.
		3.
		*/
		Scanner entrada = new Scanner(System.in);
		int dias;
		double capital, ganancia, interes;
		//
		System.out.println("Ingrese el capital: ");
		capital = entrada.nextDouble();
		System.out.println("Ingrese dias Mes: ");
		dias = entrada.nextInt();
		interes = 0.02;
		ganancia = (capital * dias *interes);
		System.out.println("La ganancia es: "+ganancia);
	}

}
