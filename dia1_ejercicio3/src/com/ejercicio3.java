package com;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		System.out.println("Programa que compara si es par o impar");
		System.out.println("Introduce un numero");
		double numA = num1.nextDouble();
		if((numA%2)==0) {
			System.out.println("Es numero PAR");
		}
		else {
			System.out.println("ES IMPAR");
		}
		num1.close();
		
	}
}
