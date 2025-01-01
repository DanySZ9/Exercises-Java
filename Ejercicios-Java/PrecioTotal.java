// Ejercicio No.4
// Saber el total a pagar, en base al descuento que se haga

// Cada pieza de pan tiene un precio de $5
// Si el cliente compra mas de 50 piezas, le costara a $4.50
// Si el cliente compra mas de 100 piezas, le costara a $4
// Programa que pida capturar la cantidad de piezas que el cliente compro, y el total que pagara
import java.util.Scanner;
public class PrecioTotal {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        double piezas = 5;
        System.out.println("¿Cuantas piezas de pan desea comprar?");
        int cantidad = entrada.nextInt();

        if (cantidad>=100) {
            piezas = 4;
            System.out.println("Cantidad de piezas compradas: " + cantidad);
            System.out.println("Precio a pagar: $" + (cantidad * piezas));
        } else if (cantidad>=50 && cantidad<100) {
            piezas = 4.50;
            System.out.println("Cantidad de piezas compradas: " + cantidad);
            System.out.println("Precio a pagar: $" + (cantidad * piezas));
        } else {
            System.out.println("Cantidad de piezas compradas: " + cantidad);
            System.out.println("Precio a pagar: $" + (cantidad * piezas));
        }
        entrada.close();
    }
}
