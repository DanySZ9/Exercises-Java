import java.util.Scanner;
import javax.swing.JOptionPane;
public class OrdenInversov2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos numeros desea ingresar?"));
        StringBuilder instruccion = new StringBuilder("Ingrese los numeros: ");

        int numeros[] = new int[cantidad];

        for(int i=0; i<cantidad; i++) {
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog(instruccion));
        }
        StringBuilder mensaje = new StringBuilder("Numeros invertidos:\n");
        for (int i = cantidad - 1; i >= 0; i--) {
            mensaje.append("- ").append(numeros[i]).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje);
        scanner.close();        
    }
}