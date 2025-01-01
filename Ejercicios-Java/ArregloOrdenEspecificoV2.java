/*
 * Imprimir numeros en un arreglo en determinado orden
 * 
 * Guardar 10 numeros en un arreglo y al final mostrarlos en pantalla en el siguiente orden
 * El primero
 * El ultimo
 * El segundo
 * El penultimo
 * El tercero
 * etc...
 * En esta version se realizara haciendo uso de ventanas emergentes
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class ArregloOrdenEspecificoV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros[] = new int[10];

        for(int i=0; i<numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el No." + (i+1)));
        }
        StringBuilder mensaje = new StringBuilder("Orden realizado con los numeros ingresados:");
        for(int i=0; i<5; i++) {
            mensaje.append("\n").append(numeros[i]).append("\n").append(numeros[9-i]);
        }
        JOptionPane.showMessageDialog(null, mensaje);

        scanner.close();
    }
}
