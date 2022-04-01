package com;

public class Principal {
	public static void main(String[] args) {
		int i,j,k; 	// i=horas  j=minutos k=segundos
		
		// Simular el funcionamiento de un reloj
		for(i=0;i<24;i++) {
			for(j=0;j<60;j++) {
				for(k=0;k<60;k++) {
					if(i<10)
					{
						System.out.print("0" + i + ":");
					}
					else {
						System.out.print(i + ":");
					}
					if(j<10)
					{
						System.out.print("0" + j + ":");
					}
					else {
						System.out.print(j + ":");
					}
					if(k<10)
					{
						System.out.print("0" + k + "\n");
					}
					else {
						System.out.print(k + "\n");
					}
					//System.out.println(i +":" + j + ":" + k);
				}
			}
			
		}
	}

}
