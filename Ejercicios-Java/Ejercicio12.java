// De 5 alumnos saber cuales reprobaron. Usando ventanas emergentes.
import javax.swing.JOptionPane;;
public class Ejercicio12 {
    public static void main(String[] args) {

        int contador = 0;
        contador=Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas alumnos desea ingresar?"));

        int reprobados = 0;
        int calificacion[] = new int[contador];
        String alumnos[] = new String[contador];

        for(int i=0; i<contador; i++) {
            alumnos[i]=JOptionPane.showInputDialog("Alumno No. " + (i+1) + ". Ingrese su nombre: ");
            calificacion[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nota calificacion: "));

            if (calificacion[i]<70 && calificacion[i]>0) {
                reprobados++;
            } else if (calificacion[i] < 0 || calificacion[i] > 100) {
                JOptionPane.showMessageDialog(null, "La calificación debe estar entre 0 y 100.");
                break;
            }
        }
        if (reprobados==0) {
            JOptionPane.showMessageDialog(null, "No hay alumnos reprobados.");
        } else {
            StringBuilder mensaje = new StringBuilder("Alumnos reprobados:\n");
            for (int i = 0; i < contador; i++) {
                if (calificacion[i] < 70) {
                    mensaje.append("- ").append(alumnos[i]).append(". Calificacion: ").append(calificacion[i]).append("\n");
                }
            }
            JOptionPane.showMessageDialog(null, mensaje.toString());
        }
    }
}