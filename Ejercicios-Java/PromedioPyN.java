// Ejercicio No.8
// El programa pedira 10 numeros enteros
// Y mostrara el promedio de los que sean negativos.
// Tambien el promedio de los numeros positivos
// Y nos dira cuantos ceros fueron ingresados

import java.util.Scanner;
public class PromedioPyN {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int numPositivosTotales = 0;
        int numNegativosTotales = 0;
        int totalPositivo = 0, totalNegativo = 0, totalCeros = 0;

        System.out.println("Ingrese 10 numeros: ");
        for(int i=0; i<10; i++) {
            int num = sc.nextInt();
            if (num>0) {
                numPositivosTotales = numPositivosTotales + num;
                totalPositivo++;
            } else if(num<0) {
                numNegativosTotales = numNegativosTotales + num;
                totalNegativo++;
            } else {
                totalCeros++;
            }
        }
        double promedioPositivo = (double)numPositivosTotales/(double)totalPositivo;
        double promedioNegativo = (double)numNegativosTotales/(double)totalNegativo;

        if (numPositivosTotales==0) {
            System.out.println("No se puede realizar el promedio.");
        } else {
            System.out.println("El promedio de los numeros positivos fue de: " + promedioPositivo);
        }
        if (numNegativosTotales==0) { 
            System.out.println("No se puede realizar el promedio.");
        } else {
            System.out.println("El promedio de los numeros negativos fue de: " + promedioNegativo);
        }
        if (totalCeros==0) {
            System.out.println("No se ingreso ningun cero.");
        } else {
            System.out.println("El total de ceros ingresados fue de: " + totalCeros);
        }
        sc.close();
    }
}
