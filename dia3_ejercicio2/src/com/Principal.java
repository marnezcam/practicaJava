package com;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		int tabla=0;
		int numeroFinal=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la tabla a multiplicar");
		tabla = teclado.nextInt();
		System.out.println("Hasta que numero quieres que llegue");
		numeroFinal = teclado.nextInt();
		teclado.close();
		for(int i=0; i<=numeroFinal; i++)
		{
			System.out.println(i + " x " + tabla + " = " + i*tabla);
		}
	}
}
