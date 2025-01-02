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

        System.out.println("Primer Arreglo:");
        System.out.println("Ingrese los numeros:");
        for(int i=0;i<primer.length;i++) {
            System.out.print("Numero " + (i+1) + " : ");
            primer[i] = scanner.nextInt();
        }
        System.out.println("Segundo Arreglo:");
        System.out.println("Ingrese los numeros:");
        for(int i=0;i<primer.length;i++) {
            System.out.print("Numero " + (i+1) + " : ");
            segundo[i] = scanner.nextInt();
        }

        int j = 0;
        System.out.println("Tercer Arreglo:");
        for(int i=0; i<tercer.length; i++) {
            tercer[j] = primer[i];
            System.out.println("Numero " + i + " : " + tercer[j]);
            tercer[j] = segundo[i];
            System.out.println("Numero " + i + " : " + tercer[j]);
            j++;
        }
        scanner.close();
    }
}