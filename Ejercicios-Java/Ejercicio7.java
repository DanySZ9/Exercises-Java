// Programa que multiplique los 10 primeros numeros impares
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int impar[] = new int[10];
        int total = 1;

        for(int i = 0; i < 10; i++) {
            impar[i] = 2 * i + 1;
            total = total * impar[i];
        }

        System.out.println("Los primeros numeros impares son: ");
        for(int numero : impar) {
            System.out.println(numero);
        }
        System.out.println("El total de la multiplicacion de los numeros impares fue de: " + total);

        sc.close();
    }
}
