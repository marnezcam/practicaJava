package com;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
//		while(x<15) {
//			System.out.println("Hola");
//			x++;
//		}
		
		//--------------------------------------------------------------
		
//		do {
//			System.out.println("OK");
//			x++;
//		}
//		while(x<15);
		//--------------------------------------------------------------
		
//		for(int i=50;i>=15;i--) {
//			System.out.println("hola " + i + " vez");
//		}
		//--------------------------------------------------------------
		
//		System.out.println(m.length());
//		System.out.println(m.charAt(8));
//		for(int i=0;i<m2.length();i++) {
//			System.out.println(m2.charAt(i));
//			if(equals(m2.charAt(i))){
//				contadorVocales++;
//			}
//		}
		String m ="Martin Martinez Nu�ez";
		String m2 = m.replaceAll("[^a-zA-Z,�,�]", "");// quita espacios y numeros
		m2=m2.toLowerCase(); //convierte todo a minusculas
		String consonantes = m2.replaceAll("[a,�,e,�,i,�,o,�,u,�]", "");//se crea una variable con solo constantes
		String vocales = m2.replaceAll("[^a,�,e,�,i,�,o,�,u,�]", "");
		System.out.println(consonantes);
		System.out.println("Hay " + consonantes.length() + " consonantes" );
		System.out.println("Hay " + vocales.length() + " vocales" );
		//Cuenta las vocales y las consonantes de un texto cualquiera

	}

}
