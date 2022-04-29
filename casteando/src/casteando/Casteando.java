/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casteando;

import java.util.Scanner;

/**
 *
 * @author Martinez
 */
public class Casteando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Necesito que ingreses tu edad: ");
        try (Scanner consola = new Scanner(System.in)) {
            var edad = Integer.parseInt(consola.nextLine());
            System.out.println("Aqui se muestra la edad que introdiciste: " + edad);
        }
    }
    
}
