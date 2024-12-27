import java.util.Scanner;

public class EjercicioExtra1 {
    public static void main(String [] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Agregue un numero del 1 al 10:");
        int multiplo = entrada.nextInt();
        System.out.println("~~~~~~~~~~");

        for(int i=1; i<=100; i++) {
            if (multiplo <= 10 ) {
                if (i%multiplo==0) {
                    System.out.println(i);
                }
            } else {
                i = 100;
                System.out.println("No cumple con la condicion mencionada.");
            }
        }

        entrada.close();
    }
}