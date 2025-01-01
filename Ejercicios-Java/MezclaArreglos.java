/*
 * Ejercicio No.15
 * Realizar las 2 versiones
 * Rellenar dos arreglos y pasar esos numeros a un tercer arreglo
 * 
 * Crear 2 arreglos, e introducir en cada uno, 10 numeros enteros.
 * Mezclarlos en un tercer arreglo de la siguiente forma:
 * El 1° de a, el 1° de b, el 2° de a, el 2° de b, el 3° de a, el 3° de b, etc...
 */
import java.util.Scanner;
public class MezclaArreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primer[] = new int[10];
        int segundo[] = new int[10];
        int tercer[] = new int[10];
        int contador = 0, i = 0;
        
        System.out.println("Ingrese los numeros: ");
        System.out.println("Primer Arreglo: ");
        for(i=0; i<primer.length; i++) {
            System.out.print("Numero " + (i+1) + ": ");
            primer[i] = scanner.nextInt();
        }
        System.out.println(" ");
        System.out.println("Ingrese los numeros: ");
        System.out.println("Segundo Arreglo: ");
        for(i=0; i<segundo.length; i++) {
            System.out.print("Numero " + (i+1) + ": ");
            segundo[i] = scanner.nextInt();
        }
        System.out.println(" ");
        System.out.println("Tercer Arreglo: ");
        for(i=0; i<5; i++) {
            tercer[contador] = primer[i];
            contador++;
            tercer[contador] = segundo[i];
            contador++;
        }
        System.out.print("Numero " + (i+1) + ": " + tercer[contador]);
        scanner.close();
    }   
}
