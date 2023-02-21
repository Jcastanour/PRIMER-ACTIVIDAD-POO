
package ejercicio_3;

//@author Juan Pablo

import java.util.Scanner;
public class EJERCICIO_3 {

    public static void main(String[] args) {
       int horas, salario_por_horas;
       double porcentajeRF;
       
       Scanner entrada = new Scanner(System.in);
       System.out.println("ingrse las horas trabajadas: ");
       horas = entrada.nextInt(); //se ingresa las horas trabajadas
       System.out.println("Ingrese la razon del salario por hora: ");
       salario_por_horas = entrada.nextInt(); //se ingresa la razon del salario por hora
       System.out.println("ingresa el porcentaje de la retención: ");
       porcentajeRF = entrada.nextDouble(); //Se ingresa el porcentaje
      
       int salariobruto = horas * salario_por_horas;
       double retencion = salariobruto * (porcentajeRF/100);
       double salarioneto = salariobruto - retencion;
       
       System.out.println("El salario bruto es: " + salariobruto);
       System.out.println("La retencion de fuente es: " + retencion);
       System.out.println("El salario neto es: " + salarioneto);
    }

}
