package com;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
		// fijar el precio del kilo de uva
		//Si es de tipo A y el tamanio es 1 se le cargan 20 centavos. Si es de tamanio 2 se le cargan 30 centavos
		//Si es de tipo B se le rebajan 30 centavos si es de tamanio 1 y 50 cuando el tamanio es 2
		char tipoUva;
		double preciofinal;
		System.out.println("Cual es el precio inicial del kilo de uva");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el precio inicial del kilo de uva");
		double precioUva = teclado.nextDouble();
		System.out.println("Introduce el tipo de uva");
		tipoUva = teclado.next().charAt(0);
		System.out.println("Introduce el tama\u00f1o de la uva " );
		int tamUva = teclado.nextInt();
		teclado.close();
		
		if((tipoUva == 'a')|| (tipoUva == 'A')) {
			if(tamUva==1) {
				preciofinal=precioUva + 0.20;
				System.out.println("El precio final de la uva es de: " + preciofinal);
			}
			else {
				if(tamUva==2) {
					preciofinal=precioUva + 0.30;
					System.out.println("El precio final de la uva es de: " + preciofinal);
				}
				else {
					System.out.println("El tama\u00f1o no es valido");
				}
				
			}
		}
		else if((tipoUva == 'b')|| (tipoUva == 'B')) {
			if(tamUva==1) {
				preciofinal=precioUva - 0.30;
				System.out.println("El precio final de la uva es de: " + preciofinal);
			}
			else {
				if(tamUva==2) {
					preciofinal=precioUva - 0.50;
					System.out.println("El precio final de la uva es de: " + preciofinal);
				}
				else {
					System.out.println("El tama\u00f1o no es valido");
				}
				
			}
		}
		else {
			System.out.println("El tama\u00f1o no es valido");
		}
	}
}
