// Saber cual es el numero mayor de un arreglo
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[]args) {

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[5];
        int n = numeros[0];
        System.out.println("Ingrese los numeros: ");

        for(int i=0; i<5; i++) {
            System.out.print("Numero " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
            if (numeros[i]>n) {
                n=numeros[i];
            }
        }
        System.out.println("El numero mayor es: " + n);
        System.out.println("sssss");
        entrada.close();
    }
}
