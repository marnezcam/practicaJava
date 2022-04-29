/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author marti
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var valorU =93;
        var valorD = 10;
        var c = true;
        var d = !c;
        System.out.println("El valor de d es " + d);//El valor de d es falso
        var resultado = valorU % valorD;
        System.out.println("El resultado de la modulo es: " + resultado);
        var cadena1 = "Hola";
        var cadena2 = "Hola";
        var resultade = cadena1.equals(cadena2);
        System.out.println("Este es el resultado" + resultade);
        int i;
        for(i=0;i<11;i++){
            System.out.println("llegamos al numero  normal ");
            if(i == 2)
            {
                System.out.println("Llegamos al dos");    
                continue;
            }
            else{
                System.out.println("Cuando llegamos al 7 nos salimos XD");
                break;
            }
        }
        // TODO code application logic here
    }
    
}
