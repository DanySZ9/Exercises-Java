// Ejercicio No.11
// Introducir N sueldos y al final mostrar el sueldo mayor
// Realizarlo con JOptionPane
import javax.swing.JOptionPane;
public class SueldosMayor {
    public static void main(String[] args) {
        int cantidadSueldos = 0;
        int sueldo = 0;
        int sueldoMaximo = 0;
        boolean primerSueldo = false;

        /*
         * Converciona el comando de JOptionPane de String a Int para que el valor que se introduzca sea de valor numerico
         * para la variable de las cantidades de sueldos que se desean ingresar
         */
        cantidadSueldos=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos sueldos desea ingresar?"));
        for(int i =1; i<=cantidadSueldos; i++) {
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo No. " + i));   // Converciona de String a Int para la variable de sueldo
            if(primerSueldo==false) {
                sueldoMaximo = sueldo;
                primerSueldo =true;
            }
            if (sueldo>sueldoMaximo) {
                sueldoMaximo = sueldo;
            }
        }
        JOptionPane.showMessageDialog(null, "El sueldo mayor es: " + sueldoMaximo);   // Se muestra un mensaje donde se muestra el sueldo mayor de todos los ingresados
    }   
}