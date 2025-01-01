// Ejercicio No.9
// Crear un programa para la gestion de facturas de una empresa que se dedica a la venta de azucar por kilos
// En cada factura se ingresara el codigo del producto vendido
// Ademas se ingresara la cantidad de kilos vendida y el total a pagar por kilos
// De 5 facturas introducidas, se pide:
// Facturacion total, cantidad de kilos vendidas y cuantas facturas fueron emitidas por mas de $1000.

import java.util.Scanner;
public class Facturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Es recomendable inicializar las variables
        String codigoProducto = "";
        float precio= 0, facturacionTotal = 0, importeFactura = 0;
        int kilos = 0, totalKilos = 0, importeMayor=0;

        for(int i=0; i<5; i++) {
            System.out.println("Ingrese el codigo del producto: ");
            codigoProducto = sc.nextLine();
            System.out.println("Ingrese la precio del producto por kilo: ");
            precio = sc.nextFloat();
            System.out.println("Ingrese la cantidad de kilos que desea comprar: ");
            kilos = sc.nextInt();
            
            sc.nextLine();  //  Limpia el buffer antes de pedir un String

            importeFactura = precio * (float)kilos;
            if (importeFactura>=1000) {
                importeMayor++;
            }
            facturacionTotal = facturacionTotal + importeFactura;
            totalKilos = totalKilos + kilos;
        }

        System.out.println("Detalles de la venta:");
        System.out.println("Facturacion Total: " + facturacionTotal);
        System.out.println("Kilos totales vendidos: " + totalKilos);
        System.out.println("Total de facturas emitidas por mas de $1000: " + importeMayor);

        sc.close();
    }
}