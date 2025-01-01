// Ejercicio No.2
// Array con 30 ventas del mes, y que diga cuáles y cuántas son mayores que $2000.
import java.util.Scanner;

public class VentasMayores {   // Creacion de la clase
    public static void main (String[]args) {   // Creacion del metodo principal

        Scanner entrada = new Scanner(System.in);   // Definimos el escanner con el nombre de entrada

        double ventas[] = new double[5];
        int total = 0, venta = 0;   

        System.out.println("Ingrese las cantidades de cada una de las ventas: ");

        for(int i=0; i<ventas.length; i++) {
            System.out.println("Venta No." + (i+1));   // Numero de la venta
            ventas[i] = entrada.nextDouble();   // Cantidad de la venta dado por el usuario
        }

        while (venta<5) {
            if (ventas[venta]>2000) {
                System.out.println("Venta " + (venta+1) + ": " + ventas[venta]);  // Imprime la cantidad de la venta que cumpla con la condicion de mayor a 2000
                total++;  // Aumenta el numero de ventas totales que cumplen con la condicion
            }
            venta++;   // Pasamos a la siguiente venta para comprobar con el arreglo si cumple con la condicion
        }
        System.out.println("El total de ventas mayores a 2000 es: " + total);
        entrada.close();   // Fin del scanner 
    }   // Fin del metodo principal
}   // Fin de la clase