/*
 * Ejercicio No.18
 * Ingresar numeros en arreglo ordenado, en la posicion adecuada
 * 
 * Introducir 5 numeros enteros en un arreglo, de forma creciente y ordenados
 * Por ejemplo: 2, 4, 6, 8, 10.
 * Estos numeros se almacenarán en un arreglo de tamaño 10
 * Posteriormente introduciremos un numero entero n
 * Y se insertará en el lugar correspondiente
 * Sin alterar el orden de la tabla
 */

 import java.util.Scanner;
public class ArregloCrecienteOrdenados {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Introduce los 5 numeros (ordenados de forma creciente)");
        for (int i=0; i<5; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Ingrese un numero entero: " );
        int num = scanner.nextInt();
        int pos_num = 0;
        int k = 0;

        while (arr[k]<num && k<=4) {
            pos_num++;
            k++;
        }
        for(int i=4;i<pos_num; i--) {
            arr[i+1] = arr[i];
        }
        arr[pos_num] = num;
        System.out.println("Nuevo arreglo ordenado: ");
        for(int i=0; i<5; i++) {
            System.out.println(arr[i]);
        }

        scanner.close();
    }
}
