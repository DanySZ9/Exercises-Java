// Ejercicio No.13
// Guardar 5 numeros en un arreglo y mostrarlos en orden inversa
import java.util.Scanner;
public class OrdenInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuantos numeros desea ingresar?");
        int cantidad = scanner.nextInt();
        System.out.println("Ingrese los numeros: ");
        int numeros[] = new int[cantidad];

        for(int i=0; i<cantidad; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Números invertidos:");
        for (int i = cantidad - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        scanner.close();
    }
}