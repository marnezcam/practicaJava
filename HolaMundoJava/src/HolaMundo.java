
import java.util.Scanner;

//Mi clase en Java

public class HolaMundo {

    public static void main(String args[]) {
        var i= 3;
        var j= 4;
        var usuario = "Martin Martinez Camacho";
        var palabras = "Estoy por decir muchas cosas que me parecen buenas " + (5+12);
        System.out.println(palabras);
        System.out.println(i + j);
        System.out.println(i + j + usuario);
        System.out.println(usuario + i + j);
        System.out.println(usuario + (i + j));
        System.out.println("Escribe tu nombre:");
        Scanner console = new Scanner(System.in); 
        //var usuario = console.nextLine();
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo:");
        var titulo = console.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
       
   
    }
}
