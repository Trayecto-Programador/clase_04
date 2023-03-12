/**
 * Una tienda ofrece un descuento del 15% sobre el total de la compra 
 * y un cliente desea saber cuánto deberá pagar finalmente por su compra.
 */
package actividad04;

import javax.swing.JOptionPane;


public class Actividad04 {

    
    public static void main(String[] args) {
        // 1 - Analisis
        
        //* Proposito: Determinar el Importe total Abonar de una compra.
        //* PreCondiciones: Se efectuará  un descuento al importe Total .
        
        
// 2 - Estrategia de solucion
        /** 
         * Solicitar el ingreso del importe de la compra
         * Calcular el importe de la compra con el descuento.
         */
        
        
// 3 - Implementacion
        
        // Definir variables
         double importeCompra, porcentajeDescuento, descuento, total;
         
        // Asignar los datos de entrada en las variables
        importeCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el importe de la compra"));
        porcentajeDescuento = 0.15;
        descuento = 0;
        total = 0;
        
        //Proceso de resolucion
        
        descuento = importeCompra * porcentajeDescuento;
        total = importeCompra - descuento;
       

        
        
// 4- Etapa Prueba 
// Prueba 1: ImporteCompra 1000 <---850--->
// Prueba 2: Importe Compra 10 <---8.50 --->
System.out.println("El importe total es de: $ "+total);

    }
    
}
