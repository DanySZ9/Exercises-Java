// Ejercicio No.6
// Capturar solo numeros positivos y obtener la media (promedio) de esos numeros
// Crear programa que nos pida capturar numeros positivos y calcular la media o promedio de esos numeros
import java.util.Scanner;
public class PromedioPositivo{
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, suma = 0, total = 0;

        System.out.println("El programa finalizara cuando inserte el numero 0");

        do {
            System.out.print("Inserte un numero positivo: ");
            numero = sc.nextInt();
            suma = suma + numero;
            if (numero==0) {
                double promedio = (double)suma / (double)total;
                System.out.println("El promedio fue de: " + promedio);
            } else if(numero>0) {
                total++;
            } else {
                System.out.println("Solamente numeros positivos.");
                break;
            }
        } while(numero!=0);
        sc.close();
    }
}