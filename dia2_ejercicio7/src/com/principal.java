package com;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu sexo con una leta M o F");
		char sexoC = teclado.nextLine().charAt(0);
		System.out.println("Introduce tu nota");
		double notaD = teclado.nextDouble();
		System.out.println("Introduce tu edad");
		int edadI = teclado.nextInt();
		
		
		if (notaD>=5)
		{
			if(edadI>=18) {
				if ((sexoC == 'M')||(sexoC == 'm')) 
				{
					System.out.println("Aceptada");
				}
				else{
					if ((sexoC == 'H')||(sexoC == 'h')) {
						System.out.println("Posible");
					}
					else {
						System.out.println("No aceptada");
					}
				}
			}
			else {
				System.out.println("No aceptada por edad");
			}
			
		}
		else {
			System.out.println("No aceptada por nota");
		}
		
	}
}
