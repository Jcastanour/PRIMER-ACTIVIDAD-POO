
package ejercicio_4;

//@author Juan Pablo

import java.util.Scanner;

public class EJERCICIO_4 {

    public static void main(String[] args) {
       double x;
       Scanner entrada = new Scanner(System.in);
       x = entrada.nextDouble();
       
       System.out.println("El cuadrado de " + x + " es: " + Math.pow(x, 2));
       System.out.println("El cubo de " + x + " es: " + Math.pow(x, 3));
    }

}
