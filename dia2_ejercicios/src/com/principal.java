package com;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		System.out.println("Programa que compara que numero introducido es mayor");
		System.out.println("Escribe un numero"); 
		double numA = num1.nextDouble();
		System.out.println("Escribe otro numero");
		double numB = num2.nextDouble();
		if(numA > numB) {
				System.out.println("El numero 1 es mayor");
		}
		else if(numA < numB) {
			System.out.println("El numero 2 es mayor");
		}
		else {
			System.out.println("Los numeros son iguales");
		}
		num1.close();
		num2.close();
	}

}
