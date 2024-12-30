/*
 * Desplazar una posicion a los elementos de un arreglo
 * 
 * Crear un programa que nos permita introducir 10 numeros enteros en un arreglo
 * Esos numeros una posicion hacia abajo
 * El primero estará en la posicion del segundo
 * El segundo estará en la posicion del tercero
 * etc...
 */
import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[10];

        System.out.println("Ingrese los numeros:");
        for(int i=1; i<numeros.length; i++) {
            if (i==0) {
                i++;
            }
            System.out.print("No." + i + ": ");
            numeros[i] = scanner.nextInt();
        }
        for(int i=0; i<numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}