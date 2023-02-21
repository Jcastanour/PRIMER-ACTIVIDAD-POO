
package ejercicio_1;

//@author Juan Pablo

import java.util.Scanner;

public class EJERCICIO_1 {

    public static void main(String[] args) {
        
        int emama, ejuan, ealberto, eana; //Las edades son enteros
        System.out.println("Hey Juan, ¿Cual es tu edad?");
        Scanner entrada = new Scanner(System.in);
        ejuan = entrada.nextInt();
        
        
        ealberto = 2* (ejuan/3);
        eana = 4 * (ejuan/3);
        
        emama = ejuan + ealberto + eana;
        
        System.out.println("La edad de Juan es: " + ejuan);
        System.out.println("La edad de Alberto es: " + ealberto);
        System.out.println("La edad de Ana es: " + eana);
        System.out.println("La edad de la Mamá es: "+ emama);
    }

}
