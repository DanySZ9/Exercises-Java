// Ejercicio No.10
// Introducir notas de 6 alumnos y saber cuantos aprobaron y reprobaron
import java.util.Scanner;
public class AprobadosReprobados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nombres[] = new String[6];
        int aprobados = 0, reprobados = 0, excelente = 0;
        int calificacion = 0;

        for(int i=0; i<6; i++) {
            System.out.println("Alumno No." + (i+1));
            System.out.print("Ingrese su nombre: ");
            nombres[i] = scanner.nextLine();
            System.out.print("Ingrese la nota obtenida: ");
            calificacion = scanner.nextInt();
            scanner.nextLine();

            if (calificacion==100) {
                excelente++;
            } else if (calificacion>=70 && calificacion<=100) {
                aprobados++;
            } else if(calificacion>100) {
                System.out.println("Calificacion maxima: 100");
            } else {
                reprobados++;
            }
        }
        // Agregue una lista de los nombres de cada uno de los alumnos
        System.out.println("");
        System.out.println("Lista de alumnos: ");
        for(String nombre : nombres) {
            System.out.println("- " + nombre);
        }
        System.out.println("");
        if (aprobados==0) {
            System.out.println("Ningun alumno aprobo.");
        } else {
            System.out.println("Aprobados: " + aprobados);   // Numero de alumnos aprobados
        }
        if (reprobados==0) {
            System.out.println("Ningun alumno reprobo.");
        } else {
            System.out.println("Reprobados: " + reprobados);   // Numero de alumnos reprobados
        }
        if (excelente!=0) {
            System.out.println("Calificacion Perfecta: " + excelente);
        }
        scanner.close();
    }    
}