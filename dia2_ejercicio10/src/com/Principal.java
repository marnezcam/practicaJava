package com;
//Determinar el pago por alumno

import java.util.Scanner;

//100 y mas de 100 pagan 65
//50 a 99 pagan 70
//30 a 49 pagan 95
//menos de 30 alumnos el costo de renta es de 4000

public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroAlumnos = 0;
		double costoFinal=0;
		System.out.println("Calculador de precio del viaje");
		System.out.println("Escribe el numero de alumnos");
		numeroAlumnos=teclado.nextInt();
		teclado.close();
		if(numeroAlumnos>99) {
			costoFinal = 65;
			System.out.println("El costo final es de:" + costoFinal + " por alumno" );
			System.out.println("Se pagaran en total: $" + numeroAlumnos*costoFinal);
		}
		else if((numeroAlumnos>=50)&&(numeroAlumnos<=99)) {
			costoFinal = 70;
			System.out.println("El costo final es de:" + costoFinal + " por alumno" );
			System.out.println("Se pagaran en total: $" + numeroAlumnos*costoFinal);
		}
		else if((numeroAlumnos>=30)&&(numeroAlumnos<=49)) {
			costoFinal = 95;
			System.out.println("El costo final es de:" + costoFinal + " por alumno" );
			System.out.println("Se pagaran en total: $" + numeroAlumnos*costoFinal);
			
		}
		else if(numeroAlumnos<30) {
			costoFinal = (4000/numeroAlumnos);
			System.out.println("El costo final es de:" + costoFinal + " por alumno" );
			System.out.println("Se pagaran en total: $" + numeroAlumnos*costoFinal);
			
		}
	}

}
