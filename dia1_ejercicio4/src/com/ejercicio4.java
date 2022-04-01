package com;

import java.util.Scanner;


	
public class ejercicio4 {
	public static void main(String[] args) {
//		pedir dor numeros y mostrar el resultado de su division si el segundo es 0 mandar error
		Scanner num1 = new Scanner(System.in);
		Scanner num2 = new Scanner(System.in);
		System.out.println("Programa que divide dos numeros introducidos");
		System.out.println("Introduce numero 1: ");
		double numA = num1.nextDouble();
		System.out.println("Introduce numero 2: ");
		double numB = num2.nextDouble();
		if(numB==0) {
			System.out.println("El segundo numero no puede ser 0");
		}
		else {
			System.out.println("El resultado es: " + numA/numB);
		}
	}
}
