/*
 * Ejercicio No.14
 * Imprimir numeros en un arreglo en determinado orden
 * 
 * Guardar 10 numeros en un arreglo y al final mostrarlos en pantalla en el siguiente orden
 * El primero
 * El ultimo
 * El segundo
 * El penultimo
 * El tercero
 * etc...
 * En esta version se realizara primero haciendo uso de la terminal para observar los resultados
 */
import java.util.Scanner;
public class ArregloOrdenEspecifico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[10];

        System.out.println("Ingrese los numeros:");
        for(int i=0; i<numeros.length; i++) {
            System.out.print("Ingrese el No." + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("Orden realizado con los numeros ingresados:");
        for(int i=0; i<5; i++) {
            System.out.println(numeros[i]);
            System.out.println(numeros[9-i]);
        }
        
        scanner.close();
    }
}
