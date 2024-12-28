// Introducir N sueldos y al final mostrar el sueldo mayor
// Realizarlo con JOptionPane
import javax.swing.JOptionPane;
public class Ejercicio11 {
    public static void main(String[] args) {
        int cantidadSueldos = 0;
        int sueldo = 0;
        int sueldoMaximo = 0;
        boolean primerSueldo = false;

        cantidadSueldos=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos sueldos desea ingresar?"));
        for(int i =1; i<=cantidadSueldos; i++) {
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo No. " + i));
            if(primerSueldo==false) {
                sueldoMaximo = sueldo;
                primerSueldo =true;
            }
            if (sueldo>sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
        }
        JOptionPane.showMessageDialog(null, "El sueldo mayor es: " + sueldoMaximo);
    }   
}