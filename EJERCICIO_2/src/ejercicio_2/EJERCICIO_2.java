
package ejercicio_2;

//@author Juan Pablo

import java.util.Scanner;

public class EJERCICIO_2 {

    public static void main(String[] args) {
        double suma, x, y;
        Scanner entrada = new Scanner(System.in);
        suma = entrada.nextDouble();
        x = entrada.nextDouble();
        y = entrada.nextDouble();
        
        suma = suma + x;
        x = x + (Math.pow(y,2));
        suma = suma +(x/y);
        
        System.out.println("x quedo con un valor de: " + x);
        System.out.println("El valor de la suma es: " + suma);
    }

}
