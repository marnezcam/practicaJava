package com;
import java.util.Scanner;
public class ejercicio5 {
	//Comprueba si una letra es mayuscula
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe una letra mayuscula o minuscula");
		char letra = teclado.nextLine().charAt(0);
		if(Character.isUpperCase(letra)) {
			System.out.println("Es mayuscula");
		}
		else {
			System.out.println("Es minuscula");
		}
		
	}
}
