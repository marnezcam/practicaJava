package com;
import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		String palindromo = "";
		int bandera =0; 
		System.out.println("Saber si es un palindromo");
		System.out.println("Introduce tu palabra o frase");
		Scanner teclado = new Scanner(System.in);
		palindromo = teclado.nextLine();
		palindromo = palindromo.toLowerCase();
		palindromo = palindromo.replaceAll("[^a-zA-Z,ñ,Ñ]", "");
		teclado.close();
		System.out.println("\n");
		int j=palindromo.length();
		for(int i=0;i<palindromo.length();i++){
			j--;
			System.out.println(palindromo.charAt(i) + " " + palindromo.charAt(j));
			if(palindromo.charAt(i) == palindromo.charAt(j)) {
				
			}
			else {
				bandera++;
			}
		}
		if(bandera >0) {
			System.out.println("\nNo es un palindromo");
		}
		else {
			System.out.println("\nEs un palindromo");
		}
		
	}
}
