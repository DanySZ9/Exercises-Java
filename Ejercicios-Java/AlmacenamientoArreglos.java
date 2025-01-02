/*
 * Ejercicio No.16
 * Mezclar dos arreglos en un tercer arreglo
 * 
 * Ingresar los datos numericos de dos arreglos, y almacenarlos en un tercer arreglo
 * La forma en que se almacenaran sera la siguiente:
 * En el arreglo A y en el arreglo B, almacenaremos 12 numeros, en cada arreglo
 * Los mostraremos en un tercer arreglo C de esta forma:
 * 3 numeros del arreglo A y 3 numeros del arreglo B.
 * Otros 3 numeros del arreglo A y otros 3 numeros del arreglo B
 */

 import java.util.Scanner;
public class AlmacenamientoArreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a[] = new int[12];
        int b[] = new int [12];
        int c[] = new int[24];

        System.out.println("Ingrese los numeros del primer arreglo:");
        for(int i=0; i<a.length; i++) {
            System.out.print("No." + (i+1) + ": ");
            a[i] = scanner.nextInt();
        }  
        System.out.println("");
        System.out.println("Ingrese los numeros del segundo arreglo:");
        for(int i=0; i<a.length; i++) {
            System.out.print("No." + (i+1) + ": ");
            b[i] = scanner.nextInt();
        }  

        int i = 0;
        int n = 0;
        System.out.println("");
        System.out.println("Numeros del tercer arreglo:");
        while (i<12) {
            for(int k = 0; k<3; k++) {
                c[n] = a[i+k];
                n++;
            }   
            for(int k = 0; k<3; k++) {
                c[n] = b[i+k];
                n++;
            }    
            i+=3;
        }
        for(n=0; n<24; n++) {
            System.out.println("No." + (n+1) + ": " + c[n]);
        }
        scanner.close();
    }
}
