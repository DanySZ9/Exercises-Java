/*
 * Ejercicio No.17
 * Desplazar una posicion a los elementos de un arreglo
 * 
 * Crear un programa que nos permita introducir 10 numeros enteros en un arreglo
 * Esos numeros una posicion hacia abajo
 * El primero estará en la posicion del segundo
 * El segundo estará en la posicion del tercero
 * etc...
 */

import java.util.Scanner;
public class ArregloPosicionAbajo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        int numbers[] = new int[10];
        System.out.println("Ingrese los numeros: ");
        for(i=0; i<numbers.length; i++) {
            System.out.print("No." + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("");
        System.out.println(numbers[9]);
        for(i=0; i<9; i++) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}