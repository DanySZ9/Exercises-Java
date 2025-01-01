// Ejercicio No.5
// Programa que pida numeros y al poner el numero 0, deje de pedir y que los sume

// Crear un programa que este pidiendo numeros enteros
// Cuando un cero se haya introducido, finalizara la captura de datos
// Sumar los numeros y mostrar la suma en pantalla
import java.util.Scanner;
public class SumaArreglos {
    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        int i = 0;
        double suma = 0;
        System.out.println("Ingrese los numeros que desea sumar: ");
        System.out.println("Si ingresa 0 el programa finalizara.");

        while (i<100) {
            double numero=entrada.nextDouble();
            suma=suma+numero;

            if (numero==0) {
                System.out.println("La suma de los numero es: " + suma);
                break;
            } else {
                i++;
            }
        }
        entrada.close();
    }
}
