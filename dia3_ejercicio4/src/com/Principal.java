package com;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		String palabra;
		char letra;
		int contador=0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce una palabla: ");
		palabra = teclado.nextLine().toLowerCase();
		System.out.print("Introduce una letra: ");
		letra = teclado.next().toLowerCase().charAt(0);
		teclado.close();
		System.out.println("Palabra: " + palabra + "\nLetra: " + letra);
		for(int i=0;i<palabra.length();i++) {
			if(letra==palabra.charAt(i)) {
				contador++;
			}
		}
		System.out.println("La letra se repitio: " + contador + " veces" );
	}
}
