package com;

import java.util.Scanner;
import java.lang.Math;

public class ejercicio6 {
	public static void main(String[] args) {
		System.out.println("Programa que da el resultado de un numero con su exponente");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero");
		double num1 = teclado.nextDouble();
		System.out.println("Escribe cual su exponente");
		double exponente = teclado.nextDouble();
		teclado.close();
		double resultado = Math.pow(num1, exponente);
		if(exponente == 0)
		{
			System.out.println("El resultado es 1");
		}
		else if(exponente<0) {
			
			System.out.println("El resultado es: " + resultado );
		}
		else {
			System.out.println("El resultado es: " + resultado );
		}
		
	}
}
